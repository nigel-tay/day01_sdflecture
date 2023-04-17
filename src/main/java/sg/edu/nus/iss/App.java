package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Console con = System.console();
        String name = con.readLine("What is your name?"); // We are saying that the input will be a string because we
                                                          // declared it so
        Integer age = 3;
        String mother_name = "Jane";
        // If there is more than one of the same variable type, the arguments will be in
        // order as specfied in params

        if (name.length() > 0) {
            System.out.printf("Nice to meet you, %s, your mother's name is %s and your age is %d years old", name,
                    mother_name, age);
        }
        else {
            System.err.println("You have not told me your name lol.");
        }

        String input = con.readLine("What is your hobby?");
        input = input.trim();

        if (input.equals("swim")) {
            System.out.println("Splash");
        }
    }
}
