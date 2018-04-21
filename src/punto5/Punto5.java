/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Windows10
 */
public class Punto5 {
    ArrayList <Circulo> listaCirculo= new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    public void ingresar (){
        System.out.print("Cuantos circulos desea ingresar? ");
        int n=scan.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Ingrese el radio: ");
            listaCirculo.add(new Circulo(scan.nextInt()));
            listaCirculo.get(i).setSuperficie(listaCirculo.get(i).getR()*listaCirculo.get(i).getR()*Math.PI);
        }
    listar();
    }
    public void listar(){
        for(int i=0; i<listaCirculo.size();i++){
            System.out.println("El radio del circulo es: " + listaCirculo.get(i).getR());
            System.out.println("La superficie del circulo es: " + listaCirculo.get(i).getSuperficie());
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }
}
