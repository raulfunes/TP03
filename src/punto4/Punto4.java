/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Punto4 {
    int[] i= new int [10];
    Scanner scan= new Scanner (System.in);
    
    
    public void iniciarPunto4(){
        ingresarN(i);
        mostrar(i);
        calcularMenor(i);
        calcularMayor(i);
        calcularPromedio(i);
    }
    
    public void ingresarN(int[] i){
        for (int j=0; j<10; j++){
            System.out.print("Escriba un numero: ");
            i[j]=scan.nextInt();
        }
    }
    
    public void mostrar (int[] i){
        System.out.print("Los numeros son: ");
        for (int j=0; j<10; j++){
            System.out.print(i[j] + " ");
        }
    }
    public void calcularMenor (int[] i)
    {
        int aux=0;
        for (int j=0; j<10; j++){
                if (i[aux]>i[j])
                    aux=j;
           }
        
        System.out.println("");
        System.out.println("El menor es: " + i[aux]);
    }
        public void calcularMayor (int[] i)
    {
        int aux=0;
            for (int j=0; j<10; j++){
                if (i[aux]<i[j])
                    aux=j;
           }
        System.out.println("El mayor es: " + i[aux]);
    }
        public void calcularPromedio (int[] i ){
            int aux=0;
            for (int j=0; j<10; j++){
                aux=aux+i[j];
            }
            System.out.println("El promedio es " + aux/10);
        }
}
