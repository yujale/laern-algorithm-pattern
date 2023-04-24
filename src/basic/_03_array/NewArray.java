package basic._03_array;

import java.util.Arrays;

public class NewArray<E> {

  private static final int DEFAULT_CAPACITY = 10;

  private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENTS = {};

  private int size;

  private Object[] elements;

  public NewArray() {
    this(DEFAULT_CAPACITY);
  }

  public NewArray(int initialCapacity) {
    //  initialCapacity < DEFAULT_CAPACITY ? DEFAULT_CAPACITY:initialCapacity;
    if (initialCapacity > 0) {
      this.elements = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
      this.elements = DEFAULT_CAPACITY_EMPTY_ELEMENTS;
    } else {
      throw new IllegalArgumentException("Illegal Capacity: " +
          initialCapacity);
    }
  }

  /**
   * 数组最后位置添加元素
   *
   * @param element 元素
   */
  public void add(E element) {
    this.add(size, element);
  }

  /**
   * 数组添加元素
   *
   * @param index   索引
   * @param element 元素
   */
  public void add(int index, E element) {
    // 数组边界检测
    checkArrayRangeForAdd(index);
    // 动态扩容
    grow(size + 1);
    for (int i = size - 1; i >= index; i--) {
      elements[i + 1] = elements[i];
    }
    elements[index] = element;
    size++;
  }

  /**
   * 获取数组的元素数量
   *
   * @return 数组的元素数量
   */
  public int getSize() {
    return size;
  }

  /**
   * 判断数组是否为空
   *
   * @return true 为空，false 不为空
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * 获取数组指定位置的元素
   *
   * @param index 索引
   * @return 元素
   */
  public Object get(int index) {
    checkArrayRange(index);
    return this.elements[index];
  }

  /**
   * 修改数组指定位置的元素,并返回历史元素
   *
   * @param index 索引
   */
  public Object set(int index, E element) {
    checkArrayRange(index);
    Object oldElement = this.elements[index];
    this.elements[index] = element;
    return oldElement;
  }

  /**
   * 移除数组指定位置的元素
   *
   * @param index 索引
   * @return 元素
   */
  public Object remove(int index) {
    checkArrayRange(index);
    Object oldElement = elements[index];
    trimToSize();
    for (int i = index; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }
    elements[--size] = null;
    return oldElement;
  }

  public Object remove(E element){
    return remove(indexOf(element));
  }

  /**
   * 清除数组所有元素
   */
  public void clear() {
    for (int i = 0; i < size; i++) {
      elements[i] = null;
    }
    size = 0;
  }

  /**
   * 查找元素在数组中的位置
   *
   * @param element 元素
   * @return 索引
   */
  public int indexOf(E element) {
    if (element == null) {
      for (int i = 0; i < size; i++) {
        if (elements[i] == null) {
          return i;
        }
      }
    } else {
      for (int i = 0; i < size; i++) {
        if (element.equals(elements[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  /**
   * 判断数组是否包含某个元素
   *
   * @param element 元素
   * @return true 表示包含，false 表示不包含
   */
  public boolean contains(E element) {
    return indexOf(element) != -1;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("size = ").append(size).append(", [");
    for (int i = 0; i < size; i++) {
      if (i != 0) {
        builder.append(", ");
      }
      builder.append(elements[i]);
    }
    builder.append("]");
    return builder.toString();
  }

  private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

  /**
   * 数组动态扩容
   *
   * @param minCapacity 最小容量
   */
  private void grow(int minCapacity) {
    elements = Arrays.copyOf(elements,
        newCapacity(minCapacity));
  }

  private int newCapacity(int minCapacity) {
    // overflow-conscious code
    int oldCapacity = elements.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - minCapacity <= 0) {
      if (elements == DEFAULT_CAPACITY_EMPTY_ELEMENTS) {
        return Math.max(DEFAULT_CAPACITY, minCapacity);
      }
      if (minCapacity < 0) // overflow
      {
        throw new OutOfMemoryError();
      }
      return minCapacity;
    }
    return (newCapacity - MAX_ARRAY_SIZE <= 0)
        ? newCapacity
        : hugeCapacity(minCapacity);
  }

  private static int hugeCapacity(int minCapacity) {
    if (minCapacity < 0) // overflow
    {
      throw new OutOfMemoryError();
    }
    return (minCapacity > MAX_ARRAY_SIZE)
        ? Integer.MAX_VALUE
        : MAX_ARRAY_SIZE;
  }


  /**
   * 动态缩容
   */
  private void trimToSize() {
    int oldCapacity = elements.length;
    int newCapacity = oldCapacity >> 1;
    if (size >= (newCapacity) || oldCapacity <= DEFAULT_CAPACITY) {
      return;
    }
    Object[] newElements = new Object[newCapacity];
    // 拷贝原数组元素到新数组
    if (size >= 0) {
      System.arraycopy(elements, 0, newElements, 0, size);
    }
    elements = newElements;
    System.out.println("size=" + oldCapacity + ", 缩容到" + newCapacity);
  }

  private String outOfBoundsMsg(int index) {
    return "Index: " + index + ", Size: " + size;
  }

  private void checkArrayRange(int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
  }

  private void checkArrayRangeForAdd(int index) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
  }

}
