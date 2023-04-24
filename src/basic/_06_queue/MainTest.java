package basic._06_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainTest {

  public static void main(String[] args) {
    Queue<Object> objects = new ArrayDeque<>();
    testQueueSize();
    System.out.println("====================================");
    testQueueDeQueue();
    System.out.println("====================================");
    testQueueEnQueue();
    System.out.println("====================================");
    testQueueIsEmpty();
    System.out.println("====================================");
    testQueueFront();
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

}
