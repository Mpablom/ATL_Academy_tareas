import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número que quieres marcar sin espacios por ej: 5493541539405");
        long telefono = teclado.nextLong();
        String llamar = "https://api.whatsapp.com/send?phone=" + telefono;
        System.out.println("Haz click en "+llamar+" para llamar");
    }
}