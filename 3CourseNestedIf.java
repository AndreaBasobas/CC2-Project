package nestedif;
import java.io.*;

public class NestedIf {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("COURSES: \n"
                    + "[1] Information Technology \n"
                    + "[2] Computer Science \n"
                    + "[3] BSDA \n"
                    + "Enter the number of your course: ");
        String course = br.readLine();
        
        if(course.equalsIgnoreCase("IT") || course.equals("1")){
            System.out.println("MAJORS: \n"
                    + "[1] Network and Security \n"
                    + "[2] Web Development \n"
                    + "[3] Entertaiment Resource Plan \n"
                    + "Enter the number of your major: ");
        String major = br.readLine();
        
        if (major.equalsIgnoreCase("Network and Security") || major.equals("1")){
            System.out.println("Your Course Is: Information Tecnology \n"
                    + "Your Major Is: Network and Security");
            
        } else if (major.equalsIgnoreCase("Web Development") || major.equals("2")){
            System.out.println("Your Course Is: Information Technology \n"
                    + "Your Major Is: Web Development");
            
        } else if (major.equalsIgnoreCase("Entertainment Resource Plan") || major.equals("3")){
            System.out.println("Your Course Is: Information Technology \n"
                    + "Your Major Is: Entertainment Resource Plan");
        } else {
            System.out.println("Invalid Input");
            
        }
        
        } else if (course.equalsIgnoreCase("Computer Science") || course.equals("2")){
            System.out.println("MAJORS: \n"
                    + "[1] Digital Arts and Animation \n"
                    + "[2] Mobile Developing \n"
                    + "Enter the number of your major: ");
            String major = br.readLine();
            if (major.equalsIgnoreCase("Digital Arts and Animation") || major.equals("1")){
            System.out.println("Your Course: Computer Science \n"
                        + "Your Major: Digital Arts and Animation");
        
        } else if (major.equalsIgnoreCase("Mobile Developing")|| major.equals("2")){
                System.out.println("Your Course: Computer Science \n"
                        + "Your Major: Mobile Developing");
                
        } else {
            System.out.println("Invalid Input");
            
        }
                
        } else if (course.equalsIgnoreCase("BSDA") || course.equals("3")){
            System.out.println("Your Course is BSDA");
                
        } else {
            System.out.println("Invalid Input");
                
            
                }
            }
            
        }
