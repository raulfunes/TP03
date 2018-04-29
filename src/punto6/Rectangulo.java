/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;


/**
 *
 * @author Windows10
 */
public class Rectangulo {
    private int b;
    private int h;
    private int x;
    private int y;


    public Rectangulo(int b, int h, int x, int y) {
        this.b = b;
        this.h = h;
        this.x = x;
        this.y = y;

    }
    
    public Rectangulo() {
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
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