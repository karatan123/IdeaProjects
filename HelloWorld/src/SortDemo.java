import java.util.Arrays;
import java.util.Collections;

public class SortDemo {
    public static void main(String[] args){
        //一共比较数组元素个数-1
        //，每一轮，比较的次数比上一轮少1
        //如果前面一个数子大于/小于后面一个数字，那么交换
//
        final int N = 50000;
        int[] nums = new int[N];
        int[] nums2 = new int[N];
        int[] nums3 = new int[N];
        for(int i = 0;i<nums.length;i++){
            nums[i] = (int)(Math.random()*100000);
            nums2[i] = nums[i];
            nums3[i] = nums[i];
        }
//        //冒泡排序
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i< nums.length-1;i++){
//            for(int j=0;j<nums.length-i-1;j++){
//               if(nums[j] >nums[j+1]){
//                   int temp = nums[j];
//                   nums[j] = nums[j+1];
//                   nums[j+1] = temp;
//               }
//            }
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("冒泡排序共耗时：" + (endTime - startTime) + "毫秒");

        //打印结果
//        System.out.println("排序后：");
//        for(int i = 0;i<nums.length;i++){
//            System.out.print(nums[i]);
//            if((i+1)%15 == 0){
//                System.out.println();
//            }else{
//                System.out.print(",");
//            }
//        }
//        System.out.println();

//        选择排序
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< nums2.length;i++){
           int min = nums2[i];
           int minIndex = i;
           for(int j=i+1;j<nums2.length;j++){
               if(min >nums2[j]){
                   min = nums2[j];
                   minIndex = j;
               }
           }
           int temp = nums2[i];
           nums2[i]= nums2[minIndex];
           nums2[minIndex] = temp;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("选择排序共耗时：" + (endTime - startTime) + "毫秒");
        //打印结果
        System.out.println("排序后：");
        for(int i = 0;i<nums2.length;i++){
            System.out.print(nums2[i]);
            if((i+1)%15 == 0){
                System.out.println();
            }else{
                System.out.print(",");
            }
        }
        System.out.println();

        //java自带数组排序
        startTime = System.currentTimeMillis();
        Arrays.sort(nums3);
        endTime = System.currentTimeMillis();
        System.out.println("Array.sort()共耗时：" + (endTime - startTime) + "毫秒");

        //逆序 首尾交换
        for(int i = 0; i < nums3.length/2;i++){
            int temp = nums2[i];
            nums3[i] = nums3[nums3.length-i-1];
            nums3[nums3.length-i-1] = temp;
        }
//        Collections.reverse(nums3.);
    }
}
