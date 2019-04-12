import java.util.Scanner;
public class GalenDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("生命值：******。。。");
        System.out.print("物理攻击：*****。。。");
        System.out.print("技能伤害：**。。。。");
        double attack= 47.00;
        double attackGrowth =4.5;
        System.out.print("伤害：");
        attack =input.nextDouble();
        System.out.print("伤害成长值：");
        attackGrowth = input.nextDouble();
        System.out.printf("\n伤害：%.2f(+%.2f)\n",attack, attackGrowth);

//        String line1 =String.format("\n伤害：%.2f(+%.2f)\n",attack,attackGrowth);

    }
}
