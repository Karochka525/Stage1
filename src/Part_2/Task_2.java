package Part_2;

public class Task_2 {
    public static String removeNotLetters(String str) {
        char[] temp_array  = str.toCharArray();
        for (int i = 0; i < temp_array.length; i++){
            if (!Character.isLetter(temp_array[i])){
                temp_array[i] = ' ';
            }
        }
        return new String(temp_array);
    }
}
