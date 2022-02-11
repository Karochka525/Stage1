public class Task5 {
    public static void symbolValue(String str) {
        char currSymb;
        for (int i = 0; i < str.length(); i++) {
            currSymb = str.charAt(i);
            System.out.print(currSymb+""+(int)currSymb);

        }
        System.out.println();
    }

}
