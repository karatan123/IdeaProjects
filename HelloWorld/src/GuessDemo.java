import java.util.Scanner;
public class GuessDemo {
    public static void main(String[] args) {
//        用户要猜的数字
//        用户猜的数字
        final int price = 5000;//final声明常量，不允许多次赋值
        int guessPrice = 0;
        int count = 0;
        String priceName = null;
        for (int i=1; i < 5; i++) {
            System.out.println("请输入神秘商品的单价：（" + ++count + "次）");
            guessPrice = new Scanner(System.in).nextInt();
            if (guessPrice == price) {
                if (count == 1) {
                    System.out.println("牛逼，一次就猜对了");
//                    System.out.println("奖品：iphone8s plus plus 土豪金");
                    priceName = "奖品：iphone8s plus plus 土豪金";
                } else if (count >= 2 && count <= 3) {
//                    System.out.println("奖品：华为荣耀手环Zero");
                    priceName = "奖品：华为荣耀手环Zero";
                } else {
//                    System.out.println("奖品：小米蓝牙耳机青春版");
                    priceName = "奖品：小米蓝牙耳机青春版";
                }
                break;
            } else if(guessPrice >price){
                System.out.println("大了，请继续");
            }else if(guessPrice <price){
                System.out.println("小了，请继续");
            }

        }
        if (priceName == null)
            System.out.println("很遗憾，五次机会均没猜对！");
        else System.out.println("恭喜您中奖啦，奖品是：" + priceName);


    }
}