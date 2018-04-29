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
public class Punto {
    private int x;
    private int y;
    Scanner scan= new Scanner(System.in);

    public Punto() {
    }

    public Punto(int x1, int y1) {
        this.x=x1;
        this.y=y1;
    }
    public void asignarRapido(){
        System.out.print("x:");
        setX(scan.nextInt());
        System.out.print("y:");
        setY(scan.nextInt());
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
