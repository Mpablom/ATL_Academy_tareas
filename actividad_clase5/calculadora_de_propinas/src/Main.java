import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula:
        propina = totalCuenta * (porcentajePropina / 100).
        */
        Scanner upload = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta:");
        double cuenta = upload.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar:");
        double porcentajePropina = upload.nextDouble();
        double propina = cuenta * (porcentajePropina / 100);
        System.out.println("Su propina es de: "+propina);
    }
}