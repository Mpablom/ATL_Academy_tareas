public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntosDeVida = 100;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre());
        // Implementar la lógica para calcular el daño y aplicarlo al objetivo
    }

    public void recibirDanio(int cantidadDanio) {
        puntosDeVida -= cantidadDanio;
        System.out.println(nombre + " recibe " + cantidadDanio + " puntos de daño.");
        if (puntosDeVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public void curarse(int cantidadCura) {
        puntosDeVida += cantidadCura;
        System.out.println(nombre + " se cura " + cantidadCura + " puntos de vida.");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }


}
