/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author ACER
 */
public class Punkt2D {
    public double x;
    public double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punkt2D() {
        this.x = 1;
        this.y = 1;
        
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    Random generator = new Random();
    public void setY(double y) {
        this.y = y;
    }
    public double Losowy(){
        double r=((generator.nextDouble()-0.5));
        r=r*200;
        r= Math.round(r);
        r=r/10;
        
        return r;
    }
    @Override
    public String toString(){
        return "Współrzędne punktu dwuwymiarowego: X="+getX()+", Y="+getY(); 
    }
    
    
}
