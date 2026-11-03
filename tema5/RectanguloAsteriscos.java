import java.util.Scanner;

public class RectanguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}