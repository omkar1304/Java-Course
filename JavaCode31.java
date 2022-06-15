/*
        Topic : threads

threads -> unit of process.

threads can be done using 2 ways
    1. by extending thread class
    2. by implementing runnable interface

- everytime when we run program one thread always runs that is main thread.
- from below example without extending threads if we try to run program then it will first run
5 times 'hi' then 5 times 'hello' as we only run one main thread at time.
- with extending thread it will run simultaneously as we have multiple threads
running at same time except main thread.
- thread always runs its 'start' method first then 'run' method(only two methods)
so in order to make use of thread we have to create new method with run name to override thread in-built method.

*/

class Hi extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

            // to sleep code for while
            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}

class Hello extends Thread{

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}
public class JavaCode31 {

    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
// as we know thread runs start method then run. we need to first start with start method.
        obj1.start();  // start -> run->
        obj2.start();  // start -> run->
    }
}
