public class Escalera3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            // Parte decreciente
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Parte creciente
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}