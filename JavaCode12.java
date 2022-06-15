/*
        Topic : Varargs
*/

class Calculator{

    public void add(int ...a){  // here it will take all values as in array format with help of "..." dots.

        int sum = 0;
        for(int value : a){
            sum += value;
        }

        System.out.println("Sum : " + sum );
    }
}


public class JavaCode12 {

    public static void main(String[] args) {
        
        Calculator obj1 = new Calculator();
        obj1.add(1,2,3,4,5,5,6,7,8); // using varargs we can pass N of values in function
    }
    
}
