public class Threads {
    public static void main(String[] args) throws Exception {
       
        //Create thread 1 to count up
         class thread1 extends Thread {
        public void run() {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);

            }
        }
    }

    //Create thread 2 to count down
     class thread2 extends Thread {
        public void run() {
            for (int i = 20; i >= 0; i--) {
                System.out.println(i);
                
            }
        }
     }
        //Instruct thread 1 to start and finish before continuing
        Thread t1 = new thread1();
        t1.start();
        t1.join();

        //Instruct thread 2 to start and finish before continuing
        Thread t2 = new thread2();
        t2.start();
        t2.join();

    
    }
}


