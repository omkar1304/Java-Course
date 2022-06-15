/*
        Topic : collection and generics

collection -> it is concept of Collections and Interfaces
generics -> to specify type of object

In this we will look into 3 collections

1. List Interface
2. Set Interface
3. Map Interface

                                1. Set Interface->

Set is interface which requires Collection class to implement.

For Set interface we have three Collection classes ->
1. HashSet
2. LinkedHashSet
3. TreeSet

implementation ->

Set<T> hs = new HashSet<> ();
Set<T> lhs = new LinkedHashSet<> ();
Set<T> ts = new TreeSet<> ();

Where T is the type of the object.

The difference between Set and List ->
    set stores unique values
    set stores elements in unordered manner. To store value in order manner we can use TreeSet

*/

import java.util.HashSet;
import java.util.Set;

public class JavaCode36 {

    public static void main(String[] args) {

        // Set<Integer> s = new HashSet<>(); -> we can define like this also with reference of Set Interface
        // generic here is Integer

        HashSet<Integer> s = new HashSet<>();

        // to add value in set
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(6); // it will not store 6 again

        System.out.println("Set : " + s);

        // to remove value in set
        // as set in unordered manner hence we can remove object with help of value instead of index
        s.remove(3);

        // to display values in set
        for(Integer i : s){
            System.out.println(i);
        }

        // to display size of set

        System.out.println("Size of set : " + s.size());



    }
}
