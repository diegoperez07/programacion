import java.util.Scanner;

public class horarioexacto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un día de la semana: ");
        String dia = s.nextLine().toLowerCase();
        
        String asignatura = "";
        
        switch (dia) {
            case "lunes":
                asignatura = "Programación";
                break;
            case "martes":
                asignatura = "Sistemas Informáticos";
                break;
            case "miércoles":
            case "miercoles":
                asignatura = "Bases de Datos";
                break;
            case "jueves":
                asignatura = "Programación";
                break;
            case "viernes":
                asignatura = "Entornos de Desarrollo";
                break;
            default:
                asignatura = "Día no válido o no laborable";
        }
        
        System.out.println("A primera hora del " + dia + " toca: " + asignatura);
    }
}