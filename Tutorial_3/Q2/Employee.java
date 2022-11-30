package Tutorial_3.Q2;

class Employee {
    String name;
    double Salary;
    public Employee() {
        this.name = "No-Name";
    }
    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }
    public String display(){
        return name + " - " + Salary;
    }
}

class Q2{
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ganindu",25000.00);

        System.out.println(e1.display());
        System.out.println(e2.display());
    }
}