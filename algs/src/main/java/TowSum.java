import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author Maw
 * @Date 2021/3/7 13:24
 * @Version 1.0
 * @Des 给定一个数组，一个目标和，返回满足目标之和的数组角标
 */
public class TowSum {

    //目标数组
    public static int[] nums = {1,2,3,4,5};

    //两数之和
    public static int target = 6;

    public static void main(String[] args) {
        int[] ints = twoSum1(nums, target);
        for (int i = 0; i<ints.length;i++){
            System.out.println(ints[i]);
        }

        int[] ints2 = twoSum2(nums,target);
        for (int i = 0; i<ints2.length;i++){
            System.out.println(ints2[i]);
        }
    }

    //暴力解法 两个For循环遍历
    public static int[] twoSum1(int[] nums,int target){
        for (int i=0;i<=nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return  null;
    }

    //最优解 以空间换时间
    //其实这个解法的原理和Spring框架解决循环依赖的思想是一样的
    public static  int[] twoSum2(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[]{-1,-1};
        for(int i = 0;i<=nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }

}
