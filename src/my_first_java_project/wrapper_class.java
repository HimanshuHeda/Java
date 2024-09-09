package my_first_java_project;

public class wrapper_class {
    
    public static void main(String[] args) {
        
        // Wrapper Class = provides a way to use primitive data types as refrence data types reference data types contain useful methods can be used with collections (ex.ArrayList)
        // premitive   wrapper
        // boolean     Boolean
        // char        Charater 
        // int         Integer
        // double      Double
        //autoboxing = the automatic conversion that the java compiler makes between the premitive types and their corrosponding object wrapper class
        // unboxing =  the reverse of autoboxing. Automatic coversion of wrapper class to premitive 
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Harsh";
        
        
        if(a==true){
            System.out.println("This is true");
        }
    }
            
}
