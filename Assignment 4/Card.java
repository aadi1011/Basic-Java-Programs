/*  A menu-driven Java Program for the following: There are 52 cards in 
*   a deck, each of which belongs to one of four suits and one of 13 ranks. 
*   Represent a deck of cards as an array of Objects
*/
// Operations in the Deck.java file
// Code by Aadith Sukumar (https://github.com/aadi1011)

public class Card 
{
    private String suit;
    private String value;
    
    //constructor
    public Card(String suit, String value) 
    {
        this.suit = suit;
        this.value = value;
    }
    
    //Adding the getter and setter functions for each of the two variable parameters
    public String getSuit() 
    {
        return suit;
    }

    public void setSuit(String suit) 
    {
        this.suit = suit;
    }

    public String getValue() 
    {
        return value;
    }

    public void setValue(String value) 
    {
        this.value = value;
    }

    public String toString()
    {
        return value + " of " + suit;
    }
    
}
