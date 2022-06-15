/*
        Topic : static keyword
*/

//static -> static method or variable does not require object to call, we can call it using class name 
//          its same for every object i.e value or functionality is same for all object.
//          as its same for every object it only calls one time whereas as the other hand normal function or variable call count depends on no. of objects.

class Emp{

    int id;
    double sal;
    static String ceo;  // to make variable static we need to define 'static' first same for method as well

    public void display(){

        System.out.println(id + ":" + sal + ":" + ceo);
    }

}

public class JavaCode9 {
    
    public static void main(String[] args) {
        
        Emp.ceo = "suresh"; // to call static method or variable we only need class name and it will assign same value for every object.see the example below of ceo.

        Emp omkar = new Emp();
        omkar.id = 10;
        omkar.sal = 10000;
        omkar.display();

        Emp senthil = new Emp();
        senthil.id = 11;
        senthil.sal = 11000;
        senthil.display();



    }
}
