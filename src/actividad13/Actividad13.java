/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ferna
 */
public class Actividad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> cadena = new ArrayList();
        cadena.add("Brazo");
        cadena.add("Espalda");
        cadena.add("Pecho");
        cadena.add("Pierna");
        cadena.add("Antebrazo");
        cadena.add("Cabeza");
        cadena.add("Manos");
        cadena.add("Pies");
        cadena.add("Dedos");
        cadena.add("Cuello");

        System.out.println("Ordenando alfabeticamente");
        Collections.sort(cadena);
        System.out.println(cadena);

        System.out.println("Ordenado por longitud");
        Collections.sort(cadena, Comparator.comparing(String::length));
        cadena.forEach(System.out::println);
    }

}
