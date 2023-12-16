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
public class NodoG {
    String dato;
    NodoG p1;
    NodoG p2,p3;
    int grado;
    int c1,c2,c3;
    Scanner leer = new Scanner(System.in);
    public NodoG (String d)
    {
        dato = d;
        p1 = null;
        p2 = null;
        p3 = null;
        grado = 3;
        c1 = 0;
        c2 = 0;
        c3 = 0;
    }
    public void mostrar()
    {
        System.out.println("______________________________________________________________");
        System.out.println("dato del nodo: "+dato);
        System.out.println("______________________________________________________________");        
        if(p1 !=null)
        {
            System.out.println("puntero Nro1: "+p1.dato);
            System.out.println("con dirrecion "+p1);
        }
        else
        {
            System.out.println("puntero Nro1: Sin dato");
            System.out.println("dirrecion "+p1);
        }
        System.out.println("costo Nro1: "+c1);
        
        if(p2 !=null)
        {
            System.out.println("puntero Nro2: "+p2.dato);
            System.out.println("con dirrecion "+p2);
        }
        else
        {
            System.out.println("puntero Nro2: Sin dato");
            System.out.println("dirrecion "+p2);
        }
        System.out.println("costo Nro2: "+c2);
        
        if(p3 !=null)
        {
            System.out.println("puntero Nro3: "+p3.dato);
            System.out.println("con dirrecion "+p3);
        }
        else
        {
            System.out.println("puntero Nro3: Sin dato");
            System.out.println("dirrecion "+p3);
        }
        System.out.println("costo Nro1: "+c3);

        System.out.println("______________________________________________________________");
    }
}
