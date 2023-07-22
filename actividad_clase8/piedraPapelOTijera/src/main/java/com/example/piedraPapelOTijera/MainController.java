package com.example.piedraPapelOTijera;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/piedra-papel-tijera/{eleccionDeUsuario}")
    public String juegoPiedraPapelOTijera(@PathVariable String eleccionDeUsuario){
        String eleccionDeMaquina = eleccionMaquina();
        String resultado = resultadosPartidas(eleccionDeUsuario,eleccionDeMaquina);

        return resultado;
    }
    public String eleccionMaquina(){
        int maquina = (int) Math.floor((Math.random()*3)+1);
        String eleccionmaquina = "";
        if (maquina == 1 ){
            eleccionmaquina = "Piedra";
            return eleccionmaquina;
        }else if(maquina == 2){
            eleccionmaquina = "Papel";
            return eleccionmaquina;
        }else{
            eleccionmaquina = "Tijera";
            return eleccionmaquina;
        }
    }
    public String resultadosPartidas(String eleccionDeUsuario, String eleccionDeMaquina){
        String resultado="";

        if (eleccionDeMaquina.equalsIgnoreCase(eleccionDeUsuario)) {
            resultado = "Empate! ambos eligieron " + eleccionDeMaquina;
        } else {
            switch (eleccionDeUsuario.toLowerCase()) {
                case "piedra":
                    resultado = eleccionDeMaquina.equalsIgnoreCase("Tijera")
                            ? "Elegiste Piedra y la maquina eligió Tijera. ¡Feliciades ha Ganado!"
                            : (eleccionDeMaquina.equalsIgnoreCase("Papel")
                            ? "Elegiste Piedra y la maquina eligió Papel. Lo siento, has perdido."
                            : "Elección no válida.");
                    break;
                case "papel":
                    resultado = eleccionDeMaquina.equalsIgnoreCase("Tijera")
                            ? "Elegiste Papel y la maquina eligió Tijera. Lo siento, has perdido."
                            : (eleccionDeMaquina.equalsIgnoreCase("Piedra")
                            ? "Elegiste Papel y la maquina eligió Piedra. ¡Felicidades, has Ganado!"
                            : "Elección no válida.");
                    break;
                case "tijera":
                    resultado = eleccionDeMaquina.equalsIgnoreCase("Papel")
                            ? "Elegiste Tijera y la maquina eligió Papel. ¡Felicidades, has ganado!"
                            : (eleccionDeMaquina.equalsIgnoreCase("Piedra")
                            ? "Elegiste Tijera y la maquina eligió Piedra. Lo siento, has perdido."
                            : "Elección no válida.");
                    break;
                default:
                    resultado = "Elección no válida.";
            }
        }

        return resultado;
    }

}