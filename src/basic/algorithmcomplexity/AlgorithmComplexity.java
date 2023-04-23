package basic.algorithmcomplexity;

/**
 * 算法复杂度
 * 算法复杂度主要分为两种：
 * - 时间复杂度（time complexity）：估算程序指令的执行次数或者执行时间
 * - 空间复杂度（space complexity）：估算程序所需的存储空间
 * <p>
 * 一般情况下，算法复杂度一般使用大 O 表示法，表示数据规模 n 对应的复杂度
 * 大 O 表示法主要分为以下几种：
 * - O(1)：常数复杂度，不管数据规模 n 多大，执行时间或者占用空间都是一个固定的常数,简称常数阶
 * - O(n)：线性复杂度，数据规模 n 增大 n 倍，执行时间或者占用空间增大 n 倍,简称线性阶
 * - O(n^2)：平方复杂度，数据规模 n 增大 n 倍，执行时间或者占用空间增大 n^2 倍,简称平方阶
 * - O(n^3)：立方复杂度，数据规模 n 增大 n 倍，执行时间或者占用空间增大 n^3 倍,简称立方阶
 * - O(logn)：对数复杂度，数据规模 n 增大 n 倍，执行时间或者占用空间增大 logn 倍,简称对数阶
 * - O(nlogn)：nlogn复杂度，数据规模 n 增大 n 倍，执行时间或者占用空间增大 nlogn 倍，,简称 nlogn 阶
 *上述几种从小到大的效率是：O(1) < O(logn) < O(n) < O(nlogn) < O(n^2) < O(n^3)
 *
 */
public class AlgorithmComplexity {

  public static void main(String[] args) {
    test01(10);
    System.out.println("================================================");
    test02(10);
    System.out.println("================================================");
    test03(10);
    System.out.println("================================================");
    test04(10);
    System.out.println("================================================");
    test05(10);
    System.out.println("================================================");
    test06(10);
    System.out.println("================================================");
    test07(10);
    System.out.println("================================================");
  }


  /**
   * 时间复杂度是O（n） 空间复杂度是O（1）
   */
  public static void test01(int n) {
    if (n > 10) {
      System.out.println("n > 10");
    } else if (n > 5) {
      System.out.println("n > 5");
    } else {
      System.out.println("n <= 5");
    }
    // 1 + 4 + 4 + 4
    for (int i = 0; i < 4; i++) {
      System.out.println("test");
    }
  }


  /**
   * 求第n个斐波拉契数解法 时间复杂度O(n)
   *
   */
  public static int fib1(int n) {
    if (n <= 1) {
      return n;
    }
    int first = 0;
    int second = 1;
    for (int i = 0; i < n - 1; i++) {
      int sum = first + second;
      first = second;
      second = sum;
    }
    return second;
  }

  /**
   * 时间复杂度是O（log n）
   */
  public static void test05(int n) {
    // 8 = 2^3
    // 16 = 2^4
    // 3 = log2(8)
    // 4 = log2(16)

    // 执行次数 = log2(n)
    // O(log n)
    while ((n = n / 2) > 0) {
      System.out.println("test");
    }
  }

  /**
   * 求第n个斐波拉契数 0 1 1 2 3 5 8 13 递归 时间复杂度 log2(n)
   */
  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  /**
   * 时间复杂度是O（n） 空间复杂度是O（n）
   */
  public static void test02(int n) {
    // O(n)
    // 1 + 3n
    for (int i = 0; i < n; i++) {
      System.out.println("test");
    }
  }

  /**
   * 时间复杂度是O（n^2）
   */
  public static void test03(int n) {
    // 1 + 2n + n * (1 + 3n)
    // 1 + 2n + n + 3n^2
    // 3n^2 + 3n + 1
    // O(n^2)
    // O(n)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println("test");
      }
    }
  }
  /**
   * 时间复杂度是O（n）
   */
  public static void test04(int n) {
    // 1 + 2n + n * (1 + 45)
    // 1 + 2n + 46n
    // 48n + 1
    // O(n)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 15; j++) {
        System.out.println("test");
      }
    }
  }
  public static void test06(int n) {
    // log5(n)
    // O(log n)
    while ((n = n / 5) > 0) {
      System.out.println("test");
    }
  }

  /**
   * 时间复杂度是  O(nlog n)
   */
  public static void test07(int n) {
    // 1 + 2*log2(n) + log2(n) * (1 + 3n)
    // 1 + 3*log2(n) + 2 * nlog2(n)
    // O(nlog n)
    for (int i = 1; i < n; i = i * 2) {
      // 1 + 3n
      for (int j = 0; j < n; j++) {
        System.out.println("test");
      }
    }
  }
}
