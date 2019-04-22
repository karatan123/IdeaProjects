import java.util.Scanner;

/**
 * 字符串示例
 */
public class StringDemo {
    public static void main(String[] args){
//        String value = "中国人民解放军";
//        //value+= "老牛鼻子了";
//        value = value.concat("老牛鼻子了");
//        System.out.println(value);

//        String value = "hello world";
//        value += "good";//相当于调用了value.concat()方法，会直接返回一个新的字符串对象空间
//        String value2 = "hello worldgood";//将字符串池中的地址赋给value2
//
//        //对象比较地址
//        System.out.println(value == value2);
//
//        //比较值
//        System.out.println(value.equals(value2));

//        String qiangWife = "龚小京";  //龚小京这个字符串被存在字符串池中
//        qiangWife = "奶茶妹妹";//奶茶妹妹也是在字符串池中的
//        qiangWife = qiangWife.concat("@小强东");//注意：刘强东的老婆已经不是原来常量池中的奶茶妹妹了，重新new了新空间
//        //思考：奶茶妹妹@小强东是否在常量池中   不在
//        System.out.println(qiangWife);


        //演示常用的几种String对象的构造方式
//        String str1 = "你好，世界";
//        String str2 = new String();//使用默认构造String str2 = ""；
//        String str3 = new String(str1);
//
//
//        char[] chArray = {'a','b','c'};//C中，字符数组和字符串区别最后一个元素是不是\0
//        //将字符数组转换成String对象
//        String str4 = new String(chArray);
//        System.out.println(str4);
//
//        char[] chArray1 = str4.toCharArray();
//        for (int i=0;i<chArray1.length;i++){
//            System.out.println(chArray1[i]);
//        }
//
//        //字节数组与字符串的转换，byte数据类型 -128-127之间
//        byte[] bytesArray = {104,101,108,108,111};   //实际就是存的各个字符的acssi码
//        String str5 = new String(bytesArray);
//        System.out.println(str5);
//
//        //字符串转码
//        String str6 = new String(str1.getBytes(),"UTF-8");
//

        //trim方法：去掉字符串左右两侧的空格
        //建议：在用户输入用户名后使用
//
//        String a = "abc";
//        String b = "234";
//        String c = a + b;
//
//        System.out.println("abc".equals("abc"));
//        System.out.println("abc".equals("abcd"));
//        System.out.println("abc".startsWith("b"));
//        System.out.println("abcdefg".endsWith("fg"));
//        System.out.println("abcdefg".contains("de"));
//
//indexOf方法 没查到返回-1
        String password = "ab3456abc";
        System.out.println(password.indexOf("aaa",2));
//            //substring[beginIndex,endIndex)
        System.out.println(password.substring(1,3));
        System.out.println(password.substring(3));


        //问题：判断字符串中只能由一个小数点，小数点不能在第一位，也不能再最后一位
        //








    }

    public static boolean isDecimal(String str){
        boolean isDecimal =true;
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                if(str.charAt(i) == '.'){
                    if (i == 0 || i == str.length()-1){//如果小数点在第一位或者最后一位，仍然是非法的 直接返回false
                        isDecimal = false;
                        break;

                    }

                }else{//如果当前字符不是数字并且也不是小数点，那么证明是非法字符，直接返回false
                    isDecimal = false;
                    break;
                }
            }
        }

        //判断字符串中只能有一个小数点
        //1 存在小数点 2.从前搜索的下标和从后往前搜索的下标刚好相等
        if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))){
            return false;
        }





        //1 判断字符串中每个元素必须是数字或小数点
        //2 如果是小数点，那么小数点不能是在第一位和最后一位，并且只能有一个小数点
//        if(str.indexOf('.' == 0 || str.indexOf(".") == str.length()-1)){
//
        return isDecimal;
//        }








    }
}
