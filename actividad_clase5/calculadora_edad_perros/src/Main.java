import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner charge = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro");
        Integer ageDog = charge.nextInt();
        Integer ageHuman = ageDog*7;
        System.out.println("Su perro tiene "+ageHuman+" años de humano");
    }
}