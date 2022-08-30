package com.checho.dispensador.dominio;

public class Dispensador {
        private Cerveza cerveza;
        private double cantidadActual;
        private double capacidad;
        private double temperatura = -8;


        public Dispensador(Cerveza cerveza, double cantidadActual, double capacidad) {
            this.cerveza = cerveza;
            this.cantidadActual = cantidadActual;
            this.capacidad = capacidad;
        }

        public boolean servir(double cantidadAservir){
            if(validarTemperatura() && cantidadAServirValida(cantidadAservir)) {
                System.out.println("Cerveza Servida " + cantidadAservir +" y esta a " + temperatura +
                        " centigrados de la marca" + cerveza.getNombreCerveza());
                return true;
            }
            System.out.println("No tenemos esta candiad de cerverza");
            return false;
        }

        public boolean llenar(){
            this.cantidadActual = this.capacidad;
            System.out.println("El dispensador se lleno correctamente");
            return true;
        }

        public boolean vaciar(){
            this.cantidadActual = 0;
            System.out.println("El dispensador esta completamente vacio");
            return true;
        }

        public boolean validarTemperatura(){
            return this.temperatura >= -10 && this.temperatura <=10;
        }

        public boolean cantidadAServirValida(double cantidadAServir){
            return cantidadAServir <= this.cantidadActual && this.cantidadActual > 0;
        }

        public boolean cambiartemperatura(double nuevatemp){
            if (nuevatemp<=10 && nuevatemp>=-10) {
                temperatura = nuevatemp;
                System.out.println("La temperatura esta en " + temperatura + " centigrados");
                return true;
            }
            System.out.println("la temperatura no se puede cambiar porque esta fuera de los límites");
            return false;
        }

    public Cerveza getCerveza() {
        return cerveza;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

}

