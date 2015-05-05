
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   GUI implements the GUI, extending JFrame
   */


public class GUI extends JFrame
{
   private JButton button;
   private JPanel panel;
   private JLabel title, gameOver;
   private int winner = 0;
   
   public GUI()
   {
      setLayout(new GridLayout(3,3));
      
      Game game = new Game();
      
      button = new JButton("Play");
      
      panel=new JPanel();
      title = new JLabel("War");
      panel.add(title);
      
      add(panel);
   }
   
   
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         while (winner==0)
         {
            Play play = new Play();
         }
         
         if (winner==1)
         {
            gameOver = new JLabel("Player 1 Wins!");
         }
         
         if (winner==2)
         {
            gameOver = new JLabel("Player 2 Wins!");
         }
         
         if (winner==3)
         {
            gameOver = new JLabel("It's a tie!");
         }
         add(gameOver);
      
      
      }
   
   
   }
}