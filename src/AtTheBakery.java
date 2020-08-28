import java.util.ArrayList;
import java.util.Scanner;

/*
Add Muffins, Donuts to the array list
Prompt the user to suggest an item to be offered at the bakery
Save the user input into the array list
Shuffle values of array list and print out the results

Output:
Welcome to the Bakery.
We currently have Muffins, Donuts
Would you like to add an item (q to quit)?
cakes
Would you like to add an item (q to quit)?
rolls
Would you like to add an item (q to quit)?
breads
Would you like to add an item (q to quit)?
q

Great!
We currently have breads, Donuts, cakes, Muffins, rolls
 */
public class AtTheBakery {
    public static void main(String[] args) {
        ArrayList<String> cakes = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String answer = "";

        System.out.println("Welcome to the Bakery.\nWe currently have Muffins, Donuts.");


        do {
            System.out.println("Would you like to add an item (q to quit)?");
            answer = input.nextLine();

            cakes.add(answer);

        } while (!answer.equalsIgnoreCase("q"));
            cakes.remove("q");

        System.out.println("Great!\nWe currently have " + cakes);
    }
    }

