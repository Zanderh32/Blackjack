import java.util.*;

class Player
{
    private String name;
    private List<Card> hand;
    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }
    public String getName(){return name;}
    public List<Card> getHand() {return hand;}
    public int HandValue() {
        int handValue = 0;
        for(int i = 0 ; i < hand.size(); i++){
            int cardValue = hand.get(i).getValue();
            if(cardValue == 1){handValue += 11;}
            else if(cardValue > 10){handValue += 10;}
            else {handValue += cardValue;}
        }
        for(int i = 0; i < hand.size(); i++){
            int cardValue = hand.get(i).getValue();
            if(handValue > 21 && cardValue == 1){
                handValue -= 10;
            }
        }
        return handValue;
    }
}