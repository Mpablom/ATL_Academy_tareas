import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] personas = {"Lucas Moy" , "Aldo Angelini" , "Julia Gomez" , "Manuel Santillan" , "Juan Torres"};

        System.out.println("Ingrese su busqueda:");
        String busqueda = teclado.nextLine().toLowerCase();

       for (String nombrePersona:personas){
           if (nombrePersona.toLowerCase().contains(busqueda)) {
               System.out.println("La persona escontrada es: " + nombrePersona);
           }
       }
    }
}