import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[5];
        int contador=0;
        int menor = 0;
        int mayor = 0;
        for (int i = 0; i<5;i++){
            System.out.println("Ingrese un número");
            int numero = teclado.nextInt();
            numeros[i] = numero;
            if (numero >= mayor || i == 0){
                mayor = numero;
            }
            if(numero <= menor || i == 0){
                menor = numero;
            }
            contador++;
        }

        System.out.println("Los número que ingresaste son: ");
        int sumatoria = 0;
        for (int numero : numeros) {
            System.out.println(numero);
            sumatoria += numero;
        }
        float promedio = (float) sumatoria / numeros.length;
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("\nLa suma de todos los números es: "+sumatoria);
        System.out.println("El promedio es: "+promedio);
        /*
           Scanner teclado = new Scanner(System.in);

           int numeros[] = new int[5];

          System.out.println("Ingrese 5 números:");  <------ Pide que ingrese los 5 numeros

        IntStream.range(0, 5)                        <------ Genera un rango de enteros que va de 0 a 4 para usarlos de indices

                .forEach(i -> {                      <------ En este caso, para cada valor i dentro del rango especificado, se ejecutará el bloque de código entre las llaves

                    System.out.print("Número " + (i + 1) + ": ");     <----- Esta línea muestra un mensaje en la consola que solicita al usuario ingresar un número. i + 1 se utiliza para mostrar el número de orden del valor que se está solicitando (1 para el primer número, 2 para el segundo, etc.).

                    numeros[i] = teclado.nextInt();                   <------ sta línea lee el número ingresado por el usuario desde la entrada estándar (consola) utilizando el objeto teclado de tipo Scanner, y lo asigna al array numeros en la posición i. En otras palabras, cada número ingresado por el usuario se almacena en el array numeros en la posición correspondiente según el índice i.

                });



        Arrays.stream(numeros).forEach(System.out::println);  <----- imprimir cada número con stream

        int menor = Arrays.stream(numeros).min().getAsInt();  <----- encuentra el numero mas chico del array y lo devuelve como entero

        int mayor = Arrays.stream(numeros).max().getAsInt();  <----- encuentra el numero mas grande del array y lo devuelve como entero

        int suma = Arrays.stream(numeros).sum();              <----- suma los elementos de un array

        int promedio = Arrays.stream(numeros).sum()/ numeros.length;      <----- promedio de los numeros de un array

        System.out.println("\nLA SUMA ES "+suma);             <----- imprime la suma

        System.out.println("\nel numero menor es "+menor);    <-----  imprime el menor

        System.out.println("\nel numero mayor es "+mayor);    <-----  imprime el mayor

        System.out.println("El promedio es: "+promedio);      <-----  imprime el promedio

        */
    }
}