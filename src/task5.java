class task5 {
    public static void main(String[] args) {
        System.out.println(isSumInRange(13, 15));
    }
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
