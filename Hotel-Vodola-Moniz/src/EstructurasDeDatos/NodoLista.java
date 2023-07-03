/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

public class NodoLista<E>
{
    private E element;
    private NodoLista pnext;
    
    public NodoLista(E element, NodoLista pnext){
        this.element = element;
        this.pnext = pnext;
    }
    
    public E getElement() {return element;}
    public NodoLista getPnext() {return pnext;}
    public void setPnext(NodoLista pnext) {this.pnext = pnext;}
    
    public boolean equals(NodoLista<E> otro){
        return element == otro.element && ((pnext == null && otro.pnext == null) || pnext.equals(otro.pnext));
    }
   
}

