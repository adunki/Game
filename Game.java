import java.util.*;
import java.util.Arrays;
import java.util.Stack;

/**
   Class Game builds the deck and deals the cards, as well as plays the game
   */


public class Game
{
   /**
      Default constructor accepts no arguments, builds the deck
   */
   public Game() 
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
      Stack bank1 = new Stack();
      Stack bank2 = new Stack();
      
      //Deal the cards
      while (numbers.length>=1)
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
      
     /*
     Plays the game
     
     
      //Create stacks for 'War'
      Stack cardUp1 = new Stack();
      Stack cardUp2 = new Stack();
      
      //Play first card for each player
      cardUp1.push(hand1.pop());
      cardUp2.push(hand2.pop());
    //  int card1 = (int)hand1.pop();
      
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
      */
      } 
   }
