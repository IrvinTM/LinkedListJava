package com.mycompany.listaenlazada;

import java.util.NoSuchElementException;

/**
 *
 * @author irvin
 */
public class Lista {
    private Nodo cabeza;
    
    public Lista() {
        this.cabeza = null;
    }
    public void agregarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor); 

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo; 
        }
        System.out.println("Se agregó el valor " + valor + " al inicio de la lista.");
    }
    public void suprimir(int valor) {
    try {
        if (cabeza == null) {
            throw new NoSuchElementException("La lista está vacía. No se puede suprimir el elemento.");
        }

        if (cabeza.valor == valor) {
            cabeza = cabeza.siguiente;
            System.out.println("El elemento " + valor + " se ha eliminado correctamente.");
            return;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.valor == valor) {
                anterior.siguiente = actual.siguiente;
                System.out.println("El elemento con valor: " + valor + " se ha eliminado correctamente.");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }

        throw new NoSuchElementException("El elemento " + valor + " no existe en la lista.");
    } catch (NoSuchElementException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

public void ordenar() {
    if (cabeza == null || cabeza.siguiente == null) {
        return;
    }

    Nodo nodoActual = cabeza;
    Nodo nodoSiguiente = cabeza.siguiente;
    boolean intercambioRealizado = true;

    while (intercambioRealizado) {
        intercambioRealizado = false;
        nodoActual = cabeza;
        nodoSiguiente = cabeza.siguiente;

        while (nodoSiguiente != null) {
            if (nodoActual.valor > nodoSiguiente.valor) {
                int temp = nodoActual.valor;
                nodoActual.valor = nodoSiguiente.valor;
                nodoSiguiente.valor = temp;
                intercambioRealizado = true;
            }

            nodoActual = nodoSiguiente;
            nodoSiguiente = nodoSiguiente.siguiente;
        }
    }
    System.out.println("La lista se ha ordenado correctamente.");
}

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        System.out.println("Se agregó el valor " + valor);
    }

    
    public void imprimir() {
        System.out.print("La lista es: ");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
    

