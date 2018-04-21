/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Punto7 {
    Auto aut[]=new Auto [9];
    Scanner scan= new Scanner(System.in);
    
    
    public void asignar (){
        aut[0]=new Auto("ODM 957", "Ford", "Fiesta", "Negro", "Nafta");
        aut[1]=new Auto("AXZ 752", "Peugeot", "407", "Rojo", "Nafta");
        aut[2]=new Auto("ODM 123", "Fiat", "Bravo", "Negro", "Nafta");
        aut[3]=new Auto("OCX 643", "Ferrari", "California T", "Blanco", "Nafta");
        aut[4]=new Auto("OZC 523", "Fiat", "500", "Azul", "Nafta");
        aut[5]=new Auto("OWQ 534", "Hyundai", "Elantra", "Magenta", "Nafta");
        aut[6]=new Auto("SDA 423", "Honda", "Civic", "Verde", "Nafta");
        aut[7]=new Auto("AXZ 123", "Citroen", "C1", "Blanco", "Nafta");
        aut[8]=new Auto("ASD 933", "Dacia", "Duster", "Negro", "Nafta");
        listar();
        agregarEstado();
    }
    public void listar (){
        for (int i=0;i<9;i++){
            System.out.print((i+1) + ": ");
            System.out.print("Patente: " + aut[i].getPatente());
            System.out.print("  Marca:" + aut[i].getMarca());
            System.out.print("  Modelo:" + aut[i].getModelo());
            System.out.print("  Color:" + aut[i].getColor());
            System.out.print("  Combustible:" + aut[i].getCombustible());
            if (aut[i].getEstado() != null)
            {
                System.out.print(" Estado:" + aut[i].getEstado());
            }
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------");
        }
    }
    public void agregarEstado(){
        char res='s';
        while (res=='s' || res=='S'){
            System.out.println("Quiere poner el estado de algun vehiculo? s/n");
            res=scan.next().charAt(0);
            if (res =='s' || res== 'S'){
                System.out.println("Ingrese el numero al vehiculo que le quiere poner el estado: ");
                int aux=scan.nextInt();
                System.out.print("Escriba el estado:" );
                aut[aux-1].setEstado(scan.next());
        }
        listar();
    }
}
}