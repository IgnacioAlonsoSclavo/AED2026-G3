package org.ejercicio4;
import java.util.Scanner;

public class FactorialPiramidalSumasCondicionales {

    // Casos borde:
    // 0! = 1
    // 1! = 1
    // números negativos no tienen factorial definido
    public static int factorial(int num){

        if(num < 0){
            System.out.println("El factorial no está definido para números negativos.");
            return -1;
        }

        int resultado = 1;

        for(int i = 1; i <= num; i++){
            resultado *= i;
        }

        return resultado;
    }

    /*  Devolvemos boolean para que sea reutilizable:
        Separamos la lógica del cálculo de la impresión del resultado
        permitiendo reutilizar el metodo en otros contextos*/

    public static boolean esPrimo(int num){

        if(num <= 1){
            return false;
        }
        int i = 2;

        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }

    /*  Las sumas la separamos en métodos distintos (sumaPares y sumaImpares)
        para mantener cada metodo con una unica responsabilidad
        permitiendo reutilizar estas funciones en otros programas.*/

    public static int sumaPares(int num){

        int suma = 0;
        int i = 0;

        while(i <= num){
            if(i % 2 == 0){
                suma += i;
            }
            i++;
        }

        return suma;
    }


    public static int sumaImpares(int num){

        int suma = 0;
        int i = 0;

        while(i <= num){
            if(i % 2 != 0){
                suma += i;
            }
            i++;
        }

        return suma;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scan.nextInt();

        int fact = factorial(num);
        if(fact != -1){
            System.out.println("Factorial de " + num + " = " + fact);
        }

        if(esPrimo(num)){
            System.out.println("Es primo, la suma de los pares es: " + sumaPares(num));
        }else{
            System.out.println("No es primo, la suma de los impares es: " + sumaImpares(num));
        }
            //pruebas:
        //con 5:  Es primo, la suma de los pares es: 6
        //con 14 No es primo, la suma de los impares es: 49

        scan.close();
    }
}