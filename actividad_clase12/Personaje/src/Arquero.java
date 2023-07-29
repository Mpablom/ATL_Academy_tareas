public class Arquero extends Personaje{
    private int porcentajePrecision;

    public int getPorcentajePrecision() {
        return porcentajePrecision;
    }

    public void setPorcentajePrecision(int porcentajePrecision) {
        this.porcentajePrecision = porcentajePrecision;
    }

    public Arquero(String nombre, int porcentajePrecision) {
        super(nombre);
        this.porcentajePrecision = porcentajePrecision;
    }

    @Override
    public String toString() {
        return "Arquero:" +
                " nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida;
    }
}
