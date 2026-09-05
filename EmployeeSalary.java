class EmployeeSalary{
    int emp_id;
    String name;
    float salary;
    float hra;
    float da;


    EmployeeSalary(int emp_id, String name, float salary){
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    void cal_hra(float amount){
        hra = 0.2f*amount;
    }

    void cal_da(float amount){
        da = 0.1f*amount;
    }

    void display(){
        System.out.println("Employee ID : " + this.emp_id);
        System.out.println("Name : " + this.name);
        System.out.println("Gross Salary : " + (salary + hra + da));
    }

    public static void main(String[] args){
        EmployeeSalary obj = new EmployeeSalary(23, "abc", 6447.0f);
        obj.cal_hra(6447.0f);
        obj.cal_da(6447.0f);
        obj.display();
    }
}