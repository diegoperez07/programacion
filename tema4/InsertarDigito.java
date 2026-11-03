import java.util.Scanner;

public class InsertarDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = scanner.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = scanner.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito = scanner.nextInt();

        // 2. Convertimos el número a String para manipularlo fácilmente
        String numStr = Long.toString(numero);

        // 3. Insertamos el dígito en la posición indicada (restando 1 porque los índices empiezan en 0)
        // substring(0, posicion - 1) coge la parte anterior
        // substring(posicion - 1) coge la parte posterior
        String resultadoStr = numStr.substring(0, posicion - 1) + digito + numStr.substring(posicion - 1);

        // 4. Volvemos a convertir el resultado a tipo long
        long resultado = Long.parseLong(resultadoStr);

        // 5. Mostramos el resultado final
        System.out.println("El número resultante es " + resultado);

        scanner.close();
    }
}