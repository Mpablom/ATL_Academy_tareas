public class Mago extends Personaje{
    private int porcentajeEnergia;

    public int getPorcentajeEnergia() {
        return porcentajeEnergia;
    }

    public Mago(String nombre) {
        super(nombre);
        this.porcentajeEnergia = 100;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "porcentajeEnergia=" + porcentajeEnergia +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                '}';
    }
}
