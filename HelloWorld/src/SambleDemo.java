import java.util.Scanner;
public class SambleDemo {
    public static void main(String[] args){
       /* int num1=5,num2=2;
        int result1 = num1++;//一元运算符
        System.out.print(result1);
        System.out.print(num1);
        //二元运算符+ - * % /
        int num = 9527 /100;
        int result2 =1500 % 10; //取模就是取余数  可以获取一个数的后几位   取模时候符号与第一个操作数符号一致

        int result = num1 > num2 ? 90 : 80;   //三元运算符
        System.out.print(result);*/

        //整数兑换零钱
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入钱的数量：");
//        double money= input.nextDouble();
//
////        处理部分
//        int yuan = (int)money;
//        int numOfShiYuan = yuan / 10;
//        int numOfWuYuan = yuan % 10 / 5;
//        int numOfYiYuan = yuan % 10 - 5*numOfWuYuan;
//
////        处理角问题
//        int jiao= ((int)(money*10))%10;
//        int numOfWuJiao = jiao / 5;
//        int numOfYiJiao = jiao - 5*numOfWuJiao;
//        System.out.print("10元的纸币数量：" + numOfShiYuan + "\n");
//        System.out.print("5元的纸币数量：" + numOfWuYuan + "\n 1元的纸币数量：" + numOfYiYuan + "\n");
//        System.out.print("5角的纸币数量：" + numOfWuJiao + "\n");
//        System.out.print("1角的纸币数量：" + numOfYiJiao);
          System.out.print(5 & 4);
    }
}
