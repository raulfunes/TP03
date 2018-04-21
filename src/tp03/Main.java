/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;
import punto1.Punto1;
import punto2.Punto2;
import punto3.Punto3;
import punto4.Punto4;
import punto5.Punto5;
import punto6.Punto6;
import punto7.Punto7;
import punto8.Punto8;

/**
 *
 * @author Windows10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        elegirPunto();
        
                
    }
    public static void elegirPunto(){
        Punto1 punto1=new Punto1();
        Punto2 punto2=new Punto2();
        Punto3 punto3=new Punto3();
        Punto4 punto4=new Punto4();
        Punto5 punto5=new Punto5();
        Punto6 punto6=new Punto6();
        Punto7 punto7=new Punto7();
        Punto8 punto8= new Punto8();
        int op=1;
        Scanner scan= new Scanner(System.in);
        while (op!=9){
            System.out.println("");
            System.out.println("");
            System.out.println("1)Punto1");
            System.out.println("2)Punto2");
            System.out.println("3)Punto3");
            System.out.println("4)Punto4");
            System.out.println("5)Punto5");
            System.out.println("6)Punto6");
            System.out.println("7)Punto7");
            System.out.println("8)Punto8");
            System.out.println("9)Salir");
            System.out.println("---------------------------------------------------------");
            op=scan.nextInt();
            switch (op){
                case 1:punto1.calcularDistancia();
                break;
                case 2:punto2.hacer();
                break;
                case 3:punto3.verificar();
                break;
                case 4:punto4.iniciarPunto4();
                break;
                case 5:punto5.ingresar();
                break;
                case 6:punto6.llenarLista();
                break;
                case 7:punto7.asignar();
                break;
                case 8:punto8.elegir();
                break;
                case 9:System.out.println("Salir");
                break;
                default: System.out.println("Opcion no valida");
                break;
            }
            
        }
    }
}
