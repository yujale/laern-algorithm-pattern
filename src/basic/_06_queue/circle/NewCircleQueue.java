package basic._06_queue.circle;

/**
 * 循环队列
 * <p>
 * 循环队列底层是动态数组实现
 */
public class NewCircleQueue<E> {

  private int front;

  private int size;

  private Object[] elements;

  private static final int DEFAULT_CAPACITY = 10;

  private static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;

  public NewCircleQueue() {
    this(DEFAULT_CAPACITY);
  }

  public NewCircleQueue(int capacity) {
    capacity = Math.max(capacity, DEFAULT_CAPACITY);
    elements = new Object[capacity];
  }


  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      elements[index(i)] = null;
    }
    size = 0;
    front = 0;
  }

  public int index(int index) {
    return (front + index) % elements.length;
  }


  public E deQueue() {
    E element = (E) elements[front];
    elements[front] = null;
    front = index(1);
    size--;
    return element;
  }

  public void enQueue(E element) {
    ensureCapacity(size + 1);
    elements[index(size)] = element;
    size++;
  }

  /**
   * 获取队列的头元素
   */
  public Object front() {
    return elements[front];
  }

  private void ensureCapacity(int capacity) {
    int oldCapacity = elements.length;
    if (oldCapacity >= capacity) {
      return;
    }
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - capacity < 0) {
      newCapacity = capacity;
    }
    if (newCapacity - MAX_CAPACITY > 0) {
      newCapacity = capacity > MAX_CAPACITY ? Integer.MAX_VALUE : MAX_CAPACITY;
    }
    Object[] newElements = new Object[newCapacity];
    for (int i = 0; i < size; i++) {
      newElements[i] = elements[index(i)];
    }
    elements = newElements;
    front = 0;
  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    string.append("capcacity = ").append(elements.length).append(" size=").append(size)
        .append(" front=")
        .append(front).append(", [");
    for (int i = 0; i < elements.length; i++) {
      if (i != 0) {
        string.append(", ");
      }
      string.append(elements[i]);
    }
    string.append("]");
    return string.toString();
  }

}
