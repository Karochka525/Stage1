package Part_1;

public class Task9 {
    public static void isPolyndrom(String str){
        str = str.toLowerCase().replaceAll(" ", "");
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println("Это не полиндром");
                return;
            }
        }
        System.out.println("Это полиндром");
    }
}
