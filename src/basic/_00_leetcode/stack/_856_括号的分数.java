package basic._00_leetcode.stack;

import java.util.Stack;

//给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
//
//
// () 得 1 分。
// AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
// (A) 得 2 * A 分，其中 A 是平衡括号字符串。
//
//
//
//
// 示例 1：
//
// 输入： "()"
//输出： 1
//
//
// 示例 2：
//
// 输入： "(())"
//输出： 2
//
//
// 示例 3：
//
// 输入： "()()"
//输出： 2
//
//
// 示例 4：
//
// 输入： "(()(()))"
//输出： 6
//
//
//
//
// 提示：
//
//
// S 是平衡括号字符串，且只含有 ( 和 ) 。
// 2 <= S.length <= 50
//
//
public class _856_括号的分数 {

  public static void main(String[] args) {

  }

  public static int test1(String s){
    //1、判断当前字符串是否或者长度为 0 ，如果是，则返回 0 ，如果不是，则判断长度是否为 2 ，如果是，则返回 1 ，如果不是，则进入下一步
    //2、创建一个栈，用来存储括号
    //3、循环遍历字符串，如果当前字符为 ( ，则将其入栈，如果当前字符为 ) ，
    // 则判断栈顶元素是否为 ( ，如果是，则将栈顶元素出栈，然后将 1 入栈，如果不是，则将栈顶元素出栈，然后将出栈的元素与 2 相乘，将结果入栈

    if (s == null || s.length() == 0) {
      return 0;
    }
    if (s.length() == 2) {
      return 1;
    }

    Stack<Object> stack = new Stack<>();
    stack.push(0);
    for (int i = 0; i < s.length()  ; i++) {
      char c = s.charAt(i);
      if (c == '(') {
        stack.push(c);
      } else {

      }
    }
    return  0;
  }


}
