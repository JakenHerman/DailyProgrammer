import java.util.*;

public class unitConverter {

  public static void main(String[] args){
    
    //there are 2.54 cm in 1 inch
    Scanner scan = new Scanner(System.in);
    System.out.println("How many inches should I convert to Centi?");
      double userInches = scan.nextInt();
      
    double convert = userInches * 2.54;
    
    System.out.println("There are "+convert+" centimeters in "+userInches+" inches");
    
  }

}
