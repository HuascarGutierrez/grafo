/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo;
import java.util.Scanner;
/**
 *
 * @author huasc
 */
public class Nodo {
    String dato;
    Nodo siguiente;
    Scanner leer;
    public Nodo()
    {
        leer = new Scanner(System.in);
        System.out.println("Ingrese el dato: ");
        this.dato = leer.nextLine();
        this.siguiente = null;
    }
    public Nodo (String x)
    {
        this.dato = x;
        this.siguiente = null;
    }    
    public void mostrar()
    {
        System.out.println("dato: "+this.dato);
        System.out.println("siguiente: "+this.siguiente);
    }
}
