import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int count[] = new int[10];
    System.out.println("Enter the number of integers you would like to input (Max 10): ");
    int num = in.nextInt();
    System.out.println("Input " + num + " integers: ");
    for (int i = 0; i < num; i++)
    {
      int n = in.nextInt();
      count[--n]++;
    }
    
    int max = 0;
    for (int n: count)
    {
      if (max < n)
      {
        max = n;
      }
    }
    System.out.println("Mode value is: ");
    for (int i = 0; i < count.length; i++)
    {
      if (count[i] == max)
      {
        System.out.println(i + 1);
      }
    }
  }
}
