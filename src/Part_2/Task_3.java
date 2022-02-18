package Part_2;

public class Task_3 {

    public static String replaceEach(String str, int replaceIndex, String replace) {
        if (replaceIndex < 1) throw new IllegalArgumentException();
        String[] splitString = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String item : splitString) {
            if (item.length() < replaceIndex) result.append(item).append(" ");
            else {
                result.append(new StringBuilder(item).replace(replaceIndex - 1, replaceIndex, replace))
                        .append(" ");
            }
        }
        return result.toString();
    }
}
