package EX1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
