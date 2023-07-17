
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n" +
                " Elige una opción:");
        int eleccion1 = teclado.nextInt();
        if (eleccion1 == 1){
            System.out.println("Intrigado por el susurro escalofriante, decides aventurarte en la oscuridad del bosque en busca de su origen. El susurro parece fluctuar, llevándote más profundo en el misterioso bosque. A medida que avanzas, los árboles se ciernen sobre ti, sus ramas crujen en la brisa nocturna y las sombras parecen cobrar vida a tu alrededor.\n" +
                    "\n" +
                    "Percibes que el susurro proviene de una pequeña hendidura entre las rocas. Te agachas y te deslizas con cuidado hacia el interior, y descubres una cueva oculta. El susurro se intensifica, como si una fuerza misteriosa te atrajera más profundamente en su interior.\n" +
                    "\n" +
                    "Dentro de la cueva, encuentras un resplandor tenue que proviene de una extraña piedra brillante en el centro de la cámara. Al acercarte, la piedra comienza a emitir un resplandor más intenso y cálido, revelando maravillosos símbolos tallados en su superficie.\n" +
                    "\n" +
                    "Sientes una energía inexplicable que emana de la piedra, y te das cuenta de que tienes una elección crucial que hacer:v \n" +
                    "1)Decides tocar la piedra y desvelar su misterio.\n" +
                    "2)Optas por dar media vuelta y abandonar la cueva, sintiendo que no debes interferir con lo desconocido.");
            int eleccion2 = teclado.nextInt();
            if (eleccion2 == 1 ){
                System.out.println("Exploras el bosque en busca del susurro y encuentras una cueva con una piedra brillante. Al tocarla, desatas una maldición que te convierte en el guardián eterno de la cueva, compartiendo la misma tragedia que atrae a otros hacia su destino fatal.");
            }else{
                System.out.println("Optas por no interferir con lo desconocido y abandonas la cueva. Te sientes aliviado al alejarte y regresas al sendero iluminado. Con el tiempo, aplicas la sabiduría adquirida para mejorar tu vida y la de los demás, encontrando un camino más sabio y compasivo.");
            }
        }else{
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha");
            int eleccion3 = teclado.nextInt();
            if (eleccion3 == 1 ){
                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
            }else{
                System.out.println("Al elegir la puerta de la derecha, caes en una trampa oculta y quedas atrapado en un pozo profundo. Nadie viene a rescatarte, y te conviertes en una sombra olvidada en el misterioso bosque, destinado a desvanecerte en la oscuridad.");
            }
        }
    }
}