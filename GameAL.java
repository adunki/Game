

import java.util.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.ArrayList;

/*
   Class GameAL attempts to use an array list to create the deck
   */


public class GameAL
{
   public GameAL() 
   {
      //Build the deck
      
      ArrayList cards = new ArrayList(52);
      
      for (int i=1;i==13;i++)
      {
         Object newCard = new Object(i,"spades");
         cards[i-1] = newCard;
      }
      for (i=1;i==13;i++)
      {
         Object newCard = new Object(i,"diamonds");
         cards[i+12] = newCard;
      }
      for (i=1;i==13;i++)
      {
         Object newCard = new Object(i,"hearts");
         cards[i+25] = newCard;
      }
      for (i=1;i==13;i++)
      {
         Object newCard = new Object(i,"clubs");
         cards[i+38] = newCard;
      }
  
      
      int hand = 1,  //designates which hand the card will be dealt to
          randInt,   //stores the random integer used to select a card
          card;      //stores the card which will be added to the stack
      
      //Declare the two hands as stacks
      Stack hand1 = new Stack();
      Stack hand2 = new Stack();
      Stack bank1 = new Stack();
      Stack bank2 = new Stack();
      
      //Deal the cards
      while (cards.length>=1)
      {
         //Get a random card
         Random ran = new Random();
         randInt = ran.nextInt(numbers.length);
         card = numbers[randInt];
         
         //Give that card to the next player
         if (hand == 1)
         {
           hand1.push(card);
           hand = 2;
         }
         else if (hand == 2)
         {
            hand2.push(card);
            hand = 1;
         }
         
         //Remove that card by replacing it with the last one
         numbers[randInt]=numbers[numbers.length-1];
         numbers=Arrays.copyOf(numbers, numbers.length-1);
      }     
      
      
      //Create stacks for 'War'
      Stack cardUp1 = new Stack();
      Stack cardUp2 = new Stack();
      
      //Play first card for each player
     // cardUp1.push(hand1.pop());
     // cardUp2.push(hand2.pop());
      int card1 = (int)hand1.pop();
      
      //If it's a war
      while ((hand1.peek()%13) == (cardUp2.peek()%13))
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
      }
      if ((cardUp1%13) < (cardUp2%13))
      {
         bank2.push(cardUp1.pop());
         bank2.push(cardUp2.pop());
      
      } 
   }
}
