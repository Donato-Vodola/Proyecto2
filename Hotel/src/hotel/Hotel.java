/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import EstructurasDeDatos.ABB;
import EstructurasDeDatos.TablaHash;

public class Hotel {
    private TablaHash<String, Integer> registroClientes;
    private TablaHash<Long, Reserva> reservas;
    private ABB habitaciones;
    
    
    public Hotel(int numHab){
        registroClientes = new TablaHash(100); 
        reservas = new TablaHash(1000);
        habitaciones = new ABB(1);
        for(int i = 2; i<=numHab; i++) {
            habitaciones.put(i);
        }
        habitaciones.busquedas(1);
        System.out.println("");
        for (int i = 0; i < 10; i++) {
           habitaciones.search(39).actualizarHistorial("Panita", "Juan"); 
        }
        
        habitaciones.search(39).getHistorial().imprimir();
        System.out.println("sapo");
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
    
    public String historialHabitacion(int numHab){
        return habitaciones.search(numHab).toString();
    }
    public void CheckIn(Long cedula, Reserva res){   
        registroClientes.put(res.primerNombre+" "+res.segundoNombre, (int) (Math.random()*300));
        reservas.put(cedula, res);
    }
     public void CheckOut(Reserva res){
        String cliente = res.primerNombre+" "+res.segundoNombre;
         System.out.println(registroClientes.get(cliente));
        habitaciones.search(registroClientes.get(cliente)).getHistorial().insertarFinal(cliente);
        registroClientes.remove(cliente);
    }
}
