package basic._06_queue;

import java.util.LinkedList;
import java.util.List;

/**
 * 双端队列 双端队列能在头尾两端添加、删除元素
 */
public class NewDeque<E> {

  private final List<E> list = new LinkedList<>();

  /**
   * 获取队列中元素的个数
   *
   * @return 队列中元素的个数
   */
  public int size() {
    return list.size();
  }

  /**
   * 判断队列是否为空
   *
   * @return true 队列为空，false 队列不为空
   */
  public boolean isEmpty() {
    return list.isEmpty();
  }

  /**
   * 从队头入队
   *
   * @param element 入队的元素
   */
  public void enQueueRear(E element) {
    list.add(0, element);
  }

  /**
   * 从队尾入队
   *
   * @param element 入队的元素
   */
  public void enQueueFront(E element) {
    list.add(element);
  }

  /**
   * 从队头出队
   *
   * @return 出队的元素
   */
  public E deQueueFront() {
    return list.remove(0);
  }

  /**
   * 从队尾出队
   *
   * @return 出队的元素
   */
  public E deQueueRear() {
    return list.remove(list.size() - 1);
  }

  /**
   * 获取队列的头元素
   *
   * @return 队列的头元素
   */
  public E front() {
    return list.get(0);
  }

  /**
   * 获取队列的尾元素
   *
   * @return 队列的尾元素
   */
  public E rear() {
    return list.get(list.size() - 1);
  }

  public void clear() {
    list.clear();
  }

  public  boolean contains(E element) {
    return list.contains(element);
  }

  @Override
  public String toString() {
    return "NewDeque{" +
        "list=" + list +
        '}';
  }
}
