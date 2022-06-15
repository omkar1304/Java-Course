/*
        Topic : collection and generics

collection -> it is concept of Collections and Interfaces
generics -> to specify type of object

In this we will look into 3 collections

1. List Interface
2. Set Interface
3. Map Interface

                                1. Map Interface->

Map is interface which requires Collection class to implement.

For Map interface we have three Collection classes ->
1. HashMap
2. TreeMap

implementation ->

Map<T> hm = new HashMap<> (); 
Map<T> tm = new TreeMap<> ();
 
Where T is the type of the object. 

*/
import java.util.HashMap;
import java.util.Map;

public class JavaCode37 {
    public static void main(String[] args) {
        
//        Map<String, String> map = new HashMap<>(); -> we can define like this also with reference of Map Interface
        HashMap<String, String> m = new HashMap<>();

        // to add Key , Value pair in Map
        m.put("Name", "Omkar");
        m.put("Role", "System Engineer");
        m.put("Project", "AWS");

        System.out.println(m);

        // get the value for a key
        System.out.println("Value of Role : " + m.get("Role"));

        // to display keys in List format
        System.out.println("All keys : " + m.keySet());

        // to update key value in map
            // here it will remove AWS and update project as AWS-Cloud
        m.put("Project","AWS-Cloud");

        // to display all key-value pairs
        for(String key : m.keySet()){
            System.out.println( key + " : " + m.get(key));
        }

    }
}
