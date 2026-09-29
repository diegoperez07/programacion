import java.util.Scanner;

public class salariosemanal {

public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
       System.out.println("Introduzca el número de horas trabajadas");

   double horas = input.nextDouble();

    System.out.println("calculamos el salario semanal segun las horas que hayan trajado");
    System.out.println("=================================================================");

    double salario =horas * 12;

    System.out.println(" salario empleado es " + salario);

    input.close();
    }
}
