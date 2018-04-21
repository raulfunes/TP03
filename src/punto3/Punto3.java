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
    int a;
    int b;
    int c;
    
    
    
    
    public void verificar(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese los lados del triangulo");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        if (a+b>c && b+c>a && a+c>b){
            armar();
        }
        else
            System.out.println("El triangulo no puede armarse");
    }

    public void armar(){
        System.out.println("El perimeto es " + (a+b+c));
}
}