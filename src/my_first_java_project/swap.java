package my_first_java_project;

public class swap {
    
    public static void main(String[] args){
        
        String x = "Red"; 
        String y = "Green"; 
        String temp;
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    } 
}
