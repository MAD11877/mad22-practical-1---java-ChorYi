import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  { 
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
        
    Scanner in = new Scanner(System.in);
    
    //System.out.print("Enter weight in kilogram: ");
    double weight = in.nextDouble();
    
    //System.out.print("\nEnter height in metres: ");
    double height = in.nextDouble();
    
    double BMI = weight / (height * height);
    System.out.format("%.1f", BMI);
  }
}
