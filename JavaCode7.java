/*
        Topic : This keyword
*/

class DemoOfThis{
    // instance variable
    int num1;
    int num2;

    public DemoOfThis(int num1, int num2){

        // to make difference between instance variable and local variable we use this keyword when both initialized with same name.
        this.num1 = num1;
        this.num2 = num2;

        System.out.println(this.num1 + this.num2);
    }
}

public class JavaCode7 {
    
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;
        DemoOfThis obj = new DemoOfThis(num1,num2);
        System.out.println(obj);
        

    }
}
