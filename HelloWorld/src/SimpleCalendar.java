import java.util.Scanner;
public class SimpleCalendar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        定义变量：年、月、天
//        int year = -1,month = -1,dayOfMonth = -1;
//        System.out.print("年份：");
//        year = input.nextInt();
//        System.out.print("月份：");
//        month = input.nextInt();
////        根据月份计算当月天数 2月默认28天
////        如果输入的年份是闰年  月份天数+1
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                dayOfMonth = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                dayOfMonth = 30;
//                break;
//            case 2:
//                dayOfMonth = 28;
//                break;
//            default:
//                System.out.print("只输入1-12之间的整型数字！");
//                System.exit(0);
//                break;
//        }
////如果是闰年，月份天数+1
//        boolean isLeadYear = year%4==0 && year%100!=0 || year%400==0;
//        if(isLeadYear){
//            dayOfMonth++;
//        }
//        System.out.print(year + "年" + month + "月有" + dayOfMonth + "天！");
          int choice = -1;//用来保存用户选择
           System.out.print("姓名：");
           String name = input.next();
           switch (name){
               case "上帝":
                   System.out.print("帝哥你好！");
                   break;
               case "大侠":
                   System.out.print("djkdd");
                   break;
               default:
                   break;
           }
    }
}
