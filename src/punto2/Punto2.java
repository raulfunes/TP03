/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;
import punto1.Punto;

/**
 *
 * @author Windows10
 */
public class Punto2 {
    Rectangulo rectangulo=new Rectangulo();
    Punto punto=new Punto(0,0);
    Scanner scan=new Scanner (System.in);
    public void hacer(){
        System.out.print("Ingrese la base: ");
        rectangulo.setB(scan.nextInt());
        System.out.print("Ingrese la altura: ");
        rectangulo.setH(scan.nextInt());
        System.out.println("Escriba la posicion del punto");
        punto.asignarRapido();
        mostrarPosicion();
        mostrarSuperficie();
        mostrarPerimetro();
}
    
    public void mostrarPosicion(){  
        Punto punto2=new Punto(punto.getX()+rectangulo.getB(), punto.getY());
        Punto punto3=new Punto(punto.getX(), punto.getY()+rectangulo.getH());
        Punto punto4=new Punto(punto.getX()+rectangulo.getB(), punto.getY()+rectangulo.getH());
        System.out.println("Punto 1 x: " + punto.getX() + " Punto 1 y: " + punto.getY());
        System.out.println("Punto 2 x: " + punto3.getX() + " Punto 2 y: " + punto3.getY());
        System.out.println("Punto 3 x: " + punto2.getX() + " Punto 3 y: " + punto2.getY());
        System.out.println("Punto 4 x: " + punto4.getX() + " Punto 4 y: " + punto4.getY());
    }
    public void mostrarSuperficie(){
        System.out.println("La superficie es: " + rectangulo.getB()*rectangulo.getH());
    }
    public void mostrarPerimetro(){
        System.out.println("El perimetro es: " + (rectangulo.getB()*2+rectangulo.getH()*2));
    }
}