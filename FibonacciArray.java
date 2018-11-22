package fibonacciarray;

import java.util.Scanner;


public class FibonacciArray {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int a=sc.nextInt();
        
        int array[] = new int[a];
        System.out.println("Enter ("+a+") element:");
        for(int i=0;i<a;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Array Elements={");
        for(int j=0;j<a;j++){
            System.out.print(array[j]);
            if(j!=(a-1)){
                System.out.print(", ");
            }
        }
        System.out.println("};");
        String choice="";
        do{
        System.out.println("Convert array elements to: "
                + "\n[0] Factorial"
                + "\n[1] Fibonacci");
         choice=sc.next();
        if(choice.equals("1")){
            display1(array);
            System.exit(0);}
            else if(choice.equals("0")){
            display2(array);
                System.exit(0);
        }
        }while(!choice.equals("1")||!choice.equals("0"));
    }
    
    public static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    
    public static void display1(int arr[]){
        for(int order = 0 ; order<arr.length ; order++){

            System.out.print("f("+arr[order]+") \t");

        }
        System.out.println("");
        for(int order = 0 ; order<arr.length ; order++){

            System.out.print(fib(arr[order])+"\t");
        }
    }

    static int fact (int n){
        if(n<=1){
        return 1;

        }else{
        return n* fact(n-1);
        }
    }
    
    
   public static void display2(int arr[]) {
        for(int order = 0 ; order<arr.length ; order++){

            System.out.print("f("+arr[order]+") \t");

        }
        System.out.println("");
        for(int order = 0 ; order<arr.length ; order++){

            System.out.print(fact(arr[order])+"\t");
        }
   }
}
