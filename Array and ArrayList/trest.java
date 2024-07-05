import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class trest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
int k;
int[] num={9,9,9,9,9,9,9,9,9,9,9};
        
        k=in.nextInt(); 
            ArrayList<Integer> result= new ArrayList<>();
            int temp=0;
            
            for(int v:num){
                
                
                    temp=temp*10+v;
                    System.out.println(temp);
                           
            }
            temp=temp+k;
            System.out.println(temp);
            
          
            while(temp!=0){
                int rem=temp%10;
                result.add(rem);
                temp=temp/10;
              
            }
            Collections.reverse(result);
    
          
    
    
         System.out.println( result);
        }
    }
    

