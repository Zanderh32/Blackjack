import java.util.*;

class Deck 
{
    public enum Suit{
        Hearts,Spades,Clubs,Diamonds
    }
    private Stack<Card> stack;
    public Deck(){

        stack = new Stack<Card>();
        ArrayList<String> list = new ArrayList<String>();
        list.add(" of " + Suit.Hearts.toString());
        list.add(" of " + Suit.Spades.toString());
        list.add(" of " + Suit.Clubs.toString());
        list.add(" of " + Suit.Diamonds.toString());
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <= 13; j++){
                stack.push(new Card(j, list.get(i)));

            }
        }
        shuffle(); //shuffles the deck
    }

    public Stack<Card> getDeck() {return stack;}

    public void shuffle(){
        Collections.shuffle(stack);
    }

}