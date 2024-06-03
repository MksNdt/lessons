public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Sergeev Sergey", "Web designer", "sergeev@mailbox.com", "892312313", 31000, 31);
        persArray[2] = new Person("Maksimov Maksim", "Software tester", "maksimov@mailbox.com", "892312314", 32000, 32);
        persArray[3] = new Person("Alekseev Aleksey", "System administrator", "alekseev@mailbox.com", "892312315", 33000, 33);
        persArray[4] = new Person("Denisov Denis", "Manager", "denisov@mailbox.com", "892312316", 34000, 34);
    }
}
