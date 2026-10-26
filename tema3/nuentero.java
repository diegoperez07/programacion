import java.util.Scanner;

public class nuentero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
        int n = Integer.parseInt(s.nextLine());
        
        boolean capicua = false;
        
        if (n < 0 || n > 99999) {
            System.out.println("El número debe estar entre 0 y 99999.");
        } else {
            // Número de 1 cifra
            if (n < 10) {
                capicua = true;
            }
            // Número de 2 cifras
            else if (n < 100) {
                if (n / 10 == n % 10) {
                    capicua = true;
                }
            }
            // Número de 3 cifras
            else if (n < 1000) {
                if (n / 100 == n % 10) {
                    capicua = true;
                }
            }
            // Número de 4 cifras
            else if (n < 10000) {
                if ((n / 1000 == n % 10) && ((n / 100) % 10 == (n / 10) % 10)) {
                    capicua = true;
                }
            }
            // Número de 5 cifras
            else {
                if ((n / 10000 == n % 10) && ((n / 1000) % 10 == (n / 100) % 10)) {
                    capicua = true;
                }
            }
            
            if (capicua) {
                System.out.println("El número " + n + " es capicúa.");
            } else {
                System.out.println("El número " + n + " no es capicúa.");
            }
        }
    }
}