import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el primer número:");
        int numero1 = teclado.nextInt();
        System.out.println("Cargue el segundo número:");
        int numero2 = teclado.nextInt();
        System.out.println("Cargue el tercer número:");
        int numero3 = teclado.nextInt();
        if (numero1>numero2&&numero1>numero3){
            System.out.println("El número más grande es "+numero1);
        }else if(numero2>numero1&&numero2>numero3){
            System.out.println("El número mas grande es "+numero2);
        }else{
            System.out.println("El número mas grande es "+numero3);
        }
        float promedio = (numero1+numero2+numero3)/3;
        System.out.println("El promedio es: "+promedio);
        int resto1 = numero1%2;
        int resto2 = numero2%2;
        int resto3 = numero3%2;
        if (resto1 == 0){
            System.out.println(numero1+" es número par");
        }else{
            System.out.println(numero1+" es número impar");
        }
        if (resto2 == 0){
            System.out.println(numero2+" es número par");
        }else{
            System.out.println(numero2+" es número impar");
        }
        if (resto3 == 0){
            System.out.println(numero3+" es número par");
        }else{
            System.out.println(numero3+" es número impar");
        }
    }
}