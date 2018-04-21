/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Punto8 {
    ArrayList <Libro> lib= new ArrayList();
    Scanner scan= new Scanner (System.in);
    public void elegir (){
        int op=1;
        while (op!=3){
            System.out.println("1.Cargar Libro");
            System.out.println("2.Buscar Libro");
            System.out.print("3.Salir  ");
            op=scan.nextInt();
            switch (op){
                case 1:cargarLibro();
                break;
                case 2:buscar();
                break;
                case 3:System.out.println("Adios");
                break;
                default: System.out.println("Opcion no valida");
                break;
            }
        }
    }
    public void cargarLibro (){
        lib.add(new Libro());
        System.out.print("ISBN: ");
        lib.get(lib.size()-1).setISBN(scan.nextInt());
        System.out.print("Titulo: ");
        lib.get(lib.size()-1).setTitulo(scan.next());
        System.out.print("Autor: ");
        lib.get(lib.size()-1).setAutor(scan.next());
        System.out.print("Precio: ");
        lib.get(lib.size()-1).setPrecio(scan.nextInt());
        listar();
    }
    public void listar (){
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Listado:");
        System.out.println("");
        for (int i=0; i<lib.size(); i++){
            System.out.print("ISBN: " + lib.get(i).getISBN());
            System.out.print(" Titulo:"+ lib.get(i).getTitulo());
            System.out.print(" Autor:"+lib.get(i).getAutor());
            System.out.println(" Precio:" + lib.get(i).getPrecio() + "$");
            System.out.println("");
            System.out.println("----------------------------------------------------------------------------------------------");
        }
    }
    public void buscar(){
        boolean encontrado=false;
        System.out.print("Que libro desea buscar? ");
        String aux=scan.next();
        for (int i=0; i<lib.size(); i++){
            if (lib.get(i).getTitulo().equals(aux)){
                System.out.println("----------------------------------------------------");
                System.out.println("Libro Encontrado");
                System.out.print("ISBN: " + lib.get(i).getISBN());
                System.out.print(" Autor:"+lib.get(i).getAutor());
                System.out.println(" Precio:" + lib.get(i).getPrecio() + "$");
                System.out.println("-----------------------------------------------------------------");
                encontrado=true;
    }
}
        if (encontrado!=true)
            System.out.println("No encontrado");
}
}