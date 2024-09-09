package my_first_java_project;

import java.util.Scanner;

public class user_input {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("What is Your Name ? ");
        String name= scanner.nextLine();
        System.out.println("What is your Age ? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your Fav. Food ? ");
        String food = scanner.nextLine();
        
        
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" Year Old");
        System.out.println("You like "+food);
        
    }
}
