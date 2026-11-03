import java.util.Scanner;

public class GestionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        double max = -Double.MAX_VALUE;
        double min = Double.MAX_VALUE;

        // 1. Introducir las 5 notas desde el teclado
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];

            // Calcular máximo y mínimo
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }

        // 2. Mostrar los cálculos para cada nota
        System.out.println("\n--- ANÁLISIS DE CADA NOTA ---");
        for (int i = 0; i < 5; i++) {
            double n = notas[i];
            
            // Redondeo al alza con 1 decimal (ej: 5.12 -> 5.2)
            double alAlza = Math.ceil(n * 10.0) / 10.0;
            
            // Redondeo a la baja con 1 decimal (ej: 5.89 -> 5.8)
            double aLaBaja = Math.floor(n * 10.0) / 10.0;
            
            // Truncada en las unidades (quitar decimales, ej: 7.9 -> 7)
            int truncada = (int) n;

            System.out.println("Nota original: " + n);
            System.out.println("  -> Al alza (1 dec): " + alAlza);
            System.out.println("  -> A la baja (1 dec): " + aLaBaja);
            System.out.println("  -> Truncada (unidades): " + truncada);
            System.out.println("-----------------------------");
        }

        // 3. Mostrar la media, máximo y mínimo al final
        double media = suma / 5;
        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Nota media : " + media);
        System.out.println("Nota máxima: " + max);
        System.out.println("Nota mínima: " + min);

        scanner.close();
    }
}