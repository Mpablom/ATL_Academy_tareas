import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Cuenta {
    /*
    El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
    mostrar(): Muestra los datos de la cuenta.
    */
    private int numeroCuenta;
    private float cantidad;
    private Persona titular;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, float cantidad, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        this.cantidad = cantidad;
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void establecerTitular(Persona persona) {
        this.titular = persona;
    }

    public float ingresar(float cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Ingreso: $" + cantidad);
            System.out.println("El total de su cuenta es de: $" + this.cantidad);
        }
        return this.cantidad;
    }

    public float retirar(float cantidad) {
        if (cantidad > 0) {
            this.cantidad -= cantidad;
            System.out.println("Retiro: $" + cantidad);
        }

        System.out.println("Tiene un saldo de: $"+this.cantidad);
        if (this.cantidad <= 0) {
            System.out.println("La cuenta está en números rojos!");
        }
        return this.cantidad;
    }
    public String mostrar(Cuenta cuenta){
        return cuenta.toString();
    }
    @Override
    public String toString() {
        return "Cuenta: " +
                "\nnumeroCuenta: " + numeroCuenta +
                "\ncantidad: $" + cantidad +
                "\ntitular: " + titular.getNombre() + " " + titular.getApellido();
    }
}