/* Getting a single-occupancy room in a dormitory is very tough because of high demand. There's one especially large
   and comfortable room in your dorm that everybody covets. The housing office runs a lottery at the beginning of a
   quarter. Students must submit their entries before the lottery and choose 3 cards of their choice
   (if there's no winner, then the room will be auctioned at ebay). The result of the lottery will consists of three
   cards. The numbers on a card range from 10 to 15, and the color of a card can be red, green,o or blue.

    We will write a program that will select a winning combination of 3 random lottery cards. Any student who possess
    such 3 cards that your program runs takes the room.

 */


import javax.swing.*;
import java.awt.*;

public class RoomWinner {
    public static void main(String[] args){
      Graphics f;
      Container contentPane;
      JFrame myWindow = new JFrame();
      myWindow.setTitle("The Window");
      myWindow.setSize(1200,700);
      myWindow.setVisible(true);

      contentPane = myWindow.getContentPane(); contentPane.setBackground(Color.BLACK);
      f = contentPane.getGraphics();

      LotteryGraphicsCard cardOne,cardTwo,cardThree;
      cardOne = new LotteryGraphicsCard();

      cardTwo = new LotteryGraphicsCard();

      cardThree = new LotteryGraphicsCard();

      cardOne.spin(f,50,50);

      cardTwo.spin(f,500,50);

      cardThree.spin(f,850,50);



  /*   System.out.println(
     // cardOne.getColor()+" "+
      cardOne.getDrawn() +"\n" +

     // cardTwo.getColor() + " "+
      cardTwo.getDrawn()+ "\n" +

      //cardThree.getColor() + " "+
      cardThree.getDrawn()
        );
 */   }
}
