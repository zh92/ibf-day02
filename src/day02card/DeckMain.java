package day02card;

public class DeckMain {

    public static void main(String[] args){
        
        Deck deck = new Deck();
        System.out.printf(">> before; %s\n", deck);
        deck.shuffle();
        
        System.out.printf(">> after: %s\n", deck);


       // Random rand = new SecureRandom();
       // List<Deck> d = new LinkedList<>();
       // d.add("A5");
       // System.out.println(d);


    }
}
