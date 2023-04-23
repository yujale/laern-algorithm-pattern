/**
 * <a href="https://leetcode.cn/problems/fibonacci-number/">509. 斐波那契数</a>
 * 斐波那契数（通常用F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是： F(0) = 0，F(1)= 1 F(n) =
 * F(n - 1) + F(n - 2)，其中 n > 1 给定 n ，请计算 F(n) 。 示例 1： 输入：n = 2 输出：1 解释：F(2) = F(1) + F(0) = 1 + 0 =
 * 1 示例 2： 输入：n = 3 输出：2 解释：F(3) = F(2) + F(1) = 1 + 1 = 2 示例 3：
 * <p>
 * 输入：n = 4 输出：3 解释：F(4) = F(3) + F(2) = 2 + 1 = 3
 */
public class _509_fibonacciNumber {

  public static void main(String[] args) {
    int i = fib1(100);
    System.out.println(i);
  }

  public static int fib1(int n) {
    if (n < 2) {
      return n;
    }

    return fib1(n - 1) + fib1(n - 2);

  }

  public static int fib2(int n) {
    if (n < 1) {
      return n;
    }

    int first = 0;
    int second = 1;
    for (int i = 0; i < n; i++) {
      int sum = first + second;
      first = second;
      second = sum;
    }

    return first;

  }

}
