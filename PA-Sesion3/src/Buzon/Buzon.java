/*
 * La clase Buzon define una Región Crítica Condicional
 * El método enviaMensaje debe esperar si el buzón está lleno
 * El método recibeMensaje debe esperar si el buzón está vacío.
 * Cuando un hilo completa su operación, desbloquea a los que estén esperando
 * para que puedan contnuar intentando su acción.
 */
package Buzon;
public class Buzon {
    private String mensaje;
    private boolean lleno=false;

    public synchronized void enviaMensaje(String msg){
        lleno=true;
        mensaje=msg;
    }

    public synchronized String recibeMensaje(){
        lleno=false;
        return mensaje;
    }
}
