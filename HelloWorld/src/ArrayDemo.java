import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args){
//        int[] nums;//声明了一个整型数组
//        nums[0] = 9;
        //java.lang.NullPointerException
        //异常-空指针异常-没有空间

//        int num;//处理基本类型：在栈内存直接分配了空间（不需要手动分配空间） 栈（）和堆
//        num=9;

//        Scanner input = new Scanner(System.in);//在堆内存中分配了空间
//数组明就是新分配内存空间的首地址
          int[] nums = new int[5];//在堆内存中分配了5个int类型大小的空间
          System.out.println(nums);

          int years[] = {2013,2012,2033,3232,233,3232};//错误：声明并初始化数组是不需要指定数组大小的
          int[] months = {22,343,3443,34343,343};
          int days[] = {1,3};
          int array[] = {};//语法正确，但是不能为数组元素赋值

//    动态给数组元素赋值
        //动态输入5格学生成绩，求平均数
        Scanner input =  new Scanner(System.in);
        final int N=10; //定义常量
        double[] scores = new double[N];
        double sum =0, avg;
        for(int i=0; i< scores.length;i++){
            System.out.print("请输入第" + (i+1) + "位同学成绩");
            scores[i] = input.nextDouble();
        }
        //打印总成绩
        for(int i=0;i<scores.length;i++){
            sum +=scores[i];
        }
        System.out.printf("%d为同学的平均成绩为%.2f", scores.length, sum/scores.length);
    }
}
