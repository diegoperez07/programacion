public class Primos {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}