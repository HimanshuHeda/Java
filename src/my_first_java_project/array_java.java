package my_first_java_project;

public class array_java {

    public static void main(String[] args) {
        
        String[] cars = new String[3];
        
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[1]);
        }
    }    
}
