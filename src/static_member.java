public class static_member {
    

        static int sum(int x, int y){
            return(x+y);
        }
        static int product(int x,int y){
            return(x*y);
        }
        
        static int div(int x,int y){
            return(x/y);
        }
        static int remainder(int x,int y){
            return(x%y);
        }
    
        public static void main(String[] args) {
        
                int a;
                a = static_member.sum(4, 5);
                int b;
                b = static_member.product(a, 2);
                int c;
                c = static_member.div(15 , 3);
                int d;
                d = static_member.remainder(18, 4);
                System.out.println("a = "+a);
                System.out.println("b = "+b);
                System.out.println("c = "+c);
                System.out.println("d = "+d);
            
        }
    }

