/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

public class TablaHash<K, V> {
    private Lista<Entrada<K, V>>[] buckets;
    private int capacity;
    private int size;
 
    public TablaHash(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new Lista[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new Lista<>();
        }
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

     public void put(K key, V value) {
        int index = hashFunction(key);
        Lista<Entrada<K, V>> bucket = buckets[index];
        NodoLista<Entrada<K, V>> nodo = bucket.getPfirst();

        while (nodo != null) {
            Entrada<K, V> entry = nodo.getElement();
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
            nodo = nodo.getPnext();
        }

        bucket.insertarFinal(new Entrada<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hashFunction(key);
        Lista<Entrada<K, V>> bucket = buckets[index];
        NodoLista<Entrada<K, V>> nodo = bucket.getPfirst();

        while (nodo != null) {
            Entrada<K, V> entry = nodo.getElement();
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            nodo = nodo.getPnext();
        }

        return null;
    }

    public void remove(K key) {
        int index = hashFunction(key);
        Lista<Entrada<K, V>> bucket = buckets[index];
        NodoLista<Entrada<K, V>> nodo = bucket.getPfirst();

        while (nodo != null) {
            Entrada<K, V> entry = nodo.getElement();
            if (entry.getKey().equals(key)) {
                bucket.eliminar(nodo);
                size--;
                return;
            }
            nodo = nodo.getPnext();
        }
    }

    public int size() {
        return size;
    }
}









