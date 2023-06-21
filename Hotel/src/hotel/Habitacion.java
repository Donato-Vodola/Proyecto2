/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import EstructurasDeDatos.Lista;

public class Habitacion {
    private Lista<String> historial;

    public Habitacion() {
        this.historial = historial;
    }
    
    public void actualizarHistorial(String nombre, String apellidos){
        historial.insertarFinal(nombre+" "+apellidos);
    }
    
    public void actualizarHistorial(Lista<String> historial){
        this.historial = historial;
    }
   
    public Lista<String> getHistorial() {return historial;}
}
