public class Mago extends Personaje{
    private int porcentajeEnergia;

    public int getPorcentajeEnergia() {
        return porcentajeEnergia;
    }

    public Mago(String nombre, int porcentajeEnergia) {
        super(nombre);
        this.porcentajeEnergia = porcentajeEnergia;
    }

    @Override
    public String toString() {
        return "Mago:"+
                " nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida;
    }
}
