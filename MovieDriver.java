import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput;
        int ticks;
        boolean choice = true;
        
        while (choice) {
            Movie mov1 = new Movie();
            System.out.println("Name of movie: ");
            userInput = reader.nextLine();
            mov1.setTitle(userInput);
            System.out.println("Rating for \"" + mov1.getTitle() + "\": ");
            userInput = reader.nextLine();
            mov1.setRating(userInput);
            System.out.println("Number of tickets sold for \"" + mov1.getTitle() + "\": ");
            ticks = reader.nextInt();
            mov1.setSoldTickets(ticks);
            System.out.println(mov1.toString());
            
            System.out.println("Do you want to enter another? (y or n): ");
            reader.nextLine();
            userInput = reader.nextLine();
            
            if (userInput.equalsIgnoreCase("n")) {
                choice = false;
            }
        }
    
        System.out.println("end");
        reader.close();
    }
}
