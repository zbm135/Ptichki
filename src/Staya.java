import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Staya{
    private ArrayList<Bird> f;
    private String[] names = {"aaa", "bbbb", "ccccc"};

    public Staya() {
        f = new ArrayList<>();

        Scanner a = new Scanner(System.in);
        int num=0;
       // int k=1;
        while (num != 4) {
            System.out.println("Каких птиц вы хотите сосздать? 1-попугай,2-пингвин,3-воробей,4-ввод закончен");
            num = a.nextInt();
            if(num==1){
                f.add(new Parrot());
            }
            if(num==2){
                f.add(new Pinguin());
            }
            if(num==3){
                f.add(new Vorobey());
            }
        }
        a.close();
    }

   /* public void fly(){
       for(int i=0;i<f.size();i++){
           f.get(i).fly();
       }
    }*/


    public void draw(Graphics g){
        for(int i=0;i<f.size();i++){
            f.get(i).draw(g);
        }
    }

}
