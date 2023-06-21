/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.time.LocalDate;

public class Reserva {
    String primerNombre, segundoNombre, email, genero, tipo_hab, celular;
    LocalDate llegada, salida;

    public Reserva(String primerNombre, String segundoNombre, String email, String genero, String tipo_hab, String celular, LocalDate llegada, LocalDate salida) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.email = email;
        this.genero = genero;
        this.tipo_hab = tipo_hab;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
    }
    
    @Override
    public String toString() {
        return "Reserva{\n" + "primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + "\nemail=" + email + ", genero=" + genero + "\ntipo_hab=" + tipo_hab + ", celular=" + celular + "\nllegada=" + llegada + ", salida=" + salida + "\n}";
    }
   }
