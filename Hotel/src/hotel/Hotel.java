/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import EstructurasDeDatos.ABB;
import EstructurasDeDatos.TablaHash;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Hotel {
    public static TablaHash<String, Integer> registroClientes;
    public static TablaHash<String, Integer> registronumhab;
    public static TablaHash<Long, Reserva> reservas;
    public static ABB habitaciones;
    
    
    public Hotel(int numHab){
        registroClientes = new TablaHash(300); 
        reservas = new TablaHash(1000);
        habitaciones = new ABB(1);
        cargarDatos();
        inicializarRegistros();
    }
    private void inicializarRegistros(){
        //Inicializarlo con los clientes actuales;
        try {
            BufferedReader lector= new BufferedReader(new FileReader("src\\data\\reservas.csv"));
            String line ="";
            if(lector.readLine() !=null);
            while ((line= lector.readLine()) !=null) {
                if (!line.equals("")) {
                String[] parts = line.split(",");
                String[] dia = parts[7].split("/");
                LocalDate llegada = LocalDate.of(Integer.parseInt(dia[2]), Integer.parseInt(dia[1]), Integer.parseInt(dia[0]));
                dia = parts[8].split("/");
                LocalDate salida = LocalDate.of(Integer.parseInt(dia[2]), Integer.parseInt(dia[1]), Integer.parseInt(dia[0]));
                Reserva value = new Reserva(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], llegada, salida);
                String ci = parts[0].replace(".", "");
                Long cedula =  Long.valueOf(ci);
                reservas.put(cedula, value);
                }
            }
            lector.close();
            try{
            lector= new BufferedReader(new FileReader("src\\data\\estado.csv"));
            line ="";
//            num_hab,primer_nombre,apellido,email,genero,celular,llegada
            if(lector.readLine() !=null);
            while ((line= lector.readLine()) !=null) {
                if (!line.equals("")) {
                String[] parts = line.split(",");
                    
                String persona = parts[1] + "," + parts[2] + "," + parts[3] + "," + parts[4] + "," + parts[5] + "," + parts[6];
                    
                String personahab = parts[1] + ", " + parts[2] + "\n";
                int Numh = Integer.parseInt(parts[0]);
                registroClientes.put(persona, Numh);   
//                registronumhab.put(personahab, Numh);
                    System.out.println("holas1");
                }
            }
            lector.close();
            }catch (Exception e){
                System.out.println(e.getMessage()+ "\nTry again1");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()+ "\nTry again2");
        }  
    }
    
    private void cargarDatos() {
        //Cargar los datos de la tabla de excel en reservas;
    try {
            BufferedReader lector= new BufferedReader(new FileReader("src\\data\\habitaciones.csv"));
            String line ="";
            if(lector.readLine() !=null);
            while ((line= lector.readLine()) !=null) {
                if (!line.equals("")) {
                String[] parts = line.split(",");
                habitaciones.put(parts[0],parts[1],parts[2]);
                }
            }
            lector.close();
        try {
            lector= new BufferedReader(new FileReader("src\\data\\Histórico.csv"));
            line ="";
            if(lector.readLine() !=null);
            int f =1;
            while ((line= lector.readLine()) !=null) {
                if (!line.equals("")) {
                String[] parts = line.split(",");
                habitaciones.search(Integer.parseInt(parts[6])).actualizarHistorial(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
                }
            }
            
            lector.close();            
        } catch (Exception e) {
            System.out.println(e.getMessage()+ "\nTry again3");
        }            
    } catch (Exception e) {
        System.out.println(e.getMessage()+ "\nTry again4");
    }
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
