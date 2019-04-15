/**
 * 字符串示例
 */
public class StringDemo {
    public static void main(String[] args){
//        String value = "中国人民解放军";
//        //value+= "老牛鼻子了";
//        value = value.concat("老牛鼻子了");
//        System.out.println(value);

        String value = "hello world";
        value += "good";//相当于调用了value.concat()方法，会直接返回一个新的字符串对象空间
        String value2 = "hello worldgood";//将字符串池中的地址赋给value2

        //对象比较地址
        System.out.println(value == value2);

        //比较值
        System.out.println(value.equals(value2));




    }
}
