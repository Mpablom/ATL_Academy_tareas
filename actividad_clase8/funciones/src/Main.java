import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[] ladosCuadrado = setLadosCuadrado();
        float lado1 = ladosCuadrado[0];
        float lado2 = ladosCuadrado[1];
        System.out.println("El área del cuadrado es: "+getAreaCuadrado(lado1,lado2));
        float[] baseAlturaTriangulo = setBaseAlturaTriangulo();
        float base = baseAlturaTriangulo[0];
        float altura = baseAlturaTriangulo[1];
        System.out.println("El área del triángulo es: "+getAreaTriangulo(base,altura));
    };
    private static float[] setLadosCuadrado(){
        Scanner teclado = new Scanner(System.in);
        float[]lados = new float[2];
        System.out.println("Ingrese el primer lado del cuadrado: ");
        lados[0] = teclado.nextFloat();
        System.out.println("Ingrese el primer lado del cuadrado: ");
        lados[1] = teclado.nextFloat();
        return lados;
    }
    private static float getAreaCuadrado(float lado1, float lado2){
      return lado1*lado2;
    };
    private static float[] setBaseAlturaTriangulo(){
        Scanner teclado = new Scanner(System.in);
        float[] baseAltura = new float[2];
        System.out.println("Ingrese la base del triángulo: ");
        baseAltura[0] = teclado.nextFloat();
        System.out.println("Ingrese la altura del triángulo: ");
        baseAltura[1] = teclado.nextFloat();
        return baseAltura;
    }
    private static float getAreaTriangulo(float base, float altura){
        return (base*altura)/2;
    }
}