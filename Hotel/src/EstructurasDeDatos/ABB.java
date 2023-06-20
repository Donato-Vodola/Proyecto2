/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

public class ABB<E extends Comparable<E>> {
    NodoABB<E> raiz;

    public ABB() {
        raiz = null;
    }

    public void put(E valor) {
        raiz = put(raiz, valor);
    }

    private NodoABB<E> put(NodoABB<E> nodo, E valor) {
        if (nodo == null) {
            nodo = new NodoABB<>(valor);
            return nodo;
        }

        if (valor.compareTo(nodo.value) < 0) {
            nodo.left = put(nodo.left, valor);
        } else if (valor.compareTo(nodo.value) > 0) {
            nodo.right = put(nodo.right, valor);
        }

        return nodo;
    }

    public boolean search(E valor) {
        return search(raiz, valor);
    }

    private boolean search(NodoABB<E> nodo, E valor) {
        if (nodo == null) {
            return false;
        }

        if (valor.compareTo(nodo.value) == 0) {
            return true;
        }

        if (valor.compareTo(nodo.value) < 0) {
            return search(nodo.left, valor);
        } else {
            return search(nodo.right, valor);
        }
    }

    public Lista<E> toListInOrden() {
        Lista<E> lista = new Lista<>();
        toListInOrden(raiz, lista);
        return lista;
    }

    private void toListInOrden(NodoABB<E> nodo, Lista<E> lista) {
        if (nodo != null) {
            toListInOrden(nodo.left, lista);
            lista.insertarFinal(nodo.value);
            toListInOrden(nodo.right, lista);
        }
    }
}
