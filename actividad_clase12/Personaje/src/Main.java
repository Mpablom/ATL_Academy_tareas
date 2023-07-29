import java.util.AbstractQueue;

/*
    Luego, crea clases derivadas como "Guerrero",
    "Mago" y "Arquero", que hereden de la clase base y añadan atributos
    y métodos específicos para cada tipo de personaje.
    Por ejemplo, la clase "Guerrero" podría tener un atributo adicional para la fuerza de ataque,
    mientras que la clase "Mago" podría tener un método para lanzar hechizos.
    Crea instancias de los diferentes personajes y simula un combate entre ellos.
    Puedes añadir más funcionalidades al juego de rol, como habilidades especiales,
    armas, armaduras, y enemigos con los que los personajes pueden luchar.
*/
public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Conan",20);
        Mago mago = new Mago("Gandalf",30);
        Arquero arquero = new Arquero("Legolas",100);

        guerrero.atacar(mago);
        mago.recibirDanio(guerrero.getFuerzaAtaque());

        mago.atacar(arquero);
        arquero.recibirDanio(mago.getPorcentajeEnergia());

        arquero.atacar(guerrero);
        guerrero.recibirDanio(arquero.getPorcentajePrecision());

        arquero.atacar(mago);
        mago.recibirDanio(arquero.getPorcentajePrecision());

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
    }
}