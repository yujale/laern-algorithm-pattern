package basic._06_queue;

public class MainTest {

  public static void main(String[] args) {
    testSize();
    System.out.println("====================================");
    testDeQueue();
    System.out.println("====================================");
    testEnQueue();
    System.out.println("====================================");
    testIsEmpty();
    System.out.println("====================================");
    testFront();
  }


  public static void testSize() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    objectNewQueue.enQueue("1");
    int size = objectNewQueue.size();
    System.out.println(size);
  }

  public static void testIsEmpty() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    boolean empty = objectNewQueue.isEmpty();
    System.out.println(empty);
  }

  public static void testEnQueue() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    objectNewQueue.enQueue("1");
    objectNewQueue.enQueue("2");
    objectNewQueue.enQueue("3");
    objectNewQueue.enQueue("4");
    objectNewQueue.enQueue("5");
    objectNewQueue.enQueue("6");
    System.out.println(objectNewQueue.size());
  }

  public static void testDeQueue() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    objectNewQueue.enQueue("1");
    objectNewQueue.enQueue("2");
    objectNewQueue.enQueue("3");
    objectNewQueue.enQueue("4");
    objectNewQueue.enQueue("5");
    objectNewQueue.enQueue("6");
    System.out.println(objectNewQueue.size());
    Object o = objectNewQueue.deQueue();
    System.out.println(o);
    System.out.println(objectNewQueue.size());
  }

  public static void testFront() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    objectNewQueue.enQueue("1");
    objectNewQueue.enQueue("2");
    objectNewQueue.enQueue("3");
    objectNewQueue.enQueue("4");
    objectNewQueue.enQueue("5");
    objectNewQueue.enQueue("6");
    System.out.println(objectNewQueue.size());
    Object o = objectNewQueue.front();
    System.out.println(o);
    System.out.println(objectNewQueue.size());
  }

}
