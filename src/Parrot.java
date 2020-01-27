import java.awt.*;

public class Parrot extends Bird {
   private  String name="Кеша";
   private static int num=0;
    public Parrot(){
        System.out.println("Я попугай");
        num++;
       // System.out.println("Я попугай № "+num);
        /*if(x<xmin_parrot){
            xmin_parrot=x;
        }
        if(x>xmax_parrot){
            xmax_parrot=x;
        }
        if(y>ymax_parrot){
            ymax_parrot=y;
        }
        if(y<ymin_parrot){
            ymin_parrot=y;
        }*/
    }

    public Parrot(String name){
        this.name=name;
        //System.out.println("Я попугай "+name);
        num++;
        //System.out.println("Я попугай № "+num);
}
    public void speak(){
   // System.out.println("Мое имя "+name);
}
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
       return this.name;

    }
    public void Check(Pinguin a){
   // System.out.println("Я не дружу с пингвинами");
    }
    public void Check(Parrot a){
      //  System.out.println("Привет попугай "+a.getName());
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.setColor(color);
        g.fillOval(x,y,size,size);
       // g.drawRect(xmin_parrot,ymin_parrot,xmax_parrot-xmin_parrot+size,ymax_parrot-ymin_parrot+size);
    }

}
