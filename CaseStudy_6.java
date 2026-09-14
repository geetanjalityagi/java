class CaseStudy_6{
    int id;
    String name;
    int age;
    float temp;

    CaseStudy_6(int id, String name, int age, float temp){
        this.id = id;
        this.name = name;
        this.age = age;
        this.temp = temp;
    }

    void display(){
        System.out.println("Patient ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Temperature : " + temp);

        if(temp > 100.4f){
            System.out.println("Fever");
        }
        else{
            System.out.println("Normal");
        }
    }

    public static void main(String[] args){
        CaseStudy_6 obj = new CaseStudy_6(23, "abc", 43, 105.4f);
        obj.display();
    }
}