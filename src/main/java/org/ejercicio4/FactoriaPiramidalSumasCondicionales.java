package org.ejercicio4;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class FactoriaPiramidalSumasCondicionales {


    public static int factorial(int num){
        int resultado = 1;
        for (int i = 1; i <= num; i++){
            resultado*= i;
        }
        return resultado;
    }

    public static String esPrimo(int num){
        int sumaPar = 0;
        int sumaImpar = 1;
        int i = 2;
        String resultado = "Es primo";


        if (num <= 1){
            resultado = "No es primo";
        }else {
            while (i < num){
                if(num % i == 0){
                    resultado = "No es primo";
                }
                if (i % 2 == 0 ){
                    sumaPar += i;
                }else {
                    sumaImpar += i;
                }
                i++;
            }
        }
        if (resultado == "Es primo"){
            resultado = "Es primo, la suma de los pares es: " + sumaPar;
        }else if (resultado == "No es primo"){
            resultado = "No es primo, la suma de los impares es: "+ sumaImpar;
        }
        return resultado;
    }
/*
 public static String esPrimo(int num){
        int cont = 1;
        int numero = num/2;
        String resultado = "";
        List <Integer> numerosDivisibles = new ArrayList<>();
        while (numero > 1){
            if (num%numero == 0){
                numerosDivisibles.add(numero);
            }
            numero -=1;
        }
        if (numerosDivisibles.size() == 0){
            resultado = "El numero ingresado es primo";
        }else{
            resultado = "El numero ingresado no es primo";
        }
        return resultado;
    }
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de num: ");
        int num = scan.nextInt();
        /*System.out.println(factorial(num));*/
        System.out.println(esPrimo(num));
        //Pruebas:
        System.out.println(esPrimo(5)); // Es primo, la suma de los pares es: 6
        System.out.println(esPrimo(14)); // No es primo, la suma de los impares es: 49
    }



}
