import model.Card;
import model.Schlog;

/**
 *Cardcoperator
 */
public class CardComparator {
    /**
     * Compares the two cards with eachother.
     * @param ansage the card which "goes"
     * @param card1
     * @param card2
     * @return True if card1 is better card2 otherwise
     */
    public boolean compareCards(Card ansage, Card card1, Card card2) {
        if (isGuater(ansage, card1))
            return true;
        if (isGuater(ansage, card2))
            return false;
        if (isRechter(ansage, card1))
            return true;
        if (isRechter(ansage, card2))
            return false;
        if (isSchlog(ansage, card1))
            return true;
        if (isSchlog(ansage, card2))
            return false;
        if (checkSameForbe(card1, card2))
            return compareSameForbe(ansage, card1, card2);
        if (checkSameForbe(ansage,card1))
            return true;
        if (checkSameForbe(ansage,card2))
            return false;
        return true;
    }

    private boolean isGuater(Card ansage, Card card) {
        if (card.getSchlog().getNumVal() == (ansage.getSchlog().getNumVal() + 1) && checkSameForbe(ansage, card))
            return true;
        if (ansage.getSchlog() == Schlog.ASS && card.getSchlog() == Schlog.SIEBMER && checkSameForbe(ansage, card))
            return true;
        return false;
    }

    private boolean isRechter(Card ansage, Card card) {
        return card.equals(ansage);
    }

    private boolean isSchlog(Card ansage, Card card1) {
        return card1.getSchlog() == ansage.getSchlog();
    }

    private boolean checkSameForbe(Card card1, Card card2) {
        return card1.getForbe() == card2.getForbe();
    }

    private boolean compareSameForbe(Card ansage, Card card1, Card card2) {
        return card1.getSchlog().getNumVal() > card2.getSchlog().getNumVal();
    }
}
