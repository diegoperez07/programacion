import java.util.Random;

public class CartaAleatoria {
    public static void main(String[] args) {
        // Definimos los palos de la baraja francesa
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        
        // Definimos los valores de las cartas (numerales y literales)
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();

        // Elegimos un índice aleatorio para el palo (de 0 a 3)
        int indicePalo = random.nextInt(palos.length);
        
        // Elegimos un índice aleatorio para el valor (de 0 a 12)
        int indiceValor = random.nextInt(valores.length);

        // Mostramos la carta seleccionada
        System.out.println("Carta aleatoria: " + valores[indiceValor] + " de " + palos[indicePalo]);
    }
}