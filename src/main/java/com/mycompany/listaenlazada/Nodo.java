package com.mycompany.listaenlazada;

/**
 *
 * @author irvin
 */
public class Nodo {
    public int valor;
    public Nodo siguiente;
    
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
