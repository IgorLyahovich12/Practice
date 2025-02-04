package my.project.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public Map<Integer,String> map1=new HashMap<>();
    public  HashMapp(){
        map1.put(4,"Andrew");
        map1.put(6,"Jake");
        map1.put(9,"Anton");
        System.out.println(map1);
        //change map with index 4 with value=Andrew ,on the value Dan
        map1.put(4,"Dan");
        //if map dont have index 8 ,we add newMap
        map1.putIfAbsent(8,"Kate");
        System.out.println(map1);
        //if map have this index ,we dont add newMap
        map1.putIfAbsent(8,"Lucy");
        System.out.println(map1);
        map1.remove(6);
        System.out.println(map1.containsValue("Anton"));
    }
    //method for add new Map or change existing Map
    public void addMap(Integer key, String newMap){
        map1.put(key,newMap);
    }
    //method for add new Map if Map dont have this key before
    public  void addMapIfAbsent(Integer key, String newMap){
        map1.putIfAbsent(key,newMap);
    }
    //method for get some map
    public void printValueByKey(Integer key) {
        System.out.println("value key " + key + ": " + map1.get(key));
    }
    //method for delete one map with index=key
public void deleteMap(Integer key){
    if (map1.containsKey(key)) {
        map1.remove(key);
        System.out.println("Key " + key + " delete.");
    } else {
        System.out.println("Key " + key + " not found.");
    }
}
    // Перевірка, чи міститься певне значення
    public void containsValueMap(String value) {
        System.out.println("Is there a value '" + value + "'? " + map1.containsValue(value));
    }
//method for finding a key by index
public void containsKeyMap(Integer key) {
    System.out.println("Is there a key?" + key + "? " + map1.containsKey(key));
}
//method for output key map
public void printAllKeys() {
    System.out.println("keys: " + map1.keySet());
}
    //method for output values map
    public void printAllValues() {
        System.out.println("values: " + map1.values());
    }

}
