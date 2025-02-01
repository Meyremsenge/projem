public class sleepExample {  

    public static void main(String[] args) {  
        Thread t1 = new Thread(new MyRunnable("Thread 1"));  
        Thread t2 = new Thread(new MyRunnable("Thread 2"));  

        t1.start();  
        t2.start();  
    }  

    static class MyRunnable implements Runnable {  
        private String name;  

        public MyRunnable(String name) {  
            this.name = name;  
        }  

        public void run() {  
            for (int i = 1; i <= 5; i++) {  
                System.out.println(name + " - Count: " + i);  

                try {  
                    // 1 saniye bekle  
                    Thread.sleep(1000);  
                } catch (InterruptedException e) {  
                    System.err.println(e.getMessage());  
                }  
            }  
        }  
    }  
} 
