/*
        Topic : threads

threads -> units of process.

threads can be done using 2 ways
    1. by extending thread class
    2. by implementing runnable interface

- everytime when we run program one thread always runs that is main thread.
- from below example without implementing runnable if we try to run program then it will first run
5 times 'hi' then 5 times 'hello' as we only run one main thread at time.
- with implementing runnable it will run simultaneously as we have multiple threads
running at same time except main thread.
- runnable only contains run method as it is functional interface(one method)
to run 'start' method we need to make runnable interface object and pass into thread object then
it will get connected. By using thread object we can run 'start' method then it will call 'run'
method runnable interface.

*/
class Hii implements Runnable {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");

            // to sleep code for while
            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}

class Helloo implements Runnable{

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Helloo");

            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}

public class JavaCode32 {

    public static void main(String[] args) {
        // create runnable interface object first
        Hii obj1 = new Hii();
        Helloo obj2 = new Helloo();

        // then pass into thread objects to get start method
        // as we don't have start method in runnable interface
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // start -> run->
        t2.start(); // start -> run->

    }
}
