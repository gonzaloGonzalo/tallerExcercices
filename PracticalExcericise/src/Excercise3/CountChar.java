package Excercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by computer on 23/03/17.
 */
public class CountChar {

    public static void main(String[] args){
        String s = "mmmmmeeeii";
        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqs.merge(c,                  // key = char
                    1,                  // value to merge
                    Integer::sum);      // counting
        }
        System.out.println("Frequencies:\n" + freqs);

        String str = "mmmmmeeeii";
        int len = str.length();
        Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));

        for (int i = 0; i < len; ++i)
        {
            char charAt = str.charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        System.out.println(numChars);
    }
}
