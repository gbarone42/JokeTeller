package com.JOKETELL;
import java.util.Scanner; // Import the Scanner class to read input
import java.util.Random;  // Import the Random class for generating random numbers

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        Random random = new Random(); // Create a Random object for generating random numbers

        // Array of 42 jokes\
        // Your jokes array initialization here as you've done
        // Array of jokes, placeholder for 42 jokes
        String[] jokes = new String[42];
        jokes[0] = "I invented a new word! Plagiarism!";
        jokes[1] = "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!";
        jokes[2] = "Why do we never tell secrets on a farm? Because the potatoes have eyes and the corn has ears.";
        jokes[3] = "Why don't skeletons fight each other? They don't have the guts.";
        jokes[4] = "I told my computer I needed a break, and now it won't stop sending me vacation offers.";
        jokes[5] = "Why don't eggs tell jokes? They'd crack each other up.";
        jokes[6] = "I'm reading a book on anti-gravity. It's impossible to put down!";
        jokes[7] = "Why did the scarecrow win an award? Because he was outstanding in his field!";
        jokes[8] = "I only know 25 letters of the alphabet. I don't know y.";
        jokes[9] = "How does the ocean say hi? It waves!";
        jokes[10] = "What did one wall say to the other wall? I'll meet you at the corner!";
        jokes[11] = "What do you call cheese that isn't yours? Nacho cheese!";
        jokes[12] = "Why couldn't the bicycle stand up by itself? It was two-tired!";
        jokes[13] = "What did the grape say when it got stepped on? Nothing, but it let out a little wine!";
        jokes[14] = "I used to play piano by ear, but now I use my hands.";
        jokes[15] = "What's orange and sounds like a parrot? A carrot!";
        jokes[16] = "What's brown and sticky? A stick!";
        jokes[17] = "Why did the golfer bring two pairs of pants? In case he got a hole in one!";
        jokes[18] = "What do you call a factory that makes okay products? A satisfactory!";
        jokes[19] = "What do you get when you cross a snowman and a vampire? Frostbite!";
        jokes[20] = "I'm on a whiskey diet. I've lost three days already.";
        jokes[21] = "Why do bees have sticky hair? Because they use honeycombs!";
        jokes[22] = "What do you call an alligator in a vest? An investigator!";
        jokes[23] = "I told my wife she should embrace her mistakes. She hugged me.";
        jokes[24] = "Why don't scientists trust atoms anymore? Because they make up everything!";
        jokes[25] = "What's a skeleton's least favorite room in the house? The living room!";
        jokes[26] = "Why did the tomato turn red? Because it saw the salad dressing!";
        jokes[27] = "What do you call a dinosaur with an extensive vocabulary? A thesaurus!";
        jokes[28] = "I asked my dog what's two minus two. He said nothing.";
        jokes[29] = "Why did the coffee file a police report? It got mugged!";
        jokes[30] = "What do you call a belt made out of watches? A waist of time!";
        jokes[31] = "Why did the picture go to jail? Because it was framed!";
        jokes[32] = "What do you call a man with a rubber toe? Roberto!";
        jokes[33] = "What's the best thing about Switzerland? I don't know, but the flag is a big plus!";
        jokes[34] = "I would tell you a chemistry joke, but I know I wouldn't get a reaction.";
        jokes[35] = "What did the janitor say when he jumped out of the closet? Supplies!";
        jokes[36] = "What do you call a parade of rabbits hopping backwards? A receding hare-line.";
        jokes[37] = "Why don't some couples go to the gym? Because some relationships don't work out!";
        jokes[38] = "I'm thinking about removing my spine. I feel like it's only holding me back.";
        jokes[39] = "Why did the scarecrow become a successful neurosurgeon? He was outstanding in his field!";
        jokes[40] = "What do you call a fish wearing a crown? A king carp!";
        jokes[41] = "Why do programmers prefer dark mode? Because light attracts bugs!";
        
        System.out.println("Hello! Type 'dice' to throw a 42-sided dice and hear a joke, 'quit' to exit, or enter a number (1-42) to select a specific joke.");

        while (true) {
            System.out.println("Enter your choice:");
            String command = scanner.nextLine(); // Read the next line of input

            if (command.equalsIgnoreCase("dice")) {
                // Simulate throwing a 42-sided dice
                int diceRoll = random.nextInt(42) + 1; // Generate a number between 1 and 42
                System.out.println("You rolled a " + diceRoll + "! Here's your joke:");
                System.out.println(jokes[diceRoll - 1]); // Access the corresponding joke
            } else if (command.equalsIgnoreCase("quit")) {
                // Exit the loop if the user types 'quit'
                System.out.println("Goodbye!");
                break;
            } else {
                try {
                    // Check if the command is a number within the jokes range
                    int jokeNumber = Integer.parseInt(command);
                    if (jokeNumber >= 1 && jokeNumber <= 42) {
                        System.out.println("Joke number " + jokeNumber + ":");
                        System.out.println(jokes[jokeNumber - 1]); // Print the selected joke
                    } else {
                        // Handle out-of-range numbers
                        System.out.println("Please enter a valid option: a number between 1 and 42, 'dice', or 'quit'.");
                    }
                } catch (NumberFormatException e) {
                    // Handle non-integer inputs (other than 'dice' and 'quit')
                    System.out.println("Please enter a valid option: a number between 1 and 42, 'dice', or 'quit'.");
                }
            }
        }

        scanner.close(); // Close the scanner object
    }
}