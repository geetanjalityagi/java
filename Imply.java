// class hello{
//     int a, b, res;

//     void sum(){
//         a = 5;
//         b = 6;
//         res = a + b;

//         System.out.println("Sum = "+res);

//     }
// }

// public static void main(String arg[]){
//     hello obj = new hello();
//     hello obj2 = new hello();

//     obj.sum();
//     obj2.sum();
// }


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


