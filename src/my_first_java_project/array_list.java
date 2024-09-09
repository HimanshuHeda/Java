package my_first_java_project;

import java.util.ArrayList;

public class array_list {

    public static void main(String[] args) {
        
        // ArrayList = a resizable array. Elements can added and removed after compilation phase store refrence data types
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        
        // food.set(0, "sushi");
        // food.remove(2);
        // food.clear();
        
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
        
    }
    
}
