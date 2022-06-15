/*
        Topic : Super Method
*/

class A{

    public A(){

        System.out.println("In A");
    }

    public A(int i){

        System.out.println("in int A");
    }
}

class B extends A{

    public B(){
        super(); // this method is there even if you don't mention it like constructor
                 // super method calls constructor of super class that's why it will run first constructor A then constructor B
        System.out.println("In B");
    }

    public B(int i){
        super(5);
        System.out.println("in int B");
    }
}


public class JavaCode14 {

    public static void main(String[] args) {

        B b = new B();  // result -> In A,In B if super() like this
        // B b = new B(7);  //result -> In A,in int B if super() like this
        // B b = new B(7);  //result -> in int A,in int B if super(5) like this
    }
}
