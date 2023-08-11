/*
 * La clase Consumidor define hilos que recogen mensajes de un buzón de mensajes
 * y los muestran por pantalla.
 * El buzon y el número de mensajes, los reciben como parámetros del constructor
 * antes de terminar.
 * Entre recogida y recogida, esperan un tiempo aleatorio entre 0.5 y 1 seg.
 */
package Buzon;
public class Consumidor extends Thread {
    private int numMensajes;
    private Buzon miBuzon;

    public Consumidor(int numMensajes, Buzon miBuzon){
        this.numMensajes=numMensajes;
        this.miBuzon=miBuzon;
        start();
    }

    @Override
    public void run(){
        for(int i=0; i<numMensajes; i++){
            try{ sleep((int)(500+500*Math.random()));} catch(InterruptedException e){}
            System.out.println(miBuzon.recibeMensaje());
        }
        System.out.println("Total mensajes leidos: "+numMensajes);
    }
}
