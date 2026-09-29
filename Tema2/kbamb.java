import java.util.Scanner;

public class kbamb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mb;
        double kb;

        System.out.println("introduzca la cantidad de kb:");
        kb = input.nextDouble();

        mb = kb / 1024;

        System.out.println(kb + "Kb equivalen a " + mb + " Mb.");
    }
}
