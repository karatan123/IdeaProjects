import java.util.Scanner;
import javax.swing.text.Style;
import java.lang.Integer;
public class BoxingDemo {
    public static boolean isDigit(char ch){
        return ch>='0'&&ch<='9';
    }
    public static void main(String[] args){
        //补充字符包装类
//        Character.isLetter(ch);
//        Character.isLetterOrDigit(ch);
//        Character.isJavaIdentifierPart(ch);//判断用来定义java变量的单词中，除首字符之外，其他字符是否是合法字符
//        Character.isJavaIdentifierStart(ch);//判断用来定义java变量的单词中，第一个字符是否合法
//        Character.isUpperCase(ch);//判断是否大写字母
        //判断用户输入的字符串是否是一个纯数字
        boolean  isDigit =true;
        System.out.println("请输入一个字符串，我来判断是否是一个纯数字：");
        String value = new Scanner(System.in).next();
        for(int i=0;i<value.length();i++){

//            if(!isDigit(value.charAt(i))){
            if(!Character.isDigit(value.charAt(i))){
                isDigit = false;
                break;
            }

        }
        if(!isDigit){
            System.out.println("不是一个纯数字");
        }else{
            System.out.println("是一个纯数字");
        }






        //        Integer num1 = 100;//new Integer(100);
//        Integer num2 = 100;//new Integer(100);
//        //System.out.println(num1 == num2);
//
//        //两个对象之间的比较方法
//        System.out.println(num1.compareTo(num2));
//

//        double num1 =3.14;
//        Double dnum1 = new Double("3.14");
//        Double dNum1_1 = Double.valueOf(num1);//两种装箱的房
//        Double dNum1_2 = 3.14;//自动装箱
//
//        num1 = dnum1;//自动拆箱
//        num1 = dNum1_1.doubleValue();
//        System.out.println(num1 + "\t" + dnum1.toHexString(num1));

    }
}
