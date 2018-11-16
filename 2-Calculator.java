package calculator;

import java.io.*;

public class Calculator {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter first value: ");
        Double value1 = Double.parseDouble(br.readLine());
        
        System.out.println("Enter Operator: ");
        String op = br.readLine();
        
        
        System.out.println("Enter second value: ");
        Double value2 = Double.parseDouble(br.readLine());
        
        if(op.equals("+") || op.equals("add")){
            System.out.println("Total: " + (value1 + value2));
            
        }
        else if (op.equals("-") || op.equals("subtract")){
            System.out.println("Total: " + (value1 - value2));
            
        }
        else if (op.equals("*") || op.equals("multiply")){
            System.out.println("Total: " + (value1 * value2));
            
        }
        else if (op.equals("/") || op.equals("divide")){
            System.out.println("Total: " + (value1 * value2));
        }       
        
    }
    
}
