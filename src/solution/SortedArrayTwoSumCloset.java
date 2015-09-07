package solution;

import customlib.PrepData;
import customlib.Printer;

/**
 * Given a sorted array and an integer K, find any pair of two elements whose sum is closet to K
 * Time: O(n) Space: const
 * Created by alexshi on 9/6/15.
 */
public class SortedArrayTwoSumCloset {

    private static int[] test(int[] nums, int K){
        if(nums.length < 2) return new int[]{0, 0};
        int p = 0, q = nums.length - 1;
        int diff = Math.abs(nums[0] + nums[nums.length-1] - K);
        int[] res = new int[2];
        while(p < q){
            int tmp = nums[p] + nums[q] - K;
            if(tmp == 0) return new int[]{nums[p], nums[q]};
            if(diff >= Math.abs(tmp)){
                res[0] = nums[p];
                res[1] = nums[q];
                diff = Math.abs(tmp);
            }
            if(tmp > 0) q--;
            else p++;
        }
        return res;
    }

    public static void run() {
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
        Printer.pArray(0, test(PrepData.prepSArray(10, -30, 30), 0));
    }
}
