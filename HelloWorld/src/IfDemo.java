import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args) {
//    硬盘盘符一般采用A-Z大写字母表示
//    使用程序判断用户输入的字符是否合法
        Scanner input = new Scanner(System.in);
        System.out.print("请输入硬盘盘符：");
        char ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.print("输入的盘符是合法的盘符");
        } else {
            System.err.print("输入的为非法盘符");
        }
    }
}
