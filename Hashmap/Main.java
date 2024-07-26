import java.util.*;
class Main{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Lavisha",89);
        map.put("Suryansh",98);
        map.put("Anushka",90);
        System.out.println(map.get("Anushka"));
        //getOrDefault("apoorv",78) conatainsKey("Karan")
        HashSet<Integer> set=new HashSet<>();
        set.add(89);
        set.add(67);
        set.add(89);
        set.add(78);
        set.add(23);
        set.add(56);      
    }
   
}