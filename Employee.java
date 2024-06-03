public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone,  int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Nadtochaev Maksim Nikolaevich", "director", "nadtochaev.maksim@gmail.com", "375336491778", 1000, 28);
        System.out.println(employee.fullName);
        System.out.println(employee.position);
        System.out.println(employee.email);
        System.out.println(employee.phone);
        System.out.println(employee.salary);
        System.out.println(employee.age);
    }
}

