import java.util.Random;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        
        // Initialize the deck by combining ranks and suits
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        // Shuffle the deck by swapping each card with a random card from the remaining deck
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + rand.nextInt(deck.length - i);  // Generate a random index between i and deck.length
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        // Check if the number of cards can be evenly distributed to the players
        if (n % x != 0) {
            System.out.println("Cards cannot be evenly distributed.");
            return new String[0][0];  // Return an empty array if distribution is not possible
        }

        // Create a 2D array to store the players' hands
        String[][] players = new String[x][n / x];
        
        // Distribute the cards to players
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n / x; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print the players' cards
    public static void printPlayersCards(String[][] players) {
        int playerNumber = 1;
        for (String[] player : players) {
            System.out.println("Player " + playerNumber + " has: ");
            for (String card : player) {
                System.out.println(card);
            }
            System.out.println();
            playerNumber++;
        }
    }

    public static void main(String[] args) {
        int n = 52;  // Total number of cards in the deck
        int x = 4;   // Number of players

        // Initialize, shuffle, and distribute cards
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, n, x);

        // Print the cards each player has
        if (players.length > 0) {
            printPlayersCards(players);
        }
    }
}
