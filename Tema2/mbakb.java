import java.util.Scanner;

public class mbakb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mb;
        double kb;

        System.out.println("introduzca la cantidad de mb:");
        mb = input.nextDouble();

        kb = mb * 1024;

        System.out.println(mb + "Mb equivalen a " + kb + " Kb.");
    }
}
