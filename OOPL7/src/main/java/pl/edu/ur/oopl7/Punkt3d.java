/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author ACER
 */
public class Punkt3d extends Punkt2D {

    public double z;

    


    public Punkt3d(double x, double y, double z) {
     super(x,y);
        this.z = z;
    }
    public Punkt3d() {
 
        this.z = 0;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
     
    
    @Override
    public String toString(){
        return "Współrzędne punktu trójwymiarowego: X="+getX()+", Y="+getY()+", Z="+getZ(); 
    }
    
}
