/*
        Topic : Method Overloading
*/

// Method Overloading -> function has same name with diff parameter.
class MethodOverloading{

    // method 1
    public void add(int x, int y){
        System.out.println(x+y);
    }

    // method 2
    public void add(int x, int y, int z){
        System.out.println(x+y+z);
    }

    // method 3
    public void add(double x, double y){
        System.out.println(x+y);
    }
}

public class JavaCode8 {
    
    public static void main(String[] args) {
        
        MethodOverloading obj = new MethodOverloading();
        obj.add(4, 5); // it will call method 1
        obj.add(4, 5, 1); // it will call method 1
        obj.add(4.5, 5.6); // it will call method 1
 
    }
}
