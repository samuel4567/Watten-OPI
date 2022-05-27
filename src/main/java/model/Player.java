package model;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * Player class, contains methods that the user can execute.
 */
public class Player {


    /**
     * The cards the user hold in his hands.
     */
    private List<Card> cards;
    public Player(){
    }
    /**
     * This methode will throw a card. The methode will fail if the card cannot be thrown because of
     * the "Zuageben" rule, if the player does not have the card or if the player is not authorised to throw a card.
     * @param card The card the player wants to throw.
     * @return The card which will be thrown.
     */
    private final boolean throwCard(Card card) throws ExecutionControl.NotImplementedException {

         throw new ExecutionControl.NotImplementedException("");
    }

    /**
     * Ask the enemy team if they accept increased points for the winner. If they decline the round ends and
     * the this.team will win the round.
     * @return True if the other team accepted. Otherwise, the next round will begin.
     * @throws ExecutionControl.NotImplementedException
     */
    private final boolean biaten()  throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    /**
     * The user shows a card he wants to "unsogen". The card will be part of the new card which will be formed with
     * the card the other player shows.
     * @param card The card the user wants to show.
     * @return the card which "goes".
     */
    private final Card ansagen(Card card)throws ExecutionControl.NotImplementedException{
        throw new ExecutionControl.NotImplementedException("");
    }
    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
