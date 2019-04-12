public class ParamDemo {
    public static void main(String[] args){
        paraTest("参数测试");

    }

    /**
     * 不定长度参数
     * @param str
     * @param nums
     */
    public static void paraTest(String str,int...nums){
        System.out.println("第一个参数：" + str);
        System.out.println(nums.length);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
