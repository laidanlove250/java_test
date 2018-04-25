package web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("1", "");
       map.put(null, "1");
       Set<Entry<String, Object>> ss = map.entrySet();
       System.out.println(map.isEmpty());
       System.out.println(map.size());
       System.out.println(map.containsValue("1"));
       System.out.println(map.get(null));
       List<String> list = new ArrayList<String>();
       List<String> aa = new LinkedList<String>();
       aa.add("1");
       "e".equals("a");
       String s = "s";
    }
}
