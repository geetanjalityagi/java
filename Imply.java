class Imply{

    String name;
    int age;

    Imply(){
        name = "abc";
        age = 24;
    }

    Imply(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        Imply obj1 = new Imply();
        Imply obj2 = new Imply("abc", 23);
        
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}


