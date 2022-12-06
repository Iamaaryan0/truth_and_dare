import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        
        System.out.println("TRUTH OR DARE?");
        System.out.println();
        System.out.println("Type type truth or dare!");
        System.out.println();
        
        int truth = 1 + (int)(Math.random() * ((12 - 1) + 1));   // Random number from 1-12
        int dare = 12 + (int)(Math.random() * ((23 - 12) + 1));  // Random number from 13-23
            
        String truthOrDare = myObj.nextLine();
        System.out.println();
        
        if (truthOrDare.equals("truth") || truthOrDare.equals("Truth") || truthOrDare.equals("T") || truthOrDare.equals("true") || truthOrDare.equals("t")) {
            System.out.println(truth);
        } else {
            System.out.println(dare);
        }
    
        System.out.println();
    
    // TRUTH Cases ******************************************************************
        
        switch (truth) {
  case 1:
    System.out.println("When was the last time that you lied?");
    break;
  case 2:
    System.out.println("What's your biggest fantasy?");
    break;
  case 3:
    System.out.println("What is a secret your parents don't know?");
    break;
  case 4:
    System.out.println("Who is your celebrity crush?");
    break;
  case 5:
    System.out.println("What is the most trouble you have been in?");
    break;
  case 6:
    System.out.println("Do you have a hidden talent?");
    break;
  case 7:
    System.out.println("What is the last lie that you told?");
    break;
  case 8:
    System.out.println("What was your most physically painful experience?");
    break;
  case 9:
    System.out.println("If you met a genie, what would your three wishes be?");
    break;
  case 10:
    System.out.println("Who are you most jealous of?");
    break;
  case 11:
    System.out.println("Boxers or Briefs?");
    break;  
  case 12:
    System.out.println("If you were guaranteed to never get caught, who would you murder?");
    break;    
        
    
    // DARE Cases ********************************************************************
    
  case 13:
    System.out.println("Show the most embarrassing photo on your phone!");
    break;
  case 14:
    System.out.println("Eat a raw piece of garlic!");
    break;
  case 15:
    System.out.println("Put 10 different available liquids into a cup and drink it!");
    break;
  case 16:
    System.out.println("Eat a Spoonful of mustard!");
    break;
  case 17:
    System.out.println("Drink Lemon juice!");
    break;  
  case 18:
    System.out.println("Eat a packet of hot sauce or ketchup!");
    break;
  case 19:
    System.out.println("Lick a bar of soap!");
    break;  
  case 20:
    System.out.println("Crack an egg on your head!");
    break;   
  case 21:
    System.out.println("Spin around 12 times and try to walk straight!");
    break;
  case 22:
    System.out.println("Eat a raw egg!");
    break;
  case 23:
    System.out.println("Do 100 squats!");
    break;
    
        }
        
        // Restart **********************************************************
        
        System.out.println();
        
        System.out.println("Would you like to play again? (type y/n and hit enter)");
        
        String y = myObj.nextLine();
        
        System.out.println();
        
        if (y.equals("y")) {
            Main.main(args);
        } else {
            System.out.println("Ok, Bye!");
        }
        
        System.out.println();
    }
}
