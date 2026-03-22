package org.ejercicio10;

//Imputs y Ouputs
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//java collections
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class archivosArreglosYColeccionesDeTexto {

    //Metodo para obtener las lineas de un archivo de texto
    public String[] obtenerLineas(String archivo) {


        List<String> lineas = new ArrayList<>();    //Lista donde se guardan las lineas, es arraylist por lo cual es dinamica.

        try (
                //BufferedReader permite leer línea por línea
                BufferedReader br = new BufferedReader(new FileReader(archivo))
        ) {

            String linea;

            //Se leen las líneas hasta llegar al final del archivo
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (IOException e) {
            //En caso de error muestra alguno de los predeterminados de java.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        //Se convierte la lista en un arreglo de String
        return lineas.toArray(new String[0]);
    }


   //metodo que recibe lineas de texto y calcula la cantidad total de palabras.
    public int contarPalabras(String[] lineas) {

        int contador = 0;

        //Recorremos cada linea
        for (String linea : lineas) {

            //Verificamos que la línea no sea null ni vacía
            if (linea != null && !linea.isEmpty()) {

                //Con trim eliminamos los espacios de el inicio y el final: " ... "
                //y dividimos por espacios con split, \\s para que separe en sea un espacio o más
                String[] palabras = linea.trim().split("\\s+");

                //sumamos la cantidad de palabras encontradas
                contador += palabras.length;
            }
        }

        return contador;
    }


    //Interseccion de palabras con arregos, devolvemos las palabras que estan en ambos
    public String[] palabrasComunesArreglo(String[] a, String[] b) {

        List<String> comunes = new ArrayList<>();

        //comparamos cada palabra del arreglo A con cada palabra del arreglo B
        for (String palabraA : a) {
            for (String palabraB : b) {

                //Si coinciden y no fue agregada a la lista antes, la agregamos.
                if (palabraA.equals(palabraB) && !comunes.contains(palabraA)) {
                    comunes.add(palabraA);
                }
            }
        }

        return comunes.toArray(new String[0]); // el [0] es para que el largo del string sea el correcto.
    }


    //usando hashset, ya que es más rapido para busquedas.
    public String[] palabrasComunesColeccion(String[] a, String[] b) {

        //Set A donde almaceno las palabras del primer arreglo
        Set<String> setA = new HashSet<>();
        //Set para guardar la intersección (las palabras que estan en ambos)
        Set<String> comunes = new HashSet<>();

        //guardamos todas las palabras de A
        for (String palabra : a) {
            setA.add(palabra);
        }

        //rcorremos B las palabras de B para ver si coinciden
        for (String palabra : b) {

            // usamos contains() que es muy rapido
            // proque HashSet permite búsquedas en tiempo constante promedio O(1) gracias a la tabla hash
            if (setA.contains(palabra)) {
                comunes.add(palabra);
            }
        }

        return comunes.toArray(new String[0]);
    }


    public static void main(String[] args) {

        archivosArreglosYColeccionesDeTexto cp = new archivosArreglosYColeccionesDeTexto();

        //leer líneas desde un archivo
        String[] lineas = cp.obtenerLineas("texto.txt");

        //Contar palabras en esas líneas
        int total = cp.contarPalabras(lineas);

        System.out.println("Cantidad total de palabras: " + total);

        //ejemplo de intersección a y b
        String[] a = {"discreta", "AYE", "Sistemas Operativos"};
        String[] b = {"Gal", "aye", "AYE", "sistemas operativos"};

        String[] comunes = cp.palabrasComunesColeccion(a, b);

        System.out.println("Palabras en común:");

        for (String palabra : comunes) {
            System.out.println(palabra);
        }
    }
}

