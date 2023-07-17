import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uploadMillas = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas:");
        double millas = uploadMillas.nextDouble();
        double millasAKilometros = millas * 1.60934;
        System.out.println("Las millas ingresadas corresponden a "+millasAKilometros+" kilometros");
    }
}