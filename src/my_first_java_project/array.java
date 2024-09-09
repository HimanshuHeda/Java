package my_first_java_project;

public class array {

    public static void main(String[] args) {
        
        // array = used to store multiple values in a single variable
    
        String[] cars = new String[3];
    
        cars[0] = "Mustang";
        cars[1] = "Tesla";
        cars[2] = "Camaro";
    
        for(int i=0; i<cars.length; i++){
            
            System.out.println(cars[i]);
        
        }    
    }
}
