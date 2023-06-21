/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

public class ABB<E> {
    NodoABB<E> raiz;

    public ABB() {
        this.raiz = null;
    }
    public ABB(int raiz) {
        this.raiz = new NodoABB(raiz);
    }
    public NodoABB getRoot() {
        return raiz;
    }
    
    public ABB(NodoABB raiz) {
        this.raiz = raiz;
    }
    
    public void PutRaiz(int valor){
        this.raiz = new NodoABB(valor);
    }
    
    public boolean EsVacio(NodoABB nodo) {
        return nodo == null;
    }
    
    public void put(int valor) {
       raiz = put(raiz, valor);
        System.out.println(valor);
    }
    
    private NodoABB<E> put(NodoABB<E> nodo, int valor) {
        if (nodo == null) {
            nodo = new NodoABB<>(valor);
            return nodo;
        }
        if (valor == nodo.value) {
            return nodo;
        }else {
        if (nodo.left == null) {
            nodo.left = put(nodo.left, valor);
        } else if (nodo.right == null) {
            nodo.right = put(nodo.right, valor);
        }else{
                put(nodo.left,valor);
        }
        }
        return nodo;
    }

    public NodoABB<E> search(int valor) {
        return search(raiz, valor);
        
    }
    
    public NodoABB<E> search(NodoABB<E> nodo, int valor) {
        if (nodo == null) return null;
        
        if (nodo.getValue() == valor) {
            return nodo;
        } else if(valor < nodo.getValue()) {
            return search(nodo.left, valor);
        } else {
            return search(nodo.right, valor);
        }
    }
    
//    private boolean search2(NodoABB<E> nodo, int valor) {
//        if (nodo == null) {
//            return false;
//        }
//
//        if (valor == nodo.value) {
//            return true;
//        }
//
//        if (valor != nodo.value) {
//            return search(nodo.left, valor);
//        } else {
//            return search(nodo.right, valor);
//        }
//    }

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
    public void busquedas(int root){
        System.out.println("");
        inOrder(search(root));
        System.out.println("");
        preOrder(search(root));
        System.out.println("");
        postOrder(search(root));
    }
            
            
    public void inOrder(NodoABB<E> root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.value + ",");
            inOrder(root.getRight());
        }
    }
    
    public void preOrder(NodoABB<E> root) {
        if (root != null) {
            System.out.print(root.value + ",");
            inOrder(root.getLeft());
            inOrder(root.getRight());
        }
    }
    
    public void postOrder(NodoABB<E> root) {
        if (root != null) {
            inOrder(root.getLeft());
            inOrder(root.getRight());
            System.out.print(root.value + ",");
        }
    }
}
