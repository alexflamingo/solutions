package solution;

import customlib.PrepData;
import customlib.Printer;

/**
 * Created by alexshi on 9/6/15.
 */
public class SortedArrayTwoSum {

    private static int[] test(int[] nums, int K){
        if(nums.length <= 1) return new int[]{0, 0};
        int p = 0, q = nums.length-1;
        while(p < q){
            if(nums[p]+nums[q]==K) return new int[]{nums[p], nums[q]};
            if(nums[p]+nums[q]>K) q--;
            else p++;
        }
        return new int[]{0, 0};
    }

    public static void run(){
        Printer.pArray(0, test(PrepData.prepSArray(10, -5, 15), 6));
        Printer.pArray(0, test(PrepData.prepSArray(10, -5, 15), 7));
        Printer.pArray(0, test(PrepData.prepSArray(10, -5, 15), 8));
        Printer.pArray(0, test(PrepData.prepSArray(10, -5, 15), 13));
        Printer.pArray(0, test(PrepData.prepSArray(10, -5, 15), 21));
    }
}
