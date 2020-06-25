package ge.itvet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    public static int sum(String string)
    {
        List<Integer> list = new ArrayList<>();
        if (string.isEmpty()) return 0;
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++)
        {
           list.add(strToInt(split[i]));
        }
     return list.stream().reduce(0, (a, b) -> a + b);
    }

    public static int strToInt( String str ) {
            int i = 0;
            int num = 0;
            int posorneg =1;
            if(str.charAt(0)=='-')
            {
                posorneg= -1;
                i++;
            }
            while (i < str.length()) {
                num *= 10;
                num += str.charAt(i++) - '0';
            }
            return posorneg*num;
        }
}
