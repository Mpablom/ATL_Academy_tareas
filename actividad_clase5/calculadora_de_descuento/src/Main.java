import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uploadPrice = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        double precio = uploadPrice.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = uploadPrice.nextDouble();
        double precioFinal = precio -(precio*descuento/100);
        System.out.println("El precio final del producto es de: $"+precioFinal);
    }
}