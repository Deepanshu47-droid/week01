import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generating random heights between 150 cm and 250 cm for each player
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 + (0 to 100)
        }

        // Displaying heights of players
        System.out.print("Heights of players (in cms): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculating and display the results
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the mean height of players
    public static double calculateMean(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    // Method to find the shortest height of players
    public static int findShortestHeight(int[] array) {
        int shortest = array[0];
        for (int value : array) {
            if (value < shortest) {
                shortest = value;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of players
    public static int findTallestHeight(int[] array) {
        int tallest = array[0];
        for (int value : array) {
            if (value > tallest) {
                tallest = value;
            }
        }
        return tallest;
    }
}
