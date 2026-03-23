package org.ejercicio9;

public class ej9 {

    public static class ContadorPalabras{
        private String oracion;

        public ContadorPalabras(String oracion){
            this.oracion = oracion;
        }

        public int contadorPalabras(){
            //Corroboramos si está vacío
            if (oracion == null || oracion.trim().isEmpty()){
                return 0;
            }
            /*
                trim() elimina los espacios al principio o al final de una palabra
                split("\\s+") es para recortar las palabras, aunque tenga más de un espacio entre ellas.
            */
            String[] palabras = oracion.trim().split("\\s+");
            return palabras.length;
        }

        public String getOracion(){
            return oracion;
        }

        public void setOracion(String oracion){
            this.oracion = oracion;
        }
    }

    public static void main(String[] args){
        ContadorPalabras contPalabras = new ContadorPalabras("  Hola  como estas?   ");
        System.out.println(contPalabras.contadorPalabras());
    }
}
