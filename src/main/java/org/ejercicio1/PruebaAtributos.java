package org.ejercicio1;

public class PruebaAtributos {
    public static void main(String[] args) {
        // En cada caso probamos cada atributo de forma inválida y lo dejamos comentado abajo del correcto.

        int edad = 20;
        //int error = "hola";
        //error: Incompatible types. Found: 'java.lang.String', required: 'int'
        boolean estaActivo = true;
        //boolean error = 1;
        //error: Incompatible types. Found: 'int', required: 'boolean'
        double coma = 4.5;
        //double coma = "a";
        //error: Incompatible types. Found: 'java.lang.String', required: 'double'
        float comaa = 1.2F;
        //float error = 1.2;
        //error: java: incompatible types: possible lossy conversion from double to float
        String hola = "hola";
        /*String error = hola;
          error: cannot find symbol variable hola */
        char letra = 'a';
        //char error = 'aasd';
        //error: java: unclosed character literal

        System.out.println("mi edad es " + edad);

    }

    //• JVM: Java Virtual Machine
    // - Es un motor que permite ejecutar programas java y otros lenguajes
    //• JDK: kit de desarrollo de Java
    // - es un software que incluye java, clases java y herramientas de desarrollo (compilador, depurador, etc)
    //• JRE: entorno de ejecución
    // - son un conjunto de herramientas que permiten ejecutar aplicaciónes en lenguaje Java.

    //PARA COMPILAR: mvn clean compile exec:java -Dexec.mainClass="org.ejercicio1.PruebaAtributos" //command prompt
    //clean para hacer una compliación limpia (borrar las anteriores)
    //compile para compilar
    //exec:java para ejecutar
    //-Dexec.mainClass="Ruta de la clase"


    //De ejemplos primitivos utilizamos int, boolean, double, char y float. Lo que tuvimos que hacer es darle un valor directo.
    // Los de referencia son tratados como objeto.
}


