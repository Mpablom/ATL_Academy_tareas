package com.example.telegrafo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/transformar-a-codigo-morse/{texto}")
    public String primeraPrueba(@PathVariable String texto){

        String codigoTransformado="";
        for (int i = 0;i < texto.length();i++){
            String letraDeTexto = ""+texto.charAt(i);

            codigoTransformado = convertirLetraACodigoMorse(codigoTransformado, letraDeTexto);
        }
        return codigoTransformado;
    }

    private static String convertirLetraACodigoMorse(String codigoTransformado, String letraDeTexto) {

        String[] tablaAbc = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };

        String[] tablaCodigoMorse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        for (int j = 0; j < tablaAbc.length; j++){
            String letraTablaAbc = tablaAbc[j];
            if(letraTablaAbc.equalsIgnoreCase(letraDeTexto)){
                String letraEnCodigoMorse = tablaCodigoMorse[j];
                codigoTransformado += "  "+letraEnCodigoMorse+"  ";
            }
        }
        return codigoTransformado;
    }
}
