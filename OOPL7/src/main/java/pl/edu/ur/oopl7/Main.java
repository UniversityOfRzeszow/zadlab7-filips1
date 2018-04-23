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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punkt2D v=new Punkt2D();
        v= new Punkt2D (0,0);
        v.setX(v.Losowy());
        v.setY(v.Losowy());
        System.out.println(v.toString());
        Punkt3d t=new Punkt3d();
        t= new Punkt3d (0,0,0);
        t.setX(t.Losowy());
        t.setY(t.Losowy());
         t.setZ(t.Losowy());
        System.out.println(t.toString());
        
        Punkt2D[] punkty2d=new Punkt2D[100];
        Punkt3d[] punkty3d=new Punkt3d[100];
        for (int i=0;i<100;i++){
        punkty2d[i]=new Punkt2D(0,0);
        punkty3d[i]= new Punkt3d (0,0,0);
    }
        for (int i=0;i<100;i++){
         punkty2d[i].setX(punkty2d[i].Losowy());
         punkty2d[i].setY(punkty2d[i].Losowy());
        }
        for (int i=0;i<100;i++){
         punkty3d[i].setX(punkty3d[i].Losowy());
         punkty3d[i].setY(punkty3d[i].Losowy());
         punkty3d[i].setZ(punkty3d[i].Losowy());
        }
        for (int i=0;i<100;i++){
            for (int j=0;j<100;j++){
            if(punkty2d[i].getX()==punkty3d[j].getX() && punkty2d[i].getY()==punkty3d[j].getY()){
                System.out.println(punkty2d[i].toString());
                System.out.println(punkty3d[j].toString());
            }
            }
        }
    }
    
}
