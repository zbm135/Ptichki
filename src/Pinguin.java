import java.awt.*;
import java.util.Random;
import java.util.Scanner;




public class Pinguin extends Bird  {
    public Pinguin(){

       // }
       /* color= Color.ORANGE;
        if(x<xmin){
            xmin=x;
        }
        if(x>xmax){
            xmax=x;
        }
        if(y>ymax){
            ymax=y;
        }
        if(y<ymin){
            ymin=y;
        }
        System.out.println("xmin= "+xmin);
        System.out.println("xmax= "+xmax);
        System.out.println("ymin= "+ymin);
        System.out.println("ymax= "+ymax);*/

    }
    //@Override
    public void fly(){
       // System.out.println("Я не хочу летать!");
    }
    @Override
    public void draw(Graphics g) {

        g.setColor(color);
        g.fillOval(x,y,size,size);
        g.setColor(Color.white);
        g.fillOval(x+size/2-(size-5)/2,y+size/2-(size-5)/2,size-5,size-5);
        g.setColor(Color.red);

        System.out.println("Я пингвин!");

       // g.drawLine();


       // g.drawRect(xmin,ymin,xmax-xmin+size,ymax-ymin+size);
    }

}
