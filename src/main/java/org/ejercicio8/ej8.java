package org.ejercicio8;
import java.util.Scanner;
public class ej8 {

    /*
    StringBuilder: Permite modificar el mismo String sin necesidad de crear uno nuevo.
    Trabaja sobre el mismo String.
    */

    public static String bucles(String texto){
        Scanner scanner = new Scanner(System.in);

        //Bucle infinito

        /*while (texto != "Salir"){
            System.out.println("Escribi 'Salir' para terminar: " );
            texto = scanner.nextLine();
        }*/

        //Bucle Finito
        while (!texto.equals("Salir")){
            System.out.println("Escribi 'Salir' para terminar: ");
            texto = scanner.nextLine();
        }
        return "Logró salir ";
    }

    public static void main(String[] args){

        //append()
        StringBuilder mensajeAppend = new StringBuilder("Hola");
        mensajeAppend.append(" Mundo");

        System.out.println(mensajeAppend);
        // Agrega texto al final del String, sin crear uno nuevo.

        //insert()
        StringBuilder mundoInsert = new StringBuilder("Mndo");
        mundoInsert.insert(1, "u");

        System.out.println(mundoInsert);
        //Insertamos texto indicando la posición donde lo queremos. El resto del texto se desplaza mo se borra.

        //delete(inicio, fin)
        StringBuilder textDelete = new StringBuilder("Hola mundo");
        textDelete.delete(5,11);

        System.out.println(textDelete);
        //Borra desde el índice (inicio hasta el fin-1)

        //deleteCharAt(posición)
        StringBuilder letra = new StringBuilder("Holaa");
        letra.deleteCharAt(4);

        System.out.println(letra);
        //Borra únicamente la letra indicada

        //reverse()
        StringBuilder textoInvertido = new StringBuilder("aloH");
        textoInvertido.reverse();

        System.out.println(textoInvertido);
        // Invierte todo el contenido del texto

        //setLength()
        StringBuilder largoTexto = new StringBuilder("Hola Mundo");
        largoTexto.setLength(15);
        //largoTexto.setLength(4);

        System.out.println(largoTexto);
        //Recorta si el nuevo largo es menor.
        //Rellena con caracteres vacíos si el nuevo largo es mayor.

        //ensureCapacity()
        StringBuilder reservaMemoria = new StringBuilder();
        reservaMemoria.ensureCapacity(50);

        //Se asegura de que el buffer tenga capacidad minima
        //Evita que Java tenga que redimensionar muchas veces

        /*
            Si el stringBuilder no tiene ningún elemento, inicialmente inicia con 16 de capacidad,
            también se puede definir desde un inicio.
            Si tiene algún texto, la capacidad es el mismo "texto"+16.
        */

        /*
            "==" compara direcciones de memoria
            "equals()" compara contenido
        Ejemplos:*/
        String a = new String("Hola");
        String b = new String("Hola");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(bucles(" "));


        //String Pool hace que funcione "==" porque ambos apuntan al mismo objeto en memoria

        //intern() fuerza a utilizar el mismo objeto de Pool.
        // Si existe el objeto devuelve esa referencia sino la agrega

    }
}
