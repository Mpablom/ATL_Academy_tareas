import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uploadAge = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        Integer ageHuman = uploadAge.nextInt();
        Integer ageDog = ageHuman*7;
        System.out.println("Usted tiene "+ageDog+" años en edad perro.");
    }
}