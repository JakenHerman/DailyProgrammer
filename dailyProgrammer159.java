/*

############################################################
# Challenge 159: Rock Paper Scissors Lizard Spock Pt. 1    #
# Date: June 11, 2014                                      #
############################################################


*/

import java.util.*;
import javax.swing.*;

public class dailyProgrammer159 {
 
  public static void main(String[] args){
  
  Random RNG = new Random();
  int computerSelect = RNG.nextInt(5);
  
  String[] computerStr = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
  String compSel = computerStr[computerSelect];
  
  String userInput = JOptionPane.showInputDialog("CHOOSE: Rock Paper Scissors Lizard Spock:");
  
  if (compSel.equalsIgnoreCase("Rock")){
	  if (userInput.equalsIgnoreCase("Lizard")){
		  JOptionPane.showMessageDialog(null, "Rock Crushes Lizard, you lose!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Scissors")){
		  JOptionPane.showMessageDialog(null, "Rock Crushes Scissors, you lose!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Paper")){
		  JOptionPane.showMessageDialog(null, "Paper Covers Rock, you win!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Spock")){
		  JOptionPane.showMessageDialog(null, "Spock vaporizes rock, you win!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Rock")){
		  JOptionPane.showMessageDialog(null, "Tied game! You both chose rock");
		  System.exit(0);
	  }
	  else{
		  JOptionPane.showMessageDialog(null, "ERROR");
		  System.exit(0);
	  }
  }
  
  else if (compSel.equalsIgnoreCase("Paper")){
	  if (userInput.equalsIgnoreCase("Paper")){
		  JOptionPane.showMessageDialog(null, "Tied game! You both chose paper");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Scissors")){
		  JOptionPane.showMessageDialog(null, "Scissors cut Paper! You Win!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Rock")){
		  JOptionPane.showMessageDialog(null, "Paper covers Rock! You Lose!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Spock")){
		  JOptionPane.showMessageDialog(null, "Paper Disproves Spock! You Lose!");
		  System.exit(0);
	  }
	  else if (userInput.equalsIgnoreCase("Lizard")){
		  JOptionPane.showMessageDialog(null, "Lizard Eats Paper! You win!");
		  System.exit(0);
	  }
	  else{
		  JOptionPane.showMessageDialog(null, "ERROR");
	  }
  }
  
  else if (compSel.equalsIgnoreCase("Scissors")){
	   if (userInput.equalsIgnoreCase("Scissors")){
		   JOptionPane.showMessageDialog(null, "Tied Game! You both chose Scissors!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Paper")){
		   JOptionPane.showMessageDialog(null, "Scissors cuts Paper! You Lose!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Rock")){
		   JOptionPane.showMessageDialog(null, "Rock crushes scissors! You win!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Lizard")){
		   JOptionPane.showMessageDialog(null, "Scissors decapitate Lizard. You lose!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Spock")){
		   JOptionPane.showMessageDialog(null, "Spock smashes Scissors! You win!");
		   System.exit(0);
	   }
	   else {
		   JOptionPane.showMessageDialog(null, "ERROR");
		   System.exit(0);
	   }
	  }
  
  else if (compSel.equalsIgnoreCase("Lizard")){
	   if (userInput.equalsIgnoreCase("Lizard")){
		   JOptionPane.showMessageDialog(null, "Tied Game! You both chose Lizard!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Spock")){
		   JOptionPane.showMessageDialog(null, "Lizard Poisons Spock! You lose!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Scissors")){
		   JOptionPane.showMessageDialog(null, "Scissors decapitate Lizard! You win!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Paper")){
		   JOptionPane.showMessageDialog(null, "Lizard eats paper! You lose!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Rock")){
		   JOptionPane.showMessageDialog(null, "Rock Crushes Lizard! You win!");
		   System.exit(0);
	   }
	   else{
		   JOptionPane.showMessageDialog(null, "ERROR");
		   System.exit(0);
	   }
	  }
  
  else if (compSel.equalsIgnoreCase("Spock")){
	   if (userInput.equalsIgnoreCase("Spock")){
		   JOptionPane.showMessageDialog(null, "Tied game! You both chose Spock!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Rock")){
		   JOptionPane.showMessageDialog(null, "Spock vaporizes rock. You lose.");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Paper")){
		   JOptionPane.showMessageDialog(null, "Paper disproves Spock. You win!");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Scissors")){
		   JOptionPane.showMessageDialog(null, "Spock smashes scissors. You lose.");
		   System.exit(0);
	   }
	   else if (userInput.equalsIgnoreCase("Lizard")){
		   JOptionPane.showMessageDialog(null, "Lizard poisons spock. You win!");
		   System.exit(0);
	   }
	   else {
		   JOptionPane.showMessageDialog(null, "ERROR");
		   System.exit(0);
		   
	   }
	  }
  else {
	  System.out.println("An error has occured");
  }
 }

}


