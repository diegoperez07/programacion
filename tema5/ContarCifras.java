import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        long num = sc.nextLong();
        int cifras = 0;

        if (num == 0) {
            cifras = 1;
        } else {
            long temp = num;
            while (temp > 0) {
                temp /= 10;
                cifras++;
            }
        }

        System.out.println("El número tiene " + cifras + " cifras.");
        sc.close();
    }
}