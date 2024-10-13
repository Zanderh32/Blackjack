# BlackJack

**BlackJack** is a simple Java-based console game that simulates the classic Blackjack card game. The player competes against the computer, aiming to get as close to 21 as possible without going over.

## Features

- **Player vs Computer**: Face off against the computer in a game of Blackjack.
- **Full Card Deck**: A deck of 52 shuffled cards is used for each game.
- **Hit or Stay Mechanic**: Players can choose to hit (draw a card) or stay (keep their current hand).
- **Ace Handling**: Aces are treated as 1 or 11, depending on which is more advantageous for the player's hand.
- **Bust Detection**: If a player's hand exceeds 21, they automatically lose.

## How the Game Works

1. **Game Setup**:
   - The deck is shuffled at the start of each game.
   - Both the player and the computer are dealt two cards.
   - The player takes their turn first, choosing whether to hit or stay.

2. **Gameplay**:
   - Number cards (2-10) count as their face value.
   - Face cards (Jack, Queen, King) are worth 10 points.
   - Aces can be worth either 1 or 11, depending on which benefits the player more.
   - The player can choose to hit (draw another card) or stay with their current hand.

3. **Winning**:
   - If the player's hand value is 21 or less, the computer reveals its hand.
   - The winner is determined by who has a hand value closest to 21 without exceeding it.

## Installation and Running the Game

### Prerequisites

- Java Development Kit (JDK) installed.

### Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/BlackJack.git
   cd BlackJack
2. Compile the Program:
  ```bash
  javac BlackJack.java Deck.java Card.java Player.java
  ```
2. Run the Program:
  ```bash
  java BlackJack.java
