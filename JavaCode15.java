/*
        Topic : Method Overriding
*/

class A1{

    public void show(){
        System.out.println("In A");
    }
}

class B1 extends A1{
    public void show() {
        //super.show(); -> we can call show method of A1 class as well
        System.out.println("In B");
    }
}

public class JavaCode15 {

    public static void main(String[] args) {

        B1 obj = new B1();
        obj.show(); // here B1.show overrides A1.show method(Always calls own method first then super class)

    }
}
