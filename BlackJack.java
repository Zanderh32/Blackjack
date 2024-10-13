import java.util.*;
public class BlackJack{
    public static Player player;
    public static Player computer;
    public static Deck deck;
    public static void main(String[] args){
        deck = new Deck();
        List<Card> hand = new ArrayList<Card>();
        int score = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Blackjack");
        System.out.println("Please enter your name:");
        player = new Player(scan.nextLine());
        computer = new Player("Computer"); 
        deck = new Deck();

        player.getHand().add(deck.getDeck().pop());
        computer.getHand().add(deck.getDeck().pop());
        player.getHand().add(deck.getDeck().pop());
        computer.getHand().add(deck.getDeck().pop());

        boolean turn = true;
        while(turn){
            System.out.println("Your hand is: "+ player.getHand());
            System.out.println("Blackjack Value: "+ player.HandValue());
            System.out.println("Would you like to hit or stay? H/S");
            String hos = scan.nextLine();
            if(hos.equalsIgnoreCase("H")){
                player.getHand().add(deck.getDeck().pop());
                if(player.HandValue() > 21){
                    System.out.println("You busted!");
                    turn = false;
                }
            } else {
                System.out.println("You stayed!");
                turn = false;
            }
        }
        System.out.println("Your hand is: "+ player.getHand());
        System.out.println("Blackjack Value: "+ player.HandValue());

        System.out.println("Computer hand is: "+ computer.getHand());
        System.out.println("Computer Blackjack Value: "+ computer.HandValue());
    }
}

