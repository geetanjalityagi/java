class Employee{
    String name;
    float salary;

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee{
    float bonus;

    Manager(String name, float salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void displayManager(){
        display();
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + (salary + bonus));
    }

    public static void main(String[] args){
        Employee e = new Employee("abc", 30000.0f);

        System.out.println("Employee Details");
        e.display();

        System.out.println();

        Manager m = new Manager("xyz", 50000.0f, 10000.0f);

        System.out.println("Manager Details");
        m.displayManager();
    }
}
