/*
        Topic : Dynamic Method Dispatch
*/
class A2{

    public void show(){

        System.out.println("In A");
    }
}

class B2 extends A2{

    public void show() {

        System.out.println("In B");
    }
}

class C2 extends A2{

    public void show() {

        System.out.println("In C");
    }
}

public class JavaCode16 {

    public static void main(String[] args) {

        A2 obj = new B2();  // runtime polymorphism
        // it will call B2 show method as we are assigned B2();
        obj.show();

        obj = new C2();  // Dynamic Method Dispatch (Assignment matters always)
        // it will call C2 show method as we are assigned C2();
        obj.show();

    }
}
