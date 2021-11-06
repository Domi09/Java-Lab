public class ThreadEx extends Thread {
  public void run() {
    try {
      for (int i = 0; i < 5; ++i) {
        System.out.println("Thread is sleeping...");
        System.out.println(i);
        Thread.sleep(5000);

      }
    } catch (Exception e) {
      System.out.println("exception caught");
    }
  }

  public static void main(String args[]) {
    ThreadEx t1 = new ThreadEx();

    System.out.println(t1.getName());

    System.out.println(t1.getPriority());

    System.out.println(t1.getThreadGroup().getName());

    t1.setName("Arpit");
    t1.setPriority(10);

    System.out.println(t1.getName());

    System.out.println(t1.getPriority());

    t1.start();
  }
}