import sun.jvm.hotspot.debugger.cdbg.Sym;
import java.util.Scanner;
public class Breakdemo
{
    public static void main(String[] args){
        int exp =0;//个人贡献度
        int sum = 0;//个人总贡献度
        for(;;){//死循环
            System.out.println("请输入本次的贡献度");
            exp = new Scanner(System.in).nextInt();//匿名的方式调用对象方法
            if(exp < 0){
                System.out.println("个人贡献度不能为负数，程序强制退出！");
                break;
            }
            sum +=exp;
        }
        System.out.println("您输入的总贡献度为" + sum);
    }
}
