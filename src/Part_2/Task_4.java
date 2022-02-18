package Part_2;

import java.util.*;
public class Task_4 {
    public static void searchWord(String st){
            Map<Integer, Set<String>> wnc = new HashMap<Integer, Set<String>>();
            for ( String s: st.split("\\s+") ) {
                if ( ! wnc.containsKey(s.length()) )
                    wnc.put(s.length(), new HashSet<String>());
                wnc.get(s.length()).add(s);
            }

            Integer[] keys = wnc.keySet().toArray(new Integer[wnc.size()]);
            Arrays.sort(keys);

            System.out.println("Короткие: ");
            for ( String s : wnc.get(keys[0]) )
                System.out.println(" - "+s + " ");
            System.out.println("\nДлинные: ");
            for ( String s : wnc.get(keys[keys.length - 1]) )
                System.out.println(" - "+s + " ");
            System.out.println();
        }
    }


