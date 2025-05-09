package Hashing;
/*
Intration order will not preserve
when remove function remove value it returns its value of key

 */
import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One",1 );
        map.put("Two", 2);
        map.put("Three",3);
        map.put("Four", 4);
        System.out.println(map  );

        for(Map.Entry<String, Integer> m:map.entrySet() ){
            System.out.println(m.getKey()+" - "+m.getValue());
        }

        if(map.containsKey("One")){
            System.out.println("Yes");
        }
        map.remove("One");
        System.out.println("Size -"+map.size());
    }
}
