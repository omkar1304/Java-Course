/*
        Topic : Class & Object
*/

class Calc{

    // instance variable
    int num1;
    int num2;
    int result;

    // instance method
    public void perform(){

        result = num1 + num2;
        System.out.println(result);
    }
}


public class JavaCode5{

    public static void main(String[] args) {

        Calc obj = new Calc(); // creation of object
        obj.num1 = 5;  // access class variables through object
        obj.num2 = 10;
        obj.perform(); // access class method through object
        

    }
}