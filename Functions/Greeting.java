public class Greeting {
    public static void main(String[] args) {
        String personalised=greeting("Lavisha");
        System.out.println(personalised);
        
    }
    static String greeting(String greetName){
        String message="Hello! "+greetName;
        return message;
    }
}
