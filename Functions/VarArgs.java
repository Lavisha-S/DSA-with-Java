
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun( 2,4,45,67,3,56);
    }
   static void fun(int ...v) {
    System.out.println(Arrays.toString(v));
   }
}
