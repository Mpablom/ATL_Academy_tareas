import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Persona persona1 = new Persona(1,"Pablo",35,LocalDate.of(1987, 12, 25),12345678);
       String datosPersona = persona1.mostrar(persona1);
       System.out.println(datosPersona);
       String edad = persona1.esMayorDeEdad(persona1);
        System.out.println(edad);
    }
}