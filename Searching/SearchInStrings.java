import java.util.Arrays;

public class SearchInStrings{
 public static void main(String[] agrs){
    String name="Lavisha";
    char target='n';
    System.out.println(search2(name,target));
    System.out.println(Arrays.toString(name.toCharArray()));

 }  
 static boolean search2(String str,char target){
    if(str.length()==0){
        return false;

    }
    for(char ch:str.toCharArray()){
        if(ch==target){
            return true;
        }
    }
    return false;
 }
 static boolean search(String str,char target){
    if(str.length()==0){
        return false;

    }
    for(int i=0;i<str.length();i++){
        if(target==str.charAt(i)){
            return true;
        }
    }
    return false;
 }

}