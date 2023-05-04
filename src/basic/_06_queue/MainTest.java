package basic._06_queue;

public class MainTest {

  public static void main(String[] args) {
    testQueueSize();
    System.out.println("====================================");
    testQueueDeQueue();
    System.out.println("====================================");
    testQueueEnQueue();
    System.out.println("====================================");
    testQueueIsEmpty();
    System.out.println("====================================");
    testQueueFront();

    System.out.println("双端队列");
    testDequeClear();
    System.out.println("====================================");
    testDequeSize();
    System.out.println("====================================");
    testDequeIsEmpty();
    System.out.println("====================================");
    testDequeEnQueueRear();
    System.out.println("====================================");
    testDequeEnQueueFront();
    System.out.println("====================================");
    testDequeDeQueueFront();
    System.out.println("====================================");
    testDequeDeQueueRear();
    System.out.println("====================================");
    testDequeFront();
    System.out.println("====================================");
    testDequeRear();
  }


  public static void testQueueSize() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    objectNewQueue.enQueue("1");
    int size = objectNewQueue.size();
    System.out.println(size);
  }

  public static void testQueueIsEmpty() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    boolean empty = objectNewQueue.isEmpty();
    System.out.println(empty);
  }

  public static void testQueueEnQueue() {
    NewQueue<Object> objectNewQueue = new NewQueue<>();
    objectNewQueue.enQueue("1");
    objectNewQueue.enQueue("2");
    objectNewQueue.enQueue("3");
    objectNewQueue.enQueue("4");
    objectNewQueue.enQueue("5");
    objectNewQueue.enQueue("6");
    System.out.println(objectNewQueue.size());
  }

  public static void testQueueDeQueue() {
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

  public static void testQueueFront() {
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


  public static void testDequeSize() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    int size = objectNewDeque.size();
    System.out.println(size);
  }

  public static void testDequeIsEmpty() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    boolean empty = objectNewDeque.isEmpty();
    System.out.println(empty);
  }

  public static void testDequeEnQueueFront() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeEnQueueRear() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueRear("1");
    objectNewDeque.enQueueRear("2");
    objectNewDeque.enQueueRear("3");
    objectNewDeque.enQueueRear("4");
    objectNewDeque.enQueueRear("5");
    objectNewDeque.enQueueRear("6");
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeDeQueueFront() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
    Object o = objectNewDeque.deQueueFront();
    System.out.println(o);
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeDeQueueRear() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
    Object o = objectNewDeque.deQueueRear();
    System.out.println(o);
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeFront() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
    Object o = objectNewDeque.front();
    System.out.println(o);
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeRear() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
    Object o = objectNewDeque.rear();
    System.out.println(o);
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeClear() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
    objectNewDeque.clear();
    System.out.println(objectNewDeque.size());
  }

  public static void testDequeContains() {
    NewDeque<Object> objectNewDeque = new NewDeque<>();
    objectNewDeque.enQueueFront("1");
    objectNewDeque.enQueueFront("2");
    objectNewDeque.enQueueFront("3");
    objectNewDeque.enQueueFront("4");
    objectNewDeque.enQueueFront("5");
    objectNewDeque.enQueueFront("6");
    System.out.println(objectNewDeque.size());
    boolean contains = objectNewDeque.contains("1");
    System.out.println(contains);
  }



}
