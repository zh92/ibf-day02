package day02card;

public class Card {
    
    /* Cards
     * Attributes/Members
     *  - Values
     *  - Suits
     * 
     * Methods
     *  - revealCard
     */

    private int value;
    private String name;
    private String suit;

    public Card(String suit, Integer value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: %s, Suit: %s, Value: %d, name, suit, value";
    }

    public String getName() {return this.name;}

    public int getValue() {return this.value;}

    public String getShape() {return suit;}

    //public void revealCard() {
    //    System.out.printf("The card is: %s of %d, getShape(), getNum()");
}
