public class Persona {
    private long id;
    private String nombre;
    private String apellido;
    private Cuenta numeroCuenta;
    private long dni;

    public Persona() {
    }

    public Persona(long id, String nombre, String apellido, Cuenta numeroCuenta, long dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Cuenta numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void asociarCuenta(Cuenta cuenta) {
        this.numeroCuenta = cuenta;
    }
    @Override
    public String toString() {
        return "Persona:" +
                "\nid: " + id +
                "\nnombre: " + nombre +
                "\napellido: " + apellido +
                "\nnumeroCuenta: " + numeroCuenta +
                "\ndni: " + dni;
    }
}
