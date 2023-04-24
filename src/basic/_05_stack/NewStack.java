package basic._05_stack;

import basic._03_array.NewArray;

public class NewStack<E> {

  private final NewArray<E> list = new NewArray<>();

  public NewStack() {

  }

  public E push(E element) {
    list.add(element);
    return element;
  }

  public E pop() {
    return (E) list.remove(list.getSize() - 1);
  }

  public int size() {
    return list.getSize();
  }

  public boolean isEmpty() {
    return size() == 0;
  }


  /**
   * 获取栈顶元素
   */
  public E peek() {
    return (E) list.get(list.getSize() - 1);
  }

  /**
   * 清除所有的栈内元素
   */
  public void clear() {
    list.clear();
  }

}
