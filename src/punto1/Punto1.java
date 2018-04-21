/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Punto1 {
    
    Punto punto1=new Punto(0,0);
    Punto punto2=new Punto(0,0);
    Scanner scan= new Scanner(System.in);
    public void calcularDistancia(){
        System.out.println("Dale valor al primer punto");
        System.out.print("x:");
        punto1.setX(scan.nextInt());
        System.out.print("y:");
        punto1.setY(scan.nextInt());
        System.out.println("Dale valor al segundo punto");
        System.out.print("x=");
        punto2.setX(scan.nextInt());
        System.out.print("y:");
        punto2.setY(scan.nextInt());
        double d=(Math.pow(punto2.getX()-punto1.getX(), 2)+Math.pow(punto2.getY()-punto1.getY(), 2));
        d= Math.sqrt(d);
        System.out.println("La distancia es " + d);
    }
}
