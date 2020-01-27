import java.awt.*;
import java.util.Random;



public abstract class Bird {
    private static int num=0;
  //  protected int a=0;
  //  protected int b=400;


    protected  int y;
    protected  int x;
    protected static int xmin=200;
    protected static int xmax=-200;
    protected static int ymax=-200;
    protected static int ymin=200;
    protected static int xmin_parrot=200;
    protected static int xmax_parrot=-200;
    protected static int ymax_parrot=-200;
    protected static int ymin_parrot=200;
    protected static int size=10;
    protected Color color=Color.magenta;
    public Bird() {
        Random a=new Random();
        num++;

       // y=-MyFrame.width/2+a.nextInt(MyFrame.width);
        //x=-MyFrame.width/2+a.nextInt(MyFrame.width);
     //   System.out.println("x: " + x);
     //   System.out.println("y: " + y);
     //   System.out.println("Я птица № "+num);


    }

    /*public void fly() {
        System.out.println("Я лечу");
    }*/

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }
}
