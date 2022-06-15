/*
        Topic : Constructor & it's types
*/

class Demo{

    // Default Constructor ->

    // constructor 1
    public Demo(){

        System.out.println("In default constructor");
    }

    // Custom Constructor ->

    // constructor 2
    public Demo(int x){

        System.out.println("In custom constructor" + x);
    }

    // constructor 3
    public Demo(int x, int y){

        System.out.println("In custom constructor" + x+y);
    }

    // constructor 4
    public Demo(double x){

        System.out.println("In custom constructor" + x);
    }
}

public class JavaCode6 {

    public static void main(String[] args) {
        
        Demo obj = new Demo(); // it will call default constructor i.e. constructor 1
        // Demo obj = new Demo(5); // it will call custom constructor i.e. constructor 2
        // Demo obj = new Demo(5,6); // it will call custom constructor i.e. constructor 3
        // Demo obj = new Demo(5.5); // it will call custom constructor i.e. constructor 4

        System.out.println(obj);



    }
    
}
