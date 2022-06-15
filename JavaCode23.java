/*
        Topic : Anonymous Interface
*/

interface Walk1{

    public void walk();
}

// class Handler1 implements Walk{
//
//    @Override
//    public void walk() {
//
//        System.out.println("Walking...");
//    }
//}

public class JavaCode23 {

    public static void main(String[] args) {
        Walk1 obj = new Walk1() {
            @Override
            public void walk() {
                System.out.println("Walking...");
            }
        };
        obj.walk();
    }
}
