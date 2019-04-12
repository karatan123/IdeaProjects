//二分查找法
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        //基本原理
        //首先将要查找的元素与数组的中间元素比较
        //如果key小于中间元素，只需要将数组的前一半元素中继续查找
        //如果key与中间元素相等，匹配成功，查找结束
        //如果key大于中间元素，只需要在数组的后一半元素中继续查找key
        Scanner input = new Scanner(System.in);
        int[] array = {2,5,8,15,35,45,55,65,75,95,95};
        System.out.print("请输入要查找的数字：");
        int deleteIndex = -1;//要删除元素的下标
        int count = array.length;//当前数组元素的总个数
        int searchNum = input.nextInt();
        boolean isFind = false;
        int low = 0;
        int high =array.length-1;
        //不知道要查找的次数
        while(high >= low){
            //计算中点下标
            int mid = (high+low)/2;
            //如果key小于中间元素，只需要将数组的前一半元素中继续查找
            if(searchNum <array[mid]){
                high = mid -1;
            }else if(searchNum > array[mid]){
                low = mid+1;
            }else{
                System.out.println("找到了数字！下标为：" + mid);
                deleteIndex = mid;
                isFind = true;
                break;
            }
        }
         if(!isFind || deleteIndex== -1){
             System.out.println("没有找到数子");
             System.exit(0);//强制退出程序
         }
         count--;
         for(int i = deleteIndex;i<count;i++){
             array[i] = array[i+1];
         }
         for(int i = 0;i<count;i++){
             System.out.println(array[i]);
         }
    }
}
