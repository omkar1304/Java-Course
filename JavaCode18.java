/*
        Topic : Wrapper Class
*/
public class JavaCode18 {

    public static void main(String[] args) {

        int i = 5; //primitive datatype

        Integer ii = new Integer(5); //Wrapper class

        Integer j = new Integer(i); // boxing or wrapping -> assign value
        int k = j.intValue(); //unboxing or unwrapping -> fetch value

        Integer m = i; //Auto-boxing  -> auto assign value
        int z = k; //Auto-unboxing  -> auto fetch value

        // use of parseInt
        String s = "1234";
        int x = Integer.parseInt(s);
        System.out.println(x);

    }
}
