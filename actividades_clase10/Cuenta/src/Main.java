import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona1 = new Persona(1, "Juan", "Pérez", null, 123456789);
        // Crear una cuenta y establecer el titular
        Cuenta cuenta1 = new Cuenta(123456, 0.0f, persona1);
        String mostrarCuenta = cuenta1.mostrar(cuenta1);
        System.out.println(mostrarCuenta);
        montoAIngresar(cuenta1);
        montoARetirar(cuenta1);
    }
    public static String montoAIngresar(Cuenta cuenta){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Coloque el monto que quiere ingresar a su cuenta:");
        float dineroAIngresar = teclado.nextFloat();
        String depositoCorrecto = "Usted ingresó correctamente: $"+cuenta.ingresar(dineroAIngresar);
        return depositoCorrecto;
    }
    public static String montoARetirar(Cuenta cuenta){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Coloque el monto que quiere retirar de su cuenta:");
        float dineroARetirar = teclado.nextFloat();
        String retiroCorrecto = "Usted ingresó correctamente: $"+cuenta.retirar(dineroARetirar);
        return retiroCorrecto;
    }
}