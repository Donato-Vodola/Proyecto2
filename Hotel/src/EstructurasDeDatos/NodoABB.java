/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

public class NodoABB<E extends Comparable<E>> {
    E value;
    NodoABB<E> left;
    NodoABB<E> right;

    public NodoABB(E valor) {
        this.value = valor;
        left = null;
        right = null;
    }

}
