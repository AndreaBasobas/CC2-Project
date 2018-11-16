package multidarray;
import java.util.*;

public class MultiDArray {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter the number of rows: ");
    int row = input.nextInt();
    
    System.out.print("Enter the number of columns: ");
    int columns = input.nextInt();

    String [][] names = new String [row][columns];

    for (int i = 0; i < columns; i++)
    {
        for (int j = 0; j < row; j++)
        {
            System.out.print(" row  " + (j + 1) + " column : ");
            names[i][j] = input.next();
        }
        System.out.println( " " );
    }
    for(int i =0; i<names.length; i++){
        System.out.println("\n Row:\t" + i+" Column: " +i);
        for(int j=0; j<names.length;j++){
            System.out.print(names[i][j]+"\t");
        }
    }

   }

}
