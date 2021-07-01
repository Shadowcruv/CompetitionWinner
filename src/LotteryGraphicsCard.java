/* Getting a single-occupancy room in a dormitory is very tough because of high demand. There's one especially large
   and comfortable room in your dorm that everybody covets. The housing office runs a lottery at the beginning of a
   quarter. Students must submit their entries before the lottery and choose 3 cards of their choice
   (if there's no winner, then the room will be auctioned at ebay). The result of the lottery will consists of three
   cards. The numbers on a card range from 10 to 15, and the color of a card can be red, green,o or blue.

    We will write a program that will select a winning combination of 3 random lottery cards. Any student who possess
    such 3 cards that your program runs takes the room.

 */



import javax.swing.*;
import java.util.*;
import java.awt.*;


public class LotteryGraphicsCard {
    public static final int MAX_NO = 15;
    public static final int MIN_NO = 10;
    private Random random;
    public int Drawn;
    private int Colour;
    //1 - green, 2-Blue, 3 -Red
    public static final int Cmax = 3;
    public static final int Cmin = 1;
    private static final int HEIGHT = 70;
    private static final int WIDTH = 50;
    public static enum Crayons{Green, Blue, Red}



    public LotteryGraphicsCard(){
      Drawn = 0;
      Colour = 0;
      random = new Random();
    }
    public void spin(Graphics w,int xOrigin, int yOrigin){
     Drawn = random.nextInt(MAX_NO - MIN_NO +1)+MIN_NO;
     Colour = random.nextInt(Cmax -Cmin +1)+ Cmin;


     switch(Colour){
         case 1 : System.out.println("Green " +Drawn);
                   w.setColor(Color.GREEN);
                   break;
         case 2 : System.out.println("Blue "+ Drawn);
                  w.setColor(Color.BLUE);
                   break;
         case 3 : System.out.println("Red " + Drawn);
                  w.setColor(Color.RED);
     }
      try{Thread.sleep(100);} catch (Exception e) {}

      w.fillRect(xOrigin,yOrigin,WIDTH, HEIGHT);
      w.setColor(Color.white);
      w.drawString(" " + Drawn,xOrigin + WIDTH/4,yOrigin + HEIGHT/2 );




    }
    //public int getColor(){

      //  return Colour;
    //}
    public int getDrawn(){
        return Drawn;
    }


}
