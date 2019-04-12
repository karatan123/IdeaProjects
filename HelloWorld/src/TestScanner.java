import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;
import java.util.SplittableRandom;

public class TestScanner {
    public static void main(String[] args){
//        用户手动输入半径
//        Scanner scanner = new Scanner(System.in);
        /*System.out.println("请输入半径");
        double radiu = scanner.nextDouble();
        double area = 3.14*radiu*radiu;
        System.out.printf("圆面积为：%.2f\n", area);
        System.out.print("品牌1：");
        String brand1 = scanner.nextLine();
        System.out.print("品牌2：");
        String brand2 = scanner.next();
        System.out.print(brand1);

        System.out.print(brand2);

//        获取用户输入的字符串的第一个字符
        char sex = scanner.next().charAt(0);
        System.out.print("性别：" + sex);*/
        int num =90;
        double num1 = num;//自动类型转换


        double num2 =90.2;
        int num3 = (int)num2;  //强制类型转换

        int num4 = 5/2; //
       // double num5 = 5/2d;
        double num5 = 5/2.0;

        System.out.print(num4 + " ");
        System.out.print(num5);



    }
}
