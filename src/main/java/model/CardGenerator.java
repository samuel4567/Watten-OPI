package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGenerator {
    public List<Card> getGemischelteKorten(){
        return mischeln(getAllCards());
    }

    /**
     * Creates a set of 33 cards
     * @return
     */
    public List<Card> getAllCards(){
        List<Card> cardList=new ArrayList<Card>();
        Schlog schlog;
        Forbe forbe;
        Card korte;
        schlog=Schlog.WELLI;
        forbe=Forbe.SCHELL;
        korte=new Card(schlog,forbe);
        cardList.add(korte);
        for (int schlogValue=7;schlogValue<15;schlogValue++) {
            korte.setSchlog(Schlog.getNameByValue(schlogValue));
            for (int forbeValue=0;forbeValue<4;forbeValue++){
                korte.setForbe(Forbe.getNameByValue(forbeValue));
                cardList.add(korte);
            }
        }
        return cardList;
    }

    /**
     * Shuffles a list
     * @param cardList
     * @return Shuffled list
     */
    private List<Card> mischeln(List<Card> cardList){
        Collections.shuffle(cardList);
        return cardList;
    }
}
