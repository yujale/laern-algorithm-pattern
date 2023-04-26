package basic._06_queue.circle;

/**
 * 循环队列
 * <p>
 * 循环队列底层是动态数组实现
 */
public class NewCircleQueue<E> {

  /**
   * 队头元素的索引
   */
  private int front;

  /**
   * 队列中元素的个数
   */
  private int size;
  /**
   * 队列
   */
  private Object[] elements;

  /**
   * 队列默认的容量
   */
  private static final int DEFAULT_CAPACITY = 10;

  private static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;

  /**
   * 构造函数
   */
  public NewCircleQueue() {
    this(DEFAULT_CAPACITY);
  }

  /**
   * 构造函数
   *
   * @param capacity 队列的容量
   */
  public NewCircleQueue(int capacity) {
    capacity = Math.max(capacity, DEFAULT_CAPACITY);
    elements = new Object[capacity];
  }


  /**
   * 获取队列中元素的个数
   *
   * @return 队列中元素的个数
   */
  public int size() {
    return size;
  }

  /**
   * 队列是否为空
   *
   * @return true为空 false不为空
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * 清空队列
   */
  public void clear() {
    for (int i = 0; i < size; i++) {
      elements[index(i)] = null;
    }
    size = 0;
    front = 0;
  }

  /**
   * 获取index位置对应的真实索引
   *
   * @param index 索引
   * @return 真实索引
   */
  public int index(int index) {
    return (front + index) % elements.length;
  }


  /**
   * 出队
   *
   * @return 出队的元素
   */
  public E deQueue() {
    E element = (E) elements[front];
    elements[front] = null;
    front = index(1);
    size--;
    return element;
  }

  /**
   * 入队
   *
   * @param element 入队的元素
   */
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

  /**
   * 扩容
   *
   * @param capacity 队列的容量
   */
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
    string.append("capacity = ").append(elements.length).append(" size=").append(size)
        .append(" front=")
        .append(front).append(", [");
    return getString(string, elements);
  }

  static String getString(StringBuilder string, Object[] elements) {
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
