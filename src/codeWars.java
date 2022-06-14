package PACKAGE_NAME;
/*
If you read the problem twice or thrice,
you’ll see a few things like what things we need to keep in our minds. Like :

1-The walk has to be for 10 minutes.
2-You need to return to the starting point
3-Every list item (each letter) or single block represents one minute

 */

import java.util.HashMap;
import java.util.Map;
public class codeWars {
 public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        countMap.put('n', 0);
        countMap.put('s', 0);
        countMap.put('w', 0);
        countMap.put('e', 0);
        for (char c : walk) {
            countMap.put(c, countMap.get(c) + 1);
        }

        return countMap.get('n').equals(countMap.get('s')) && countMap.get('w').equals(countMap.get('e'));
    }
}  
}
