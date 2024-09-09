package my_first_java_project;

import java.util.Scanner;

public class if_loop {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
         
        int age;
        System.out.println("Enter age : ");
        age = scanner.nextInt();
        
        if(age>=75){
            System.out.println("You are an adult !!");
        }
        
        else if(age>=18){
            System.out.println("Ok Boomer!");
        }
        
        else{
            System.out.println("You are not an adult !!");
        }
    }
}

