/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

import hotel.Habitacion;

public class NodoABB<E> {
    int value;
    NodoABB<E> left;
    NodoABB<E> right;
    Habitacion historial;

    public NodoABB(int valor) {
        this.value = valor;
        left = right = null;
    }

    public Habitacion getHistorial() {
        return historial;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    

    public NodoABB<E> getLeft() {
        return left;
    }

    public void setLeft(NodoABB<E> left) {
        this.left = left;
    }

    public NodoABB<E> getRight() {
        return right;
    }

    public void setRight(NodoABB<E> right) {
        this.right = right;
    }

    
  
}