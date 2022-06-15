/*
        Topic : Methods in thread

join -> it will allow thread method to join with main method i.e.
        complete the thread first and then start main thread
isAlive -> it will return true or false based on thread is running or not

setName -> assign name to thread

getName -> fetch name of thread

setPriority -> assign priority to thread ( 1 to 10) -> least (1) to high (10)

getPriority -> fetch priority of thread

*/
class Hiii extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hiii");

            // to sleep code for while
            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}

class Hellooo extends Thread{

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hellooo");

            try {
                Thread.sleep(1000);
            }
            catch (Exception ignored) {
            }
        }
    }
}

public class JavaCode33 {

    public static void main(String[] args) throws Exception {

        Hiii obj1 = new Hiii();
        Hellooo obj2 = new Hellooo();

        // getName and setName methods of thread
        obj1.setName("Hi thread");
        obj2.setName("Hello thread");

        System.out.println("Thread 1 : " + obj1.getName());
        System.out.println("Thread 2 : " + obj2.getName());


        // getPriority and setPriority methods of thread
        obj1.setPriority(1);
        obj2.setPriority(10);

        System.out.println("Priority of thread 1 :" + obj1.getPriority());
        System.out.println("Priority of thread 2 :" + obj2.getPriority());

        obj1.start();
        obj2.start();

        // it will return true here as we just started thread above
        System.out.println("Thread running : " + obj1.isAlive());

        obj1.join();
        obj2.join();

        // it will return false here as we declared join method above
        System.out.println("Thread running : " + obj1.isAlive());

        // as we used join method above hence below line will execute after both threads will get executed.
        // otherwise below line will execute between above two threads
        System.out.println("thread operation completed!");
    }
}
