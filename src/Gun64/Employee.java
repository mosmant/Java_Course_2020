package Gun64;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
      this("joe", true, 100);
    }

    public Employee(String name, boolean contract, double salary) {
        this.name = name;
        this.contract = contract;
        this.salary = salary;
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;

    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // line n2
        System.out.println(e);
    }
}
