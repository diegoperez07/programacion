import java.util.Scanner;

public class volumencono {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura;
        double radio;
        double areaCono;
       
        System.out.println(".(introduzca la altura del cono del cono)");

        altura = input.nextDouble();

        System.out.println("introduzca el radio del cono");
        radio = input.nextDouble();

        areaCono = (1.0 / 3.0) * Math.PI *Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cono es: " + areaCono);
    }
}