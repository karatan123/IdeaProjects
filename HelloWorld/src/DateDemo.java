/**
 * @功能 获取指定格式的日期          文档注释
 * @作者 kara
 *@时间 2019-03-25
*/

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {
    public static void main(String args[]){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间：" + ft.format(date));

        //System.out.println("注释此行");
       /* System.out.println("注释多行");
        System.out.println("注释多行");
        System.out.println("注释多行");*/
    }
}
