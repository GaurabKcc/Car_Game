import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Race");
        System.out.println("Press Start ot begin!");
        System.out.println("Press Hint for some clues!");

        boolean running = false;

        while (true){
            String command = input.nextLine();

            if (command.equalsIgnoreCase("Start")){
                if (running==false){
                    running = true;
                    System.out.println("The car is moving reeeaalllyyy fast!");
                }
                else{
                    System.out.println("The car is ALREADY moving reeeaalllyyy fast!");
                }

            }
            else if (command.equalsIgnoreCase("Stop")){
                if (running==true){
                    running = false;
                    System.out.println("The car has stopped.");
                }
                else{
                    System.out.println("The car has already stopped");

                }

            }
            else if (command.equalsIgnoreCase("Hint")){
                System.out.println("Type Start to begin the race");
                System.out.println("Type Stop to stop the car");
                System.out.println("Type Quit to stop the race");
            }
            else if (command.equalsIgnoreCase("Quit")){
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        }

    }
}