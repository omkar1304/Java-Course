/*
        Topic : User defined Exception Handling with Try, Catch, Finally.
*/

/*
        Exception handling can occur in two condition
        1. when your code handling critical operation(chances of getting error)
        2. generate exception by specifying condition.

        Here is type 2 example
*/

package UserDefinedException;

public class Exception1 {
    public static void main(String[] args) {
        try {
            int i = 0;
            int j = 0;
            int k = i + j;
            if (k==0){  // here by specifying condition generating own exception
                // to generate exception by specifying condition can be done by -> throw new exception_name
                throw new OwnException("Own exception class generated!");  // own exception called which takes string to display message
            }
        }
        catch (OwnException e){ // handling own exception in catch block
            System.out.println(e.getMessage()); // to display message
        }
        catch (Exception e){
            System.out.println("Error generated!");
        }
        finally {
            System.out.println("Exception handling done!");
        }


    }
}
