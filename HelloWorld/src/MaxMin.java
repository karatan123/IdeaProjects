public class MaxMin {
    public static void main(String[] args){
        //随机生成一个数组，求里面的最大值和最小值
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++ ){
            nums[i] = ((int)(Math.random() * 10000)) % 1001;//0-1000的随机数
        }
        System.out.println("数组元素");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        //求最大值和最小值
        //1.假设第一个元素为最大值或最小值
//        //2.拿最大值或最小值在数组中逐个比较，
////        int max = nums[0];
//        int min = nums[0];
        int max = Integer.MIN_VALUE;//所有整型中最小值
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println("数组中的最大值为：" + max);
        System.out.println("数组中的最小值为：" + min);
    }
}
