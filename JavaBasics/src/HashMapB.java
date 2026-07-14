import java.util.HashMap;
class HashMapB{
    public static void main(String args[]){   
    HashMap<String,Integer> hash=new HashMap<>();
     

    // insertion O(1)
     hash.put("India", 100);   
     hash.put("China", 120);   
     hash.put("US", 60);
     
     System.out.println(hash);   
    
    // Get O(1)
    int population=hash.get("India");
    System.out.println(population);
    
    // ContainsKey O(1)
    System.out.println(hash.containsKey("India"));
    
    // Remove O(1)
    System.out.println(hash.remove("US"));

    System.out.println("After removing operation");
    System.out.println(hash);

    // size
    System.out.println(hash.size());

    hash.clear();
    System.out.println(hash.isEmpty());
    }
}