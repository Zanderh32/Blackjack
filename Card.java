
class Card
{
    enum face {
        Ace,Jack,Queen,King;    
    }
    private int value;
    private String suit ;
    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue(){return value;}

    public String getSuit(){return suit;}

    public String getTextValue(){
        if(getValue() == 1){
            return face.Ace.toString();
        } else if(getValue() > 1 && getValue() < 11){
            return value + "";
        } else if(getValue() == 11){ return face.Jack.toString();}
        else if(getValue() == 12){return face.Queen.toString();}
        else {return face.King.toString();}
    }

    public String toString(){
        return getTextValue() + getSuit();
    }
}