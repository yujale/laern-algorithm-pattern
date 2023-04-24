package basic._06_queue;

import java.util.LinkedList;
import java.util.List;

/**
 * 单向队列
 * @param <E>
 */
public class NewQueue<E> {

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
   * 入队
   *
   * @param element 入队的元素
   */
  public void enQueue(E element) {
    list.add(element);
  }

  /**
   * 出队
   *
   * @return 出队的元素
   */
  public E deQueue() {
    return list.remove(0);
  }

  /**
   * 获取队列的头元素
   *
   * @return 队列的头元素
   */
  public E front() {
    return list.get(0);
  }

}
