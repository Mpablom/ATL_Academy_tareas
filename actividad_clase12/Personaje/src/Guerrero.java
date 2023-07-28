public class Guerrero extends Personaje{
    private int fuerzaAtaque;

    public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public Guerrero(String nombre, int fuerzaAtaque) {
        super(nombre);
        this.fuerzaAtaque = 100;
    }
}
