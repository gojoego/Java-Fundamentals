package labs_examples.input_output.labs;
import java.io.*;
import java.util.*;

// A Java program to demonstrate working with "synchronized".
// A Class used to send a message
/*class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg );
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
*/

// An alternate implementation to demonstrate // that we can use synchronized with method also.
class Sender {
    public synchronized void send(String msg) {
        System.out.println("Sending\t" + msg );
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread {
    private String msg;
    private Thread t;
    Sender sender;


    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }
    public void run() {
        // Only one thread can send a message at a time.
        synchronized(sender) {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}


// Driver class
class SyncDemo {
    public static void main(String args[])  {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend( " Hi " , snd );
        ThreadedSend s2 = new ThreadedSend( " Bye " , snd );
        // Start two threads of ThreadedSend type
        s1.start();
        s2.start();


        // wait for threads to end
        try {
            s1.join();
            s2.join();
        } catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}