public class NumsCount {
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

        int count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++){//偶数
            if(nums[i] % 2 == 0){
                count2++;
            }else{
                count1++;
            }
        }

    }
}
