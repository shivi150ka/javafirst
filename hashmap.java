import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india", 600);
        hm.put("china", 900);
        hm.put("bhutan", 500);
        hm.put("south", 900);
        hm.put("north", 800);
        System.out.println(hm);
        int population=hm.get("india");
        System.out.println(population);
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
       // System.out.println(hm.clear());
       Set<String> keys = hm.keySet();
       for (String k :keys ){
System.out.println("value ="+k+ " population"+hm.get(k) );
       }
        
       }
    }   

