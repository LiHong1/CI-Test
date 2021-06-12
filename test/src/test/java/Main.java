/**
 * @author lh189430
 * @date 2021/4/28 ÏÂÎç3:14
 */
public class Main {
    public static void main(String args[]){
        ThreadB threadB = new ThreadB();
        threadB.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class ThreadB extends Thread{
        @Override
        public void run() {
            ThreadA threadA = new ThreadA();
            threadA.setDaemon(false);
            threadA.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ThreadA extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("====");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
