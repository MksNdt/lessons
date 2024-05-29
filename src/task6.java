public class task6 {
    public static void main(String[] args) {
        printNumberSign(-5);
        printNumberSign(5);
        printNumberSign(0);
    }
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
