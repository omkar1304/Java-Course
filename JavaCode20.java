/*
        Topic : Final Keyword
*/


//for final variable
class A3{
    final int i = 10;
    public void change() {
        //i=10;
        //if variable is final then we can't change the value.
    }
}

//for final class
final class B3{
    public void show()
    {
        System.out.println("working");
    }
}
class C3 //extends B
{
    //if class is final we can't extend it into another class
}

//for final method
class D3{
    public final void display() {
        System.out.println("in D");
    }
}
class E3 extends D3{
    // public void display() {
    //     System.out.println("in D");
    // }
// if a method is final then we can't override it .

}
public class JavaCode20 {

    public static void main(String[] args) {

    }
}
