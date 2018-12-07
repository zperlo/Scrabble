import java.util.Queue;
import java.util.LinkedList;

/**
 * DEPRICATED. CLASS "Deck" IS USED INSTEAD
 *
 * This is a class that represents a deck of attack cards.
 * It stores all NaturalDisasterCard objects in an array, and uses a
 * queue to store the order of the shuffled cards.
 *
 * @author Zach Perlo
 * @version 1.0
 * @since 2018-10-26
 */
public class NaturalDisasterDeck {
   private final int deckSize = 20;
   private NaturalDisasterCard[] deck = new NaturalDisasterCard[deckSize];
   private Queue<NaturalDisasterCard> shuffledDeck = new LinkedList<>();

    /**
     * This method draws a card from the shuffled deck queue.
     * If the queue is empty we call shuffleDeck() to refill the shuffledDeck
     * queue in a new randomized order than before.
     * @return The top natural disaster card in the queue.
     * @see NaturalDisasterCard
     * @see java.util.Queue
     * @see java.util.LinkedList
     */
   public NaturalDisasterCard draw() { //later implement to randomize and put in stack so no repeats
      if(shuffledDeck.isEmpty()){
         shuffleDeck();
      }
      return shuffledDeck.remove();
   }
   
   public void setDeck(int index, NaturalDisasterCard card){
      this.deck[index] = card;
   }

   /**
    * This method populates the shuffledDeck queue with every natural disaster card in deck,
    * in a random order.
    * @see NaturalDisasterCard
    * @see java.util.Queue
    * @see java.util.LinkedList
    */
   public void shuffleDeck(){
      NaturalDisasterCard[] tempDeck = deck.clone();
      while(shuffledDeck.size() < deckSize) {
         int rand = (int) (Math.random() * (this.deckSize));
         if(tempDeck[rand] != null) {
            shuffledDeck.add(tempDeck[rand]);
            tempDeck[rand] = null;
         }
      }
   }
}