import java.util.Stack;

/**
   Play extends Game
   */
public class Play extends Game
{
   
   public Play()
   {
      int winner = 0;
      //Create stacks for 'War'
      Stack cardUp1 = new Stack();
      Stack cardUp2 = new Stack();
      
      //Play first card for each player
      cardUp1.push(hand1.pop());
      cardUp2.push(hand2.pop());
      
      
      while ((cardUp1%13) == (cardUp2%13))
      {
         cardUp1.push(hand1.pop());
         cardUp1.push(hand1.pop());
         cardUp2.push(hand2.pop());
         cardUp2.push(hand2.pop());
      }
      
      if ((cardUp1%13) > (cardUp2%13))
      {
         bank1.push(cardUp1.pop());
         bank1.push(cardUp2.pop());
         winner = 1;
      }
      if ((cardUp1%13) < (cardUp2%13))
      {
         bank2.push(cardUp1.pop());
         bank2.push(cardUp2.pop());
         winner = 2;
      
      }
   }
      
   




}