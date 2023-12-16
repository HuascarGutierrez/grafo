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
public class GrafoND 
{
    NodoG g;
    NodoG[] NG;
    String[] vertice;
    int cantidad;
    Scanner leer = new Scanner(System.in);
    public GrafoND()
    {
        g = null;
        NG = new NodoG[10];
        vertice = new String[10];
        cantidad = 0;
    }
    public void agregar()
    {
        String resp;
        int i,j,k,costo;
        boolean flag;
        System.out.print("Ingrese un nombre para el nodo: ");
        vertice[cantidad] = leer.next();
        NodoG nuevo = new NodoG(vertice[cantidad]);
        NG[cantidad] = nuevo;
        if (g == null)
        {
            g = nuevo;
        }
        else 
        {
            for (i=0; i<cantidad; i++)
            {
                System.out.println("El nodo "+vertice[cantidad]
                +" tiene conexion con el nodo "+vertice[i]+"?   S/N: ");
                resp = leer.next();
                if (resp.equals("S"))
                {
                    System.out.println("Ingrese el costo: ");
                    costo = leer.nextInt();
                    j=1;
                    flag = false;
                    do
                    {
                        switch(j)
                        {
                            case 1: if(NG[i].p1 == null)
                                    {
                                        NG[i].p1 = nuevo;
                                        NG[i].c1 = costo;
                                        flag = true;
                                        
                                    }
                                    break;
                            case 2: if(NG[i].p2 == null)
                                    {
                                        NG[i].p2 = nuevo;
                                        NG[i].c2 = costo;
                                        flag = true;
                                        
                                    }
                                    break;
                            case 3: if(NG[i].p3 == null)
                                    {
                                        NG[i].p3 = nuevo;
                                        NG[i].c3 = costo;
                                        flag = true;
                                    }
                                    break;
                            default: System.out.println("Excede el grado");
                        }
                        j++;
                    } while (flag == false);
                    
                    k=1;
                    flag = false;
                    do
                    {
                        switch(k)
                        {
                            case 1: if(nuevo.p1 == null)
                                    {
                                        nuevo.p1 = NG[i];
                                        nuevo.c1 = costo;
                                        flag = true;
                                        
                                    }
                                    break;
                            case 2: if(nuevo.p2 == null)
                                    {
                                        nuevo.p2 = NG[i];
                                        nuevo.c2 = costo;
                                        flag = true;
                                        
                                    }
                                    break;
                            case 3: if(nuevo.p3 == null)
                                    {
                                        nuevo.p3 = NG[i];
                                        nuevo.c3 = costo;
                                        flag = true;
                                    }
                                    break;
                            default: System.out.println("Excede el grado");
                        }
                        k++;
                    } while (flag == false);
                }
            }           
        }
        cantidad++;
    }
    public void mostrar()
    {
        int i;
        for(i=0;i<cantidad;i++)
        {
            NG[i].mostrar();
        }
    }
}
