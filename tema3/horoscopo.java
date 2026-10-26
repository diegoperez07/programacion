import java.util.Scanner;

public class horoscopo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = Integer.parseInt(s.nextLine());
        
        System.out.print("Introduce el día del mes: ");
        int dia = Integer.parseInt(s.nextLine());
        
        String horoscopo = "";
        
        switch (mes) {
            case 1: // Enero
                horoscopo = (dia < 21) ? "Capricornio" : "Acuario";
                break;
            case 2: // Febrero
                horoscopo = (dia < 20) ? "Acuario" : "Piscis";
                break;
            case 3: // Marzo
                horoscopo = (dia < 21) ? "Piscis" : "Aries";
                break;
            case 4: // Abril
                horoscopo = (dia < 21) ? "Aries" : "Tauro";
                break;
            case 5: // Mayo
                horoscopo = (dia < 22) ? "Tauro" : "Géminis";
                break;
            case 6: // Junio
                horoscopo = (dia < 22) ? "Géminis" : "Cáncer";
                break;
            case 7: // Julio
                horoscopo = (dia < 23) ? "Cáncer" : "Leo";
                break;
            case 8: // Agosto
                horoscopo = (dia < 24) ? "Leo" : "Virgo";
                break;
            case 9: // Septiembre
                horoscopo = (dia < 23) ? "Virgo" : "Libra";
                break;
            case 10: // Octubre
                horoscopo = (dia < 23) ? "Libra" : "Escorpio";
                break;
            case 11: // Noviembre
                horoscopo = (dia < 23) ? "Escorpio" : "Sagitario";
                break;
            case 12: // Diciembre
                horoscopo = (dia < 22) ? "Sagitario" : "Capricornio";
                break;
            default:
                horoscopo = "Mes no válido";
        }
        
        System.out.println("Tu horóscopo es: " + horoscopo);
    }
}