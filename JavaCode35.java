/*
        Topic : collection and generics

collection -> it is concept of Collections and Interfaces
generics -> to specify type of object

In this we will look into 3 collections

1. List Interface
2. Set Interface
3. Map Interface

                                1. List Interface->

List is interface which requires Collection class to implement.

For List interface we have three Collection classes ->
1. ArrayList
    Flow ->
        ArrayList --->(Implements) List Interface --->(extends) Collection
2. LinkedList
3. Vector

implementation ->

List <T> al = new ArrayList<> ();
List <T> ll = new LinkedList<> ();
List <T> v = new Vector<> ();

Where T is the type of the object

*/

import java.util.ArrayList;
import java.util.List;

public class JavaCode35 {
    public static void main(String[] args) {
//        List al = new ArrayList();  -> we can define like this also with reference of List Interface
        // generic here is Integer
        ArrayList<Integer> al = new ArrayList<>();

        // to add value in list
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);

        System.out.println(al);

        // to remove value in list with help of index of value
        al.remove(1);
        al.remove(0);

        // to get each value in list with for loop

        for(int i=0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

        // to get each value in list with enhanced-for loop
        // here Integer is type of object
        for (Integer i : al) {
            System.out.println(i);
        }

        // to update or set value -> here it will remove 8 and place 10 and return removed value
        int x = al.set(1,10);
        System.out.println("Removed Value : " + x);
        for (Integer i : al) {
            System.out.println(i);
        }

    }
}
