import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    
    int[][] twoDee = new int[3][5];
    int val=1;
    //Store incremental values in row major order
    for(int row=0; row< twoDee.length; row++)
    {
      for(int col=0; col<twoDee[row].length; col++)
      {
        twoDee[row][col]=val;
        val++;
      }
      //This spot here represents the completion of one row
      System.out.println(Arrays.toString(twoDee[row]));
    }

    //Print out the total sum of each row in the following
    //format:
    //Row 0: 15
    //Row 1: ...

    for(int row=0; row< twoDee.length; row++)
    {
      val=0;
      for(int col=0; col<twoDee[row].length; col++)
        val+=twoDee[row][col];
      //This spot here represents the completion of one row
      System.out.println("Row "+ row + ": " + val);
    }

    //Print out the sum of each column in the following format:
    //Column 0: ??
    //Column 1: ??
    // ...
    //Column 5: ??
    for(int col=0; col<twoDee[0].length; col++)
    {
      val=0;
      for(int row=0; row<twoDee.length; row++)
        val+=twoDee[row][col];
      System.out.println("Column "+ col + ": " + val);
    }
  }
}
