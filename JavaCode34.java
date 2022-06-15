/*
        Topic : synchronized keyword

- In below example thread t1 and thread t2 trying to access 'run' method at same time.
- it might be case where both assigning value to count and fetch
- then instead of getting count = 2000 we will get some middle value between 1000 and 2000
- whenever there are multiple thread which try to access same method at same time
- then we can use 'synchronized' keyword in method to provide that method to one thread at time.
- if t1 trying access t2 will be on hold and same vice versa.
*/

class Counter implements Runnable {
    int count;
    @Override
    public synchronized void run() { // this method can access by one thread at time

        for(int i = 0; i < 1000; i++){
            count++;
        }
    }
}

public class JavaCode34 {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count : " + c.count);



    }
}
