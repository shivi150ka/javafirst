import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india", 600);
        hm.put("china", 900);
        hm.put("bhutan", 500);
        System.out.println(hm);
        int population=hm.get("india");
        System.out.println(population);
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm);
    }
}
