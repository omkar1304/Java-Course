/*
        Topic : Exception Handling with Try, Catch, Finally.
*/

/*
        Exception handling can occur in two condition
        1. when your code handling critical operation(chances of getting error)
        2. generate exception by specifying condition.

        Here is type 1 example
*/
public class JavaCode29 {

    public static void main(String[] args) {
        try { // to try critical operation
            int i = 10;
            int j = 0;
            int k = i/j;
            int a[] = new int[6];
            a[6] = 5;
        }
        catch (ArithmeticException e){  // specify the exception and handle

            System.out.println("Divide by zero error generated!");
        }
        catch (Exception e){ // else take any exception and handle and this block always be last catch block.

            System.out.println("Error generated!");
        }
        finally { // it will execute even if exception occurred or not.
            System.out.println("Exception handling done!");
        }

    }
}
