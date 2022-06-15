/*
        Topic : Inner class (Member & static type)
*/

class Outer{

    // Member class
    class Inner{

        public void display(){
            System.out.println("In Inner class");
        }
    }

    // static class
    static class StaticInner{

        public void display(){
            System.out.println("In Static Inner class");
        }
    }
}


public class JavaCode10 {
    
    public static void main(String[] args) {
        
        Outer outer = new Outer();  // creating object for outer class

        Outer.Inner inner = outer.new Inner();  // creating object for inner class
        inner.display();
        
        Outer.StaticInner staticinner = new Outer.StaticInner(); // creating object for static inner class
        staticinner.display();
    }
}
