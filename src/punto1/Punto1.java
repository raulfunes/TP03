/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Punto1 {
    ArrayList <Punto> listaPuntos=new ArrayList();
    Scanner scan= new Scanner(System.in);
    public void calcularDistancia(){
        listaPuntos.add(new Punto());
        listaPuntos.get(0).asignarRapido();
        listaPuntos.add(new Punto());
        listaPuntos.get(1).asignarRapido();
        double d=(Math.pow(listaPuntos.get(1).getX()-listaPuntos.get(0).getX(), 2)+Math.pow(listaPuntos.get(1).getY()-listaPuntos.get(0).getY(), 2));
        d= Math.sqrt(d);
        System.out.println("La distancia es " + d);
    }
}
