package Interview;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Interview {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            //  System.out.println(arr[i]+arr[i+1]);

            if ((arr[i] + arr[i + 1]) == 7)
                System.out.println(arr[i] + " /t" + arr[i + 1]);

        }
        HashMap map = new HashMap();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");
        int k = 0;

        //for (Object K : map.keySet())





    }
}
