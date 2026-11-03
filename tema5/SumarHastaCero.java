import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;

        do {
            System.out.print("Introduce un número entero (0 para terminar): ");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("La suma final es: " + suma);
        sc.close();
    }
}