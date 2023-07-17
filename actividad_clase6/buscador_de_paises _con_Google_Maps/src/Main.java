import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del pais que deseas buscar en Google Maps");
        String pais = teclado.next();
        String buscador = "https://www.google.com/maps/search/"+pais;
        System.out.println("has click en: "+buscador+" para ir al país buscado");
    }
}