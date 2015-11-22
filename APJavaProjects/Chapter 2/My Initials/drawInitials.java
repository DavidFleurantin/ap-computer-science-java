// Programmer: David Fleurantin
// Date: September 15, 2014

import TurtleGraphics.*;
import java.awt.Color;
import BreezySwing.*;

class drawInitials {//  a class should begin with a capital -- call this DrawInitials gdk
 
 public static void main(String[] args){
 
   
  StandardPen mypen = new StandardPen();
  mypen.drawString(" Programmmer: David Fleurantin ");

mypen.setColor(Color.red);

  mypen.drawString        (" **********      ");
        mypen.drawString  (" **        **    ");
        mypen.drawString  (" **         **   ");
        mypen.drawString  (" **          **  ");
        mypen.drawString  (" **          **  ");
        mypen.drawString  (" **          **  ");
        mypen.drawString  (" **         **   ");
        mypen.drawString  (" **        **    ");
        mypen.drawString  (" **********      ");

mypen.setColor(Color.blue);

 mypen.drawString         ("   ************       ");
        mypen.drawString  ("         **           ");
        mypen.drawString  ("         **           ");
        mypen.drawString  ("         **           ");
        mypen.drawString  ("         **           ");
        mypen.drawString  ("         **           ");
        mypen.drawString  ("         **           ");
        mypen.drawString  ("         **           ");
        mypen.drawString  (" *********            ");

mypen.setColor(Color.green);
 
        mypen.drawString  (" ************ ");
        mypen.drawString  (" **           ");
        mypen.drawString  (" **           ");
        mypen.drawString  (" **           ");
        mypen.drawString  (" ************ ");
        mypen.drawString  (" **           ");
        mypen.drawString  (" **           ");
        mypen.drawString  (" **           ");
        mypen.drawString  (" **           ");

    }
 }

