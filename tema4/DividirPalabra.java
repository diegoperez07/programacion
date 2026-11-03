import java.util.Scanner;

public class DividirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        // Buscamos la posición de la primera 'a' o 'A'
        int indice = -1;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'A') {
                indice = i;
                break; // Encontramos la primera y salimos del bucle
            }
        }

        // Si se encontró la letra 'A', dividimos la palabra
        if (indice != -1) {
            String parte1 = palabra.substring(0, indice);       // Desde el inicio hasta antes de la 'A'
            String parte2 = palabra.substring(indice);          // Desde la 'A' hasta el final

            System.out.println("¡Letra 'A' encontrada en la posición " + (indice + 1) + "!");
            System.out.println("Primera parte: " + parte1);
            System.out.println("Segunda parte (desde la 'A'): " + parte2);
        } else {
            System.out.println("La palabra introducida no contiene ninguna letra 'A'.");
        }

        scanner.close();
    }
}