/*
        Topic : Abstract Keyword
*/

//abstract class is class which shows features without showing implementation.
//we can't create object of abstract class.
//if method is abstract method then class must be abstract class.

abstract class Phone1{  // this class fails to implement processor hence it's abstract class

    public void camera(){
        System.out.println("Camera Working..");
    }

    public abstract void processor();
}

// phone2 extends phone1 i.e. phone1 has to implement processor
abstract class Phone2 extends Phone1{ // this class fails to implement ram hence it's abstract class

    @Override
    public void processor() {
        System.out.println("Processor Working...");
    }

    public abstract void ram();

}

// phone3 extends phone2 i.e. phone2 has to implement ram
class Phone3 extends Phone2{ // this class implemented all hence it's normal class

    @Override
    public void ram() {
        System.out.println("Ram Working...");
    }

    public void display(){
        System.out.println("Display Working...");
    }
}

public class JavaCode19 {

    public static void main(String[] args) {

        Phone3 phone3 = new Phone3();
        phone3.camera();
        phone3.processor();
        phone3.ram();
        phone3.display();

    }
}
