public class FabolacciDemo {
    public static void main(String[] args){
        //0,1,1,2,3,5,5,13,21,34,55,89,144 斐波拉契数列
         //规律：前两个元素固定，从第三个开始，是前两个元素之和、、
        int[] nums = new int[15];
        int sum = 0;
        double avg;
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2;i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        System.out.println("打印结果");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
            sum += nums[i];
        }
        System.out.println();//打印换行
        System.out.println(sum/nums.length/1.0);
    }
}
