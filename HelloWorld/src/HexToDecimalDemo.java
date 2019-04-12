import java.util.Scanner;
import java.lang.String;
/**
 * 十六进制和十进制之间的转换
 */
public class HexToDecimalDemo {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //让用户输入一个十进制数字
        System.out.print("请输入一个整型数字：");
        int decNum= input.nextInt();
        //调用方法将十进制转为16进制
        System.out.println(DecToHex(decNum));
        //将16进制数字转回十进制
        System.out.println(HexToDec(DecToHex(decNum)));


    }

    /**
     * 调用方法将10进制转为16进制
     * @param decNum 要转换的10进制数字
     * @return 转换成的16进制的数字（以字符串的方式返回）
     */
    public static String DecToHex(int decNum){
        // 45/16 反取余数
        String hex = "";
        while(decNum != 0){
            int temp =decNum%16;
            //余数有可能是0-9之间数字或10-15之间的数字
            if(temp >=0 && temp <=9){
                hex = temp+hex;//每取一个余数，就往前拼接
            }else if(temp >=10&& temp<=15){
                 //把数字转换成字符拼接
                hex = (char)(temp-10+'A') + hex;
            }
            decNum /=16;//取每次除以16的商

        }
        return hex;
    }

    /**
     * 十六进制转换为十进制
     * @param hex 要转换的16进制字符串
     * @return 转换成的10进制数字
     */
    public  static int HexToDec(String hex){
        int decNum = 0;
        //6E   6*16+14*1
        //需要遍历16进制字符串
        // 如果数组的首元素下标为i，那么最后一个元素下标为len-i-1
        for(int i= 0;i <hex.length(); i++){
            //取出字符串中每一个字符进行判断
            char  tempChar = hex.charAt(i);
            //两种情况'0'-'9'，'A'-'F'
            if(tempChar >='0' && tempChar<='9') {
                decNum += (tempChar-'0') * Math.pow(16, hex.length() - i - 1);
            }else if(tempChar >='A'&&tempChar<='F'){
                decNum += (tempChar - 'A'+10)* Math.pow(16, hex.length() - i - 1);
            }
        }
        return decNum;
    }
}
