import java.util.Scanner;

public class MatrizNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}