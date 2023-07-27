import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static List<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal(){
        boolean mostrarMenu = true;
        do {
            System.out.println("************** MENU **************");
            System.out.println("1)-Crear Figura"+
                    "\n2)-Mostrar la sumatoria de área de todas las figuras"+
                    "\n0)-Salir");
            int respuestaUsuario = teclado.nextInt();
            switch (respuestaUsuario){
                case 1:
                    eleccionUsuario();
                    break;
                case 2:
                    mostrarSumatoriaFiguras();
                    break;
                case 0:
                    mostrarMenu = false;
                    break;
            }
        }while (mostrarMenu);
    }
    public static void eleccionUsuario(){
        System.out.println("Que figura desea crear: "+
                "\n1)-Círculo"+
                "\n2)-Rectangulo"+
                "\n3)-Triángulo");
        int respuestaUsuario = teclado.nextInt();
        float area = 0.00f;
        switch (respuestaUsuario) {
            case 1:
                Circulo circulo = new Circulo();
                circulo.cargarDatos();
                System.out.println("El área del circulo es de: " + circulo.calcularArea());
                figuras.add(circulo);
                break;
            case 2:
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.cargarDatos();
                System.out.println("El área del rectangulo es: " + rectangulo.calcularArea());
                figuras.add(rectangulo);
                break;
            case 3:
                Triangulo triangulo = new Triangulo();
                triangulo.cargarDatos();
                System.out.println("El área del triangulo es: " + triangulo.calcularArea());
                figuras.add(triangulo);
                break;
            default:
                System.out.println("No está permitida la opción seleccionada!!");
                break;
        }
    }
    public static void mostrarSumatoriaFiguras(){
        float sumatoriaAreas = 0f;
        for (Figura figura:figuras){
            sumatoriaAreas+= figura.calcularArea();
        }

        System.out.println("La sumatoria de todas las areas es: "+sumatoriaAreas+"cm");
    }

}