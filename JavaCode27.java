/*
        Topic : Multiple interface (inheritance)
*/

/*
Here we have created two interface i.e. Demo1 and Demo2 and both contain show method & we are trying to implement both in DemoImp
it will create confusion to call which class to call show
we can use super keyword to specify which class needs to be called

 */

interface Demo1{

    default void show(){
        System.out.println("In Demo1");
    }
}

interface Demo2{

    default void show() {
        System.out.println("In Demo2");
    }
}

class DemoImp implements Demo1,Demo2{

    public void abc(){
        System.out.println("ABC");
    }

    @Override
    public void show() {
        // ClassName.super.Method
        Demo1.super.show();  // result -> In Demo1
        Demo2.super.show(); // result -> In Demo2
    }
}

public class JavaCode27 {
    public static void main(String[] args) {

        DemoImp obj = new DemoImp();
        obj.show();
    }
}
