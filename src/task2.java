class task2 {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = 3;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Amount is positive");
        }
        else
            System.out.println("Amount is negative");
    }
}
