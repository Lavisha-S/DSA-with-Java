

public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);//this will be shadowed by line 9
        int x;
      //  System.out.println(x); Scope begin when value or variable initialized
      
        x=40;
        System.out.println(x);//this shadows the line 6 
        fun();

    }
    static void fun(){
        System.out.println(x);
    }

    
}
