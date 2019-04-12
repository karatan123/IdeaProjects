//变量是计算机中的一块特定的内存空间
//变量命名：首字母 字母 下划线 $
//其他字母  字母 下划线 ￥ 和数字
//关键字   不能是关键字

//String nickName 驼峰命名
//class Person 帕斯卡命名法

public class DataType {
    public static void main(String[] args){
        double milkPrice;
        milkPrice = 0.40;
        System.out.println(milkPrice);

//        溢出
        int value = 2147483647 + 1;
        System.out.println(value);
//        获取整型的最大值和最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        String goodsName1 = "德芙巧克力";
        double price1 = 30.9;
        int count1 = 10;
        String remarks = "丝滑niun。。。。";
        System.out.printf("%s\t%.2f\t%d\t%s",goodsName1,price1,count1,remarks);
        System.out.println(goodsName1+ "\t"+price1 + "\t" + count1 + "\t" + remarks);
    }
}
