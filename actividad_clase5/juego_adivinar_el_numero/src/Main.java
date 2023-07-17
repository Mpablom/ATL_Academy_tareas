import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner upload = new Scanner(System.in);
        int numeroTrivia =(int)(Math.random()*100)+1;
        int intentos= 3;
        boolean adivino = false;
        while (intentos>0){
            System.out.println("Ingresa un número entre 1 y 100:");
            int respuesta = upload.nextInt();
            if (adivino){
                System.out.println("Felicidades Adivino!!");
                intentos=0;
            } else if(intentos>1){
                System.out.println("Lo siento no es el número prueba otra vez");
            }
            intentos--;
        }
        System.out.println("Lo siento no pudiste adivinar el número era: "+numeroTrivia);
    }
}