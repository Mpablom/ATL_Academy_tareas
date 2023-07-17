import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el Nombre de una celebridad(de una sola palabra):");
        String palabra = teclado.next();
        String buscador = "https://twitter.com/search?q=" + palabra;
        System.out.println("Haz click en "+buscador+" para ir ");
    }
}