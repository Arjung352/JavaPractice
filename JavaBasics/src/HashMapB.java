import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
class HashMapB{
    static class CustomHashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int size; // n is the number of nodes in the hashmap
        private LinkedList<Node>[] buckets; // N is the number of buckets in the hashmap

        public CustomHashMap(){
            this.size=0;
            this.buckets=new LinkedList[10];
            for(int i=0;i<10;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        public void put(K key, V value){
            int bucketIndex=getBucketIndex(key);
            LinkedList<Node> bucket=buckets[bucketIndex];
            for(Node node:bucket){
                if(node.key.equals(key)){
                    node.value=value;
                    return;
                }
            }
            bucket.add(new Node(key,value));
            size++;
        }

        public V get(K key){
            int bucketIndex=getBucketIndex(key);
            LinkedList<Node> bucket=buckets[bucketIndex];
            for(Node node:bucket){
                if(node.key.equals(key)){
                    return node.value;
                }
            }
            return null;
        }

        public boolean containsKey(K key){
            int bucketIndex=getBucketIndex(key);
            LinkedList<Node> bucket=buckets[bucketIndex];
            for(Node node:bucket){
                if(node.key.equals(key)){
                    return true;
                }
            }
            return false;
        }

        public V remove(K key){
            int bucketIndex=getBucketIndex(key);
            LinkedList<Node> bucket=buckets[bucketIndex];
            for(Node node:bucket){
                if(node.key.equals(key)){
                    bucket.remove(node);
                    size--;
                    return node.value;
                }
            }
            return null;
        }

        public int size(){
            return size;
        }

        public void clear(){
            for(int i=0;i<buckets.length;i++){
                buckets[i].clear();
            }
            size=0;
        }

        public boolean isEmpty(){
            return size==0;
        }

        private int getBucketIndex(K key){
            return Math.abs(key.hashCode())%buckets.length;
        }
    }

    // majority elements
    public static ArrayList<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/3){
                list.add(key);
            }
        }
        return list;
    }

    // valid anagram
    public static boolean validAnagram(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        // setting 1st string into the map
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        // traversing the 2nd string to check if its a valid anagram or not
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch) - 1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }

    // count distinct elements in an array
    public static int countDistinct(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
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
Map<String, Integer> occurrenceMap = new HashMap<>();

        for (String item : items) {
            occurrenceMap.put(item, occurrenceMap.getOrDefault(item, 0) + 1);
        }

        System.out.println(occurrenceMap); 

    ArrayList<Integer> list=majorityElement(new int[]{1,2,3,1,1,2,2});
    System.out.println(list);
    System.out.println(validAnagram("anagram", "nagaraa"));


    // HashSet in java is used to implement the Set interface, backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. This class permits the null element. This class offers constant time performance for the basic operations (add, remove, contains and size), assuming the hash function disperses the elements properly among the buckets.

    HashSet<Integer> set=new HashSet<>();
    set.add(7);
    set.add(4);
    set.add(3);
    set.add(1);
    set.add(2);
    set.add(1);
    set.add(4);
    set.add(5);
    set.add(6);
    set.add(2);
    System.out.println(set);
    // itrator is used to traverse the elements in the set and return them in sort order.
    Iterator<Integer> it=set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

    System.out.println(countDistinct(new int[]{1,2,3,4,5,6,7,8,9,10,1,2,3,4,5}));
    }
}