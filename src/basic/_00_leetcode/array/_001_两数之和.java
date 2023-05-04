package basic._00_leetcode.array;
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。 

//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 只会存在一个有效答案 
// 
//
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 
//
// Related Topics 数组 哈希表 👍 16929 👎 0

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
public class _001_两数之和 {
    public static void main(String[] args) {
        int[] array =  new int[]{2, 7, 11, 15};
        int[] result =  twoSum01(array, 2);
            for (int result2 : result) {
                System.out.println(result2);
            }
    }

    /**
     * 一遍哈希表，利用 Map 的 key 的特性
     * 
     * @param nums   数组
     * @param target 目标值
     * @return 返回数组下标
     */
    public static int[] twoSum01(int[] nums, int target) {
        if (nums.length < 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 暴力循环
     * 
     * @param nums   数组
     * @param target 目标值
     * @return 返回数组下标
     */
    public static int[] twoSum02(int[] nums, int target) {
        if (nums.length < 0) {
            return new int[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum03(int[] nums, int target) {
        if (nums.length < 0) {
            return null;
        }


        return new int[0];
    }
}
