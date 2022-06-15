/*
        Topic : Functional Interface using lambda function

Types of interface->
1. Normal interface
2. Functional interface -> contains only one abstract method
3. marker interface -> not contains any abstract method
*/

interface Walk2{  // Functional interface

    public void walk();
}


public class JavaCode24 {

    public static void main(String[] args) {

        Walk2 obj = () -> System.out.println("walking..."); // lambda function (it will work same as JavaCode23
        obj.walk();
        };
    }

