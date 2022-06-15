/*
        Topic : Interface
*/

// Interface -> - same as abstract class but only diff is that abstract class can have both abstract and normal method.
//                but interface only contains abstract method.
//              - using interface we can implement multiple inheritance.
//              - we can't create object of interface

interface Father{
    public abstract void work(); // public abstract -> by default is there no need to mention.
}

abstract class Mother{
    public abstract void home();
}

class Child extends Mother implements Father{ //for abstract ---> extends, for interface ---> implements

    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void home() {
        System.out.println("Home-Work");
    }
}


public class JavaCode21 {

    public static void main(String[] args) {
        Child child = new Child();
        child.work();
        child.home();
    }
}
