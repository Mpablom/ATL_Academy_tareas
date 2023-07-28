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
        Mago maguito = new Mago("Mago");
        System.out.println(maguito);
    }
}