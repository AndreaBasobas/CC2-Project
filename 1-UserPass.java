package userpass;
import java.util.*;

public class UserPass {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter Username: ");
        String user = sc.nextLine();
        
        System.out.println("Enter Your Password: ");
        
        String love = sc.nextLine();
        
        System.out.println("Please Verify Your Password: ");
        String pass = sc.nextLine();
        
        if (pass.equals(love)){
            System.out.println("Correct Password");
            
        }    
        else{
            System.out.println("Invalid Password!");
        }
        
    }
    
}
