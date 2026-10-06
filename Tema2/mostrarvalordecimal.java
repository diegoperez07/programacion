import java.util.Scanner;

public class mostrarvalordecimal {

    public static void main (String] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero binario (máximo 8 cifras): ");
        String binario = scanner .nexLine();
        
        //convertimos el texto binario a un numero entero decimal
        int decimal = integer.parseInt(binario, 2);

        System.out.println();"el valor en decimal es: " + decimal);

        scanner.close();
    }

}
