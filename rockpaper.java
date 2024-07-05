
import java.util.*;

public class rockpaperscissors{
    public static String userChoice(Scanner sc){
        String userMove;
        while(true){
            System.out.println("Choose your move from: \"Rock\",\"Paper\",\"Scissors\" ");
            userMove=sc.nextLine();
            if(userMove.equals("Rock")||userMove.equals("Paper")|| userMove.equals("Scissors"))
                System.out.println();
            break;
            
        }
        return userMove;
        
    }
    public static String computerChoice(Random rd){
        int computerMove=rd.nextInt(3)+1;
        
        switch(computerMove){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return("Error");
                
        }
        
    }
    public static String winner(String userMove, String computer){
        String wn;
        System.out.println("Your move : " + userMove);
        System.out.println("Computer move : " + computer);
        System.out.println();
        if(userMove.equals(computer)){
            System.out.println("It is a tie.");
    }
    while(true){
        if(userMove.equals("Rock")){
            if(computer.equals("Paper")){
                wn="Computer";
                System.out.println("Winner = "+wn);
                System.out.println("Try next time");
                System.out.println();
        }
            else if(computer.equals("Scissors")){
                wn="User";
                System.out.println("Winner = "+wn);
                System.out.println("Congratulations");
                System.out.println();
            }
    }
        else if(userMove.equals("Paper")){
            if(computer.equals("Rock")){
                wn="User";
                System.out.println("Winner = "+wn);
                System.out.println("Congratulations");
                System.out.println();
        }
            else if(computer.equals("Scissors")){
                wn="Computer";
                System.out.println("Winner = "+wn);
                System.out.println("Try next time");
                System.out.println();
            }
    }
        else if(userMove.equals("Scissors")){
            if(computer.equals("Rock")){
                wn="Computer";
                System.out.println("Winner = "+wn);
                System.out.println("Try next time");
                System.out.println();
        }
            else if(computer.equals("Paper")){
                wn="User";
                System.out.println("Winner = "+wn);
                System.out.println("Congratulations");
                System.out.println();
            }
    }
        else{
            System.out.println("Invalid move");
            System.out.println();
        }
    
   return computer; 
    }
}
    public static boolean play(Scanner sc){
        String playagain;
        System.out.println("Will you play another session?");
        while(true){
            System.out.println("Type: 'yes' or 'no' ");
            playagain=sc.nextLine();
            
            if(playagain.equals("Yes")|| playagain.equals("yes")||playagain.equals("No")||playagain.equals("no")){
                System.out.println();
                break;
            }
            else{
                System.out.println("Invalid Move");
                System.out.println();
            }
        }
       return playagain.equals("yes");
}
    
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      Random rd=new Random();
      
      boolean continueplay=true;
      
      while(continueplay){
      String userMove,computer;
      userMove=userChoice(sc);
      computer=computerChoice(rd);
      winner(userMove,computer);
      continueplay=play(sc);
      
  }
      
      
      System.out.println("Thank you for playing");
      sc.close();

  }
}