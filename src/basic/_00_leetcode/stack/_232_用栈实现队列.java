package basic._00_leetcode.stack;

import java.util.Stack;

//请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
//
// 实现 MyQueue 类：
//
//
// void push(int x) 将元素 x 推到队列的末尾
// int pop() 从队列的开头移除并返回元素
// int peek() 返回队列开头的元素
// boolean empty() 如果队列为空，返回 true ；否则，返回 false
//
//
// 说明：
//
//
// 你 只能 使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法
//的。
// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
//
//
//
//
// 示例 1：
//
//
//输入：
//["MyQueue", "push", "push", "peek", "pop", "empty"]
//[[], [1], [2], [], [], []]
//输出：
//[null, null, null, 1, 1, false]
//
//解释：
//MyQueue myQueue = new MyQueue();
//myQueue.push(1); // queue is: [1]
//myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
//myQueue.peek(); // return 1
//myQueue.pop(); // return 1, queue is [2]
//myQueue.empty(); // return false
//
//
//
//
//
//
//
// 提示：
//
//
// 1 <= x <= 9
// 最多调用 100 次 push、pop、peek 和 empty
// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）
//
//
//
//
// 进阶：
//
//
// 你能否实现每个操作均摊时间复杂度为 O(1) 的队列？换句话说，执行 n 个操作的总时间复杂度为 O(n) ，即使其中一个操作可能花费较长时间。
//
//
public class _232_用栈实现队列 {

  /**
   * 1、创建入栈和出栈
   * 2、入队时值进入入栈，
   * 3、出队时，
   *  1.判断出队栈是否为空，如果为空，则将入队栈的元素 push 到出队栈中，然后出队栈弹出栈顶元素 如果不为空，出队栈弹出栈顶元素
   *
   * @param args
   */
  public static void main(String[] args) {

  }

  private final Stack<Integer> inStack ;
  private final Stack<Integer> outStack ;

  public _232_用栈实现队列() {
    inStack = new Stack<>();
    outStack = new Stack<>();
  }


  public void push(int x) {
    inStack.push(x);

  }

  public int pop() {
    if (outStack.isEmpty()) {
      while (!inStack.isEmpty()) {
        outStack.push(inStack.pop());
      }
    }

    return outStack.pop();
  }

  public int peek() {
    if (outStack.isEmpty()) {
      while (!inStack.isEmpty()) {
        outStack.push(inStack.pop());
      }
    }

    return outStack.peek();
  }

  public boolean empty() {
    return inStack.isEmpty() && outStack.isEmpty();
  }


}
