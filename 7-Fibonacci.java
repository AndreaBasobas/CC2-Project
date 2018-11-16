package fsequence;
import java.util.*;

public class Fsequence {
    public static int x;
    public static void main(String[] args) {

        userInput();
        display();
        
        

    }
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter a number: ");
        x= sc.nextInt();
    }
    public static void display(){
        
        for(int i=0; i<=x; i++){
            System.out.print("f("+ i +")\t");
         } 
        
        for(int i= 0; i <=x; i++){
            System.out.println("");
                for(int q=0; q<=i; q++){
            System.out.print("" + fibo2(q)+"\t");
                }
        }
        
    }
    public static int fibo2(int num){
        if(num ==0){
           
            return 0;
        }else if(num==1){
            return 1;
        }else{
            return fibo2(num-1)+fibo2(num-2);
        }
        
    }
}

