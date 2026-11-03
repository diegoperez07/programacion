import java.util.Random;

public class LetrasAleatorias {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder mayusculas = new StringBuilder();
        StringBuilder minusculas = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            // Genera una letra aleatoria entre 'A' y 'Z'
            char letraMayus = (char) (random.nextInt(26) + 'A');
            char letraMinus = Character.toLowerCase(letraMayus);

            mayusculas.append(letraMayus);
            minusculas.append(letraMinus);
        }

        // Mostramos los resultados
        System.out.println("Caracteres en mayúsculas: " + mayusculas.toString());
        System.out.println("Caracteres en minúsculas: " + minusculas.toString());
    }
}