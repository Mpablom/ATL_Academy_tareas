import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Escribe un programa que permita al usuario jugar el juego clásico
         de "piedra, papel, tijeras" contra la computadora.
         El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
          y luego generar una elección aleatoria para la computadora.
          Después de eso, el programa debe determinar el ganador
          según las reglas del juego y mostrar el resultado.*/
        Scanner teclado = new Scanner(System.in);
        int puntosUsuario = 0;
        int puntosMaquina = 0;
        while (puntosMaquina<3 && puntosUsuario<3){
            System.out.println("Ingrese:\n"+
                    "1) Piedra.\n"+
                    "2) Papel.\n"+
                    "3) Tijera.");
            int usuario = teclado.nextInt();
            int maquina = (int) Math.floor((Math.random()*3)+1);
            System.out.println(maquina);
            if (usuario == maquina){
                System.out.println("Empate! no hay puntos para nadie");
            }
            if(usuario == 1 && maquina == 3){
                System.out.println("Elegiste piedra y la maquina tijera, has ganado!");
                puntosUsuario++;
            }else if(usuario==1&&maquina==2){
                System.out.println("Elegiste piedra y la maquina papel, ha ganado la maquina!");
                puntosMaquina++;
            }
            if(usuario == 2 && maquina == 3){
                System.out.println("Elegiste papel y la maquina tijera, ha ganado la maquina!");
                puntosMaquina++;
            }else if(usuario==2 && maquina==1){
                System.out.println("Elegiste papel y la maquina piedra, has ganado!");
                puntosUsuario++;
            }
            if(usuario == 3 && maquina == 2){
                System.out.println("Elegiste tijera y la maquina papel, has ganado!");
                puntosUsuario++;
            }else if(usuario==3 && maquina==1){
                System.out.println("Elegiste tijera y la maquina piedra, ha ganado la maquina!");
                puntosMaquina++;
            }
        }
        System.out.println("El juego ha terminado! El resultado final fue:\n"+
                "maquina: "+puntosMaquina+"\n"+"usuario: "+puntosUsuario);

    }
}