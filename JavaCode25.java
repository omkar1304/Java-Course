/*
        Topic : Default method in Interface
*/

/* as we know in interface we can not implement method only declare it
   we have two more methods 1. default  2. static which we can implement in interface.
 */

interface Walk3{

    public void walk();

    default void run() {  // this hs how we can create default method
        System.out.println("Running...");
    }
}

class Handler3 implements Walk3 {

    public void walk() {
        System.out.println("Walking...");
    }
}


public class JavaCode25 {

    public static void main(String[] args) {

        Handler3 obj = new Handler3();
        obj.walk();
        obj.run();
    }
}
