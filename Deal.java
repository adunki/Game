import java.util.*;
import java.util.Arrays;
import java.util.Stack;

/**
   Deal deals the cards
   */


public class Deal
{
   public static void main(String[]args)
   {
      //Build the deck
      int [] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,
         19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,
         39,40,41,42,43,44,45,46,47,48,49,50,51,52};      
      
      int hand = 1,  //designates which hand the card will be dealt to
          randInt,   //stores the random integer used to select a card
          card;      //stores the card which will be added to the stack
      
      //Declare the two hands as stacks
      Stack hand1 = new Stack();
      Stack hand2 = new Stack();
      
      //Deal the cards
      while (numbers.length>=1)
      {
         //Get a random card
         Random ran = new Random();
         randInt = ran.nextInt(numbers.length);
         card = numbers[randInt];
         
         //Give that card to the next plaer
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
      
      System.out.println(hand1 + " " + hand2);
   }
}