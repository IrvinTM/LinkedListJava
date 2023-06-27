package com.mycompany.listaenlazada;

import java.util.Scanner;

public class ListaEnlazada {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Lista lista = new Lista();

            int opcion;
            do {
                System.out.println("----- Menú Principal -----");
                System.out.println("1. Agregar valor");
                System.out.println("2. Agregar valor al inicio");
                System.out.println("3. Suprimir valor");
                System.out.println("4. Ordenar lista de menor a mayor");
                System.out.println("5. Imprimir lista");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opción: ");

                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("\n----- Agregar Valor -----");
                            System.out.print("Ingrese el valor a agregar: ");
                            if (scanner.hasNextInt()) {
                                int valorAgregar = scanner.nextInt();
                                lista.agregar(valorAgregar);
                                System.out.println("Valor agregado correctamente.");
                            } else {
                                System.out.println("Valor inválido. Por favor, ingrese un valor entero.");
                                scanner.nextLine();
                            }
                            break;
                        case 2:
                            System.out.println("\n----- Agregar Valor al Inicio -----");
                            System.out.print("Ingrese el valor a agregar al inicio: ");
                            if (scanner.hasNextInt()) {
                                int valorAgregarInicio = scanner.nextInt();
                                lista.agregarAlInicio(valorAgregarInicio);
                                System.out.println("Valor agregado al inicio correctamente.");
                            } else {
                                System.out.println("Valor inválido. Por favor, ingrese un valor entero.");
                                scanner.nextLine();
                            }
                            break;
                        case 3:
                            System.out.println("\n----- Suprimir Valor -----");
                            System.out.print("Ingrese el valor a suprimir: ");
                            if (scanner.hasNextInt()) {
                                int valorSuprimir = scanner.nextInt();
                                lista.suprimir(valorSuprimir);
                            } else {
                                System.out.println("Valor inválido. Por favor, ingrese un valor entero.");
                                scanner.nextLine();
                            }
                            break;
                        case 4:
                            System.out.println("\n----- Ordenar Lista -----");
                            lista.ordenar();
                            System.out.println("Lista ordenada correctamente.");
                            break;
                        case 5:
                            System.out.println("\n----- Imprimir Lista -----");
                            lista.imprimir();
                            break;
                        case 0:
                            System.out.println("\n¡Hasta luego!");
                            break;
                        default:
                            System.out.println("\nOpción inválida. Por favor, ingrese una opción válida.");
                            break;
                    }
                } else {
                    System.out.println("\nOpción inválida. Por favor, ingrese una opción válida.");
                    scanner.nextLine();
                    opcion = -1;
                }

                System.out.println();
            } while (opcion != 0);
        }
    }
}
