/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import EstructurasDeDatos.TablaHash;
import EstructurasDeDatos.ABB;

public class Hotel {
    private TablaHash<String, Integer> registroClientes;
    private TablaHash<Long, Reserva> reservas;
    private Habitacion[] habitaciones;
    
    public Hotel(int numHab){
        registroClientes = new TablaHash(100); 
        reservas = new TablaHash(1000);
        habitaciones = new Habitacion[numHab];
        for(int i = 0; i<numHab; i++) habitaciones[i] = new Habitacion();
        
        cargarDatos();
        inicializarRegistros();
    }
    
    private void cargarDatos() {
        //Cargar los datos de la tabla de excel en reservas;
    }
    
    private void inicializarRegistros(){
        //Inicializarlo con los clientes actuales;
    }
    
    public int getNumHabitacion(String nombre, String apellido){
        return registroClientes.get(nombre+" "+apellido);
    }
    
    public Reserva getReserva(Long cedula){
        return reservas.get(cedula);
    }
    
    public String[] historialHabitacion(int numHab){
        return habitaciones[numHab].getHistorial().toArray();
    }
    
    public void CheckIn(Long cedula, Reserva res){   
        registroClientes.put(res.primerNombre+" "+res.segundoNombre, (int) (Math.random()*habitaciones.length));
        reservas.put(cedula, res);
    }
    
     public void CheckOut(Reserva res){
        String cliente = res.primerNombre+" "+res.segundoNombre;
        habitaciones[registroClientes.get(cliente)].getHistorial().insertarFinal(cliente);
        registroClientes.remove(cliente);
    }
}
