import java.util.Scanner;

public class notaprogramacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce la nota del primer control: ");
        double nota1 = Double.parseDouble(s.nextLine());
        
        System.out.print("Introduce la nota del segundo control: ");
        double nota2 = Double.parseDouble(s.nextLine());
        
        double media = (nota1 + nota2) / 2.0;
        
        if (media >= 5) {
            System.out.println("Tu nota de programación es " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = s.nextLine().trim().toLowerCase();
            
            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de programación es 5");
            } else {
                System.out.println("Tu nota de programación es " + media);
            }
        }
    }
}