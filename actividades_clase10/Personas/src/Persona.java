import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Persona {
    private long id;
    private String nombre;
    private int edad;
    private LocalDate fechaDeNacimiento;
    private long dni;

    public Persona() {
    }

    public Persona(long id, String nombre, int edad, LocalDate fechaDeNacimiento, long dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", dni=" + dni +
                '}';
    }
    public String mostrar(Persona persona){
        return persona.toString();
    }
    public String esMayorDeEdad(Persona persona){
        if (persona.getEdad()>=18){
            String mayor = "Es mayor de edad";
            return mayor;
        }else{
            String menor = "Es menor de edad";
            return menor;
        }
    }
}
