import java.util.Scanner;

public class Circulo extends Figura{
    private float radio;
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float calcularArea(){
        float pi = (float)Math.PI;
        return (float)pi*(radio*radio);
    }
    public void cargarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio en cm:");
        radio = teclado.nextFloat();
    }
}
