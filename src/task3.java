public class task3 {
    public static void main(String[] args) {
        printColor();
    }
    public static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value <= 100 && value > 0) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }
}
