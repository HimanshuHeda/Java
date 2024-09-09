package my_first_java_project;

public class sting {

    public static void main(String[] args) {
        
        //Sting = a reference data type that can store one or more characters reference data types have access to useful methods
        
        String name ="Himanshu    H";
        
//        boolean result = name.equals("Harsh");
//        boolean result = name.equalsIgnoreCase("Harsh");    ---> both returns false 
//        int result = name.length();                         ---> it will return the value 8   
//        char result = name.charAt(1);                       ---> it will return i
//        int result = name.indexOf("s");                     ---> it will show the position of the letter it returns 5
//        boolean result = name.isEmpty();                    ---> it will return true
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = name.trim();
        String result = name.replace('H', 'T');

        System.out.println(result);
    }
}
