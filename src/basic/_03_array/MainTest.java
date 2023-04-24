package basic._03_array;

public class MainTest {

  public static void main(String[] args) {
    testAdd();
    System.out.println("==================================");
    testAddIndex();
    System.out.println("==================================");
    testGet();
    System.out.println("==================================");
    testSet();
    System.out.println("==================================");
    testContains();
    System.out.println("==================================");
    testGetSize();
    System.out.println("==================================");
    testIsEmpty();
    System.out.println("==================================");
    testRemove();
    System.out.println("==================================");
    testClear();
    System.out.println("==================================");
    testRemoteElement();
  }

  public static void testAdd() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    System.out.println(array);
  }

  public static void testAddIndex() {
    NewArray<Integer> array = new NewArray<>(15);
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    array.add(1, 100);
    System.out.println(array);
  }

  public static void testGet() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    Object x = array.get(1);
    System.out.println(x);
  }

  public static void testSet() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    Object set = array.set(1, 100);
    System.out.println(set);
  }

  public static void testContains() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    System.out.println(array.contains(1));
  }

  public static void testGetSize() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    System.out.println(array.getSize());
  }

  public static void testIsEmpty() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(i);
    }
    System.out.println(array.isEmpty());
  }

  public static void testRemove() {
    NewArray<Integer> array = new NewArray<>();
    for (int i = 0; i < 1; i++) {
      array.add(i);
    }
    Object remove = array.remove(1);
    System.out.println(remove);
  }

  public static void testClear() {
    NewArray<String> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(String.valueOf(i));
    }
    array.clear();
    System.out.println(array);
  }

  public static void testRemoteElement(){
    NewArray<String> array = new NewArray<>();
    for (int i = 0; i < 10; i++) {
      array.add(String.valueOf(i));
    }
    Object remove = array.remove("1");
    System.out.println(remove);
    System.out.println(array);
  }

}
