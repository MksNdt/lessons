public class task9 {
    public static boolean ВисокосныйГод(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(ВисокосныйГод(2076));  // true
        System.out.println(ВисокосныйГод(2100));  // false
        System.out.println(ВисокосныйГод(2350));  // false
        System.out.println(ВисокосныйГод(2000));  // true
    }
}