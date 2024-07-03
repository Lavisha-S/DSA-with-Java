public class MethodOverloading {
    public static void main(String[] args) {
        fun(8);
        fun("Lavisha");
    }
    static void fun(int a){
        System.out.println("1st "+ a);
    }
    static void fun(String b){
        System.out.println("1st "+ b);
    }
    }
