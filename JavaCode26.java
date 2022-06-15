/*
        Topic : Static method in Interface
*/

/* as we know in interface we can not implement method only declare it
   we have two more methods 1. default  2. static which we can implement in interface.
 */

interface Walk4{

    int num = 8;  // in static method variables consider as final i.e. we can't change value
    static void run() {  // this hs how we can create static method
        System.out.println("Running...");
    }
}

public class JavaCode26 {

    public static void main(String[] args) {

        Walk4.run();  // we know we don't need object to call method.
    }
}
