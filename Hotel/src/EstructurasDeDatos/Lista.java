/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;
import java.util.Arrays;

public class Lista<E>
{
    private NodoLista<E> pfirst;
    private NodoLista<E> plast;
    private int size;
    
    public void insertarInicio(E x){
        size++;
        if(pfirst != null){
            pfirst = new NodoLista(x, pfirst);
        }
        else plast = pfirst = new NodoLista(x, null);
    }
    
    public void insertarFinal(E x){
        size++;
        if(plast != null) {
            plast.setPnext(new NodoLista(x, null));
            plast = plast.getPnext();
        }
        else {
            plast = pfirst = new NodoLista(x, null);
        }
    }
    
    public int size(){
        return size;
    }
    
    public boolean contains(E e){
        NodoLista actual = pfirst;
        while(actual != null){
            if(actual.getElement().equals(e)) return true;
            actual = actual.getPnext();
        }
        return false;
    }
    
    public String toString(){
        String res = "";
        NodoLista actual = pfirst;
        while(actual != null){
            if(actual.getPnext() != null) res += actual.getElement() + "-> ";
            else res += actual.getElement();
            actual = actual.getPnext();
        }
        return res;
    }
    public boolean isEmpty(){
        return pfirst == null;
    }
    public void imprimir(){
        NodoLista<E> temp = pfirst;
        int cuenta = 0;
        if (this.isEmpty()) {
            System.out.println("Está vacía");
        }
        while (temp != null){
            cuenta++;
            System.out.println(cuenta + ".,  " + temp.getElement());
            temp = temp.getPnext();
        }
        System.out.println(size);
        
    }
    
    public NodoLista getPfirst() {
        return pfirst;
    }
    
    public E get(E value){
        NodoLista<E> actual = pfirst;
        while(actual != null){
            if(actual.getElement().equals(value)) return actual.getElement();
            actual = actual.getPnext();
        }
        return null;
    }

    
    public void eliminar(NodoLista<E> nodo){
        NodoLista<E> actual = pfirst;
        if(size == 1) {pfirst = plast = null;return;}
        if(nodo.equals(actual)) {pfirst = pfirst.getPnext(); return;}
        while(!actual.getPnext().equals(nodo)) actual = actual.getPnext();
        if(nodo.equals(plast)) plast = actual; 
        actual.setPnext(nodo.getPnext());
        size--;
    }
    
    public E[] toArray(){
        Object[] res = new Object[size];
      
        NodoLista actual = pfirst;
        int i = 0;
        while(actual != null){
            res[i] = actual.getElement();
            actual = actual.getPnext();
        }
        
       return Arrays.copyOf(res, size, (Class<? extends E[]>) res.getClass()); 
    }
    
   
}
