package Interview;

import java.util.HashMap;

public class interview1
{
    public static void main(String[] args) {

        HashMap map= new HashMap();
        map.put("1","Sham");
        map.put("2", "Anil");
        map.put("3","Peter");
        map.put("4","Sandeep");
        System.out.println(map);
        for(Object k:map.keySet())
        {
            //System.out.println(""k+(+map.get(k));

        }
    }
}
