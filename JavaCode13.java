/*
        Topic : Inheritance (Single Level & Multilevel)
*/

class Calcy{  // super class

    public int add(int i, int j){

        return i+j;
    }
}

class AdvCalculator extends Calcy{  // subclass , single level inheritance
    // AdvCalculator has two methods -> 1. add 2. sub
    public int sub(int i, int j){

        return i-j;
    }
}

class SuperAdvCalculator extends AdvCalculator{  // multilevel inheritance
    // SuperAdvCalculator has three methods -> 1. add 2. sub 3. multi
    public int multi(int i, int j){

        return i*j;
    }
}

public class JavaCode13 {

    public static void main(String[] args) {
        
        SuperAdvCalculator sac = new SuperAdvCalculator();
        int result1 = sac.add(5, 5);
        int result2 = sac.sub(5, 5);
        int result3 = sac.multi(5, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    
}
