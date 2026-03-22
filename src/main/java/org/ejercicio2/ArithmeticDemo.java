package org.ejercicio2;
import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2; // suma de dos enteros
        result -= 1; // le resta 1 a result
        result *= 2; // result se multiplica por 2
        result /= 2; // result se divide entre 2
        result += 8; // Le suma 8 a result
        result %= 7; // Asignacion de mod
        int a = 5; int i = 3; a += ++i;

        //int a e int i los define como enteros y se inicializa con valores 5 y 3 respectivamente
        //Luego le suma i + 1 al valor a que es 5, por lo que a termina siendo 9
        System.out.println(result);
        //mostramos por consola el result

        Scanner n1 = new Scanner(System.in);
        // definimos el scanner con el nombre n1
        Scanner n2 = new Scanner(System.in);
        // definimos el scanner con el nombre n2

        System.out.println("Ingrese un valor: ");
        //mostramos por consola "Ingrese un valor: "
        int numero = n1.nextInt();
        //Definimos numero como entero y se asigna el valor leido por el scanner n1

        System.out.println("Ingrese otro valor: ");
        //mostramos por consola "Ingrese otro valor: "
        int numero2 = n2.nextInt();
        //Definimos numero2 como entero y se asigna el valor leido por el scanner n2

        System.out.println((numero + numero2));
        // Se imprime la suma de el numero 1 y numero 2
        System.out.println((numero - numero2));
        // Se imprime la resta de el numero 1 y numero 2
        System.out.println((numero * numero2));
        // Se imprime la multiplicación de el numero 1 y numero 2
        System.out.println((numero / numero2));
        // Se imprime la divición de el numero 1 y numero 2
        System.out.println((numero % numero2));
        // Se imprime el resto de el numero 1 y numero 2

    }
}
