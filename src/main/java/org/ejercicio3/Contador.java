package org.ejercicio3;

import java.util.Scanner;

public class Contador {
    //Declaramos atributos
    static final int MAX_CONT = 10; //se declara con final, porque no puede ser modificado en el transcurso del programa
    int incremento;
    int contador;
    //Constructor del obj Contador
    Contador(int incremento, int contador){
        this.incremento = incremento;
        this.contador = contador;
    }

    //Metodos
    public void contarWhile(){
        contador = 0;   //reinicio el contador para que no de fallas
        while (contador < MAX_CONT){ //while(condiciones){instrucciones}
            contador += incremento;
        };
        System.out.println("Contador while: " + contador);
    }

    public void contarDoWhile(){
        contador = 0;   //reinicio el contador para que no de fallas
        do {contador += incremento;} while (contador < MAX_CONT); //do{instrucciones} while(condiciones) Se ejecuta si o si sin verificar

        System.out.println("Contador do while: " + contador);
    }

    public void contarFor(){
        contador = 0;   //reinicio el contador para que no de fallas
        for (; contador < MAX_CONT; contador += incremento) { //for(inicio;final;instruccion) en este caso el inicio no es necesario
                                                              //porque contador ya está inicializado en 0
        }
        System.out.println("Contador for: " + contador);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //declaramos el obj scanner
        System.out.println("Ingresa el incremento:");
        int incremento = entrada.nextInt();
        System.out.println("Ingresa el contador:");
        int contador = entrada.nextInt();
        Contador c1 = new Contador(incremento,contador);
        System.out.println("Seleccione el bucle");
        System.out.println("1) While");
        System.out.println("2) Do While");
        System.out.println("3) For");

        switch (entrada.nextInt()) { //uso la entrada convertida a entero con "nextInt()" porque el scanner es un obj
            case 1:
                c1.contarWhile();
                break;
            case 2:
                c1.contarDoWhile();
                break;
            case 3:
                c1.contarFor();
        }
    }

    // Diferencia entre atributo static y de instancia:
    // Los atributos static pertenecen a la clase, no a los objetos. Se pueden usar con Clase.atributo sin crear un objeto.
    // Existen desde que la clase se carga en memoria y son compartidos por todos los objetos.

    // Los atributos de instancia pertenecen a cada objeto.
    // Solo existen después de crear el objeto con 'new' y cada objeto tiene su propia copia.

    // Explicación en menos de diez líneas sobre cuándo usar cada bucle:

    // Usaría while cuando no estoy seguro en qué momento terminará el bucle,
    // asegurándome de evitar bucles infinitos.

    // Usaría do-while cuando tampoco sé cuándo terminará el bucle
    // pero quiero que al menos se ejecute una vez.

    // Usaría for cuando sé exactamente cuántas veces debe ejecutarse
    // y cómo va a crecer o cambiar la variable de control.
}
