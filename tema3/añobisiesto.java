import java.util.Sacnner;

public class añobisiesto {
   public static void main(String[] args {
    Scanner scanner = new Scanner(System.in);

    System.out.print("introdyce un año: ");
    int año = scanner .nextInt();

    // estructura condicional para comprobar las reglas del año bisiesto
    if ((año %4 == 0 && año % 100 !=0 || (año %400 ==o)) {
        System.out.printm("El año " + año + " no es bisiesto."); 
    }

    scanner.close();
}
}