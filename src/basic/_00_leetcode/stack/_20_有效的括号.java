package basic._00_leetcode.stack;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
// 每个右括号都有一个对应的相同类型的左括号。
//
//
//
//
// 示例 1：
//
//
//输入：s = "()"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "()[]{}"
//输出：true
//
//
// 示例 3：
//
//
//输入：s = "(]"
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 10⁴
// s 仅由括号 '()[]{}' 组成
//
//
// Related Topics 栈 字符串 👍 3890 👎 0


import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.Stack;

public class _20_有效的括号 {

  public static void main(String[] args) {
    String s = "()";
    boolean test = test1(s);
    System.out.println(test);
  }

  public static boolean test1(String s) {
    //1、判断输入的字符串是否为 null 或者长度是否为 0，如果是，直接返回 false
    //2、循环读取每一个字符串，如果读取的字符是左字符，则 push 栈中，如果读取的字符是右字符，则判断栈是否为空，如果是，直接返回 false，如果不为空，
    //将栈中的顶字符出栈，与右字符进行匹配，如果匹配，则继续循环，如果不匹配，则直接返回 false，
    //3、所有字符扫码哦完成后，，判断栈是否为空，如果为空，则返回 true，如果不为空，则返回 false

    if (s == null || s.length() == 0) {
      return false;
    }

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char left = stack.pop();
        if (c == ')' && left != '(') {
          return false;
        }

        if (c == ']' && left != '[') {
          return false;
        }

        if (c == '}' && left != '{') {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static boolean test2(String s) {
    if (s == null || s.length() == 0) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
        case '(':
        case '[':
        case '{':
          stack.push(c);
          break;
        case ')':
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
          break;
        default:
          break;
      }
    }
    return stack.isEmpty();
  }

  private static final HashMap<Character, Character> map = new HashMap<>();


  static {
    map.put('{', '}');
    map.put('(', ')');
    map.put('[', ']');
  }

  public static boolean test3(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c)) {
        stack.push(c);
      } else {
        if (stack.isEmpty() || map.get(stack.pop()) != c) {
          System.out.println("false");
        }
      }
    }
    return stack.isEmpty();
  }
}
