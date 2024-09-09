package my_first_java_project;

import java.util.Scanner;

public class Do_while {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        do{
            System.out.println("Enter Your Name: ");
            name = scanner.nextLine();
        }while(name.isBlank());
        
        System.out.println("Hello "+name);
         
    }
    
}
