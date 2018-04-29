/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Punto3 {
    int[] arr = new int[3];
    
    
    
    
    public void verificar(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese los lados del triangulo");
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        if (arr[0]+arr[1]>arr[2] && arr[1]+arr[2]>arr[0] && arr[0]+arr[2]>arr[1]){
            armar();
        }
        else
            System.out.println("El triangulo no puede armarse");
    }

    public void armar(){
        System.out.println("El perimeto es " + (arr[0]+arr[1]+arr[2]));
}
}