/*
        Topic : Anonymous class
*/

// Anonymous Class-> instead of creating separate class to complete method we can complete method while object creation.

class Walk{

    public void walk(){
        System.out.println("Walk");
    }
}

// class Handler extends Walk{
//
//    @Override
//    public void walk() {
//
//        System.out.println("Walking...");
//    }
//}

public class JavaCode22 {

    public static void main(String[] args) {
        Walk obj = new Walk() {
            // Anonymous Class
            public void walk() {
                System.out.println("Walking...");
            }
        };
        obj.walk();
    }

// here instead of creating handler class we can directly do that using anonymous class(Only use when you override something)
}
