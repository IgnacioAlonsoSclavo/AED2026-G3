package org.ejercicio5;

public class TiposDeDatosObjetosYMemoria {



    private static class Marcapasos {

        private final int idDispositivo;
        private String codigoFabricante;
        private int latidosPorMinuto;
        private int nivelBateria;
        private static int cantidad;

        public Marcapasos(int idDispositivo, String codigoFabricante, int latidosPorMinuto, int nivelBateria){

            this.idDispositivo = idDispositivo;
            this.codigoFabricante = codigoFabricante;
            this.latidosPorMinuto = latidosPorMinuto;
            this.nivelBateria = nivelBateria;
            cantidad++;
        }

        //getter
        public int getIdDispositivo(){
            return idDispositivo;
        }

        public String getCodigoFabricante(){
            return codigoFabricante;
        }

        public int getLatidosPorMinuto(){
            return latidosPorMinuto;
        }

        public int getNivelBateria(){
            return nivelBateria;
        }

        public static int getCantidad(){
            return cantidad;
        }

        //setter
        public void setLatidosPorMinuto(int latidosPorMinuto){
            this.latidosPorMinuto = latidosPorMinuto;
        }

        public void setNivelBateria(int nivelBateria){
            this.nivelBateria = nivelBateria;
        }


        //metodo para mostrar estado

        @Override
        public String toString(){

            return "Id de dispostivo: " + idDispositivo + "\nCodigo de fabricante: " + codigoFabricante +
                    "\nLatidos por minuto: " + latidosPorMinuto + "\nNivel de bateria: " + nivelBateria + "%";
        }


    }

    public static void main (String[] args){

        Marcapasos primer = new Marcapasos(777,"prueba", 0, 60);
        System.out.println(primer);

    }

    //Calcular la memoria consumida considerando solamente las variables declaradas y explicitar qué
    //simplificaciones se están haciendo
}
