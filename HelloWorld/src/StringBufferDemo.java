import java.util.Collections;

public class StringBufferDemo {
    public static void main(String[] args) {
//        String str1 = "a";
//        String str2 = "b";
//        String str3 = str1+str2;
//        //底层实现
//        StringBuffer str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
//        final int N = 100000;
//        long startTime = System.currentTimeMillis();
//        String str = "*";
//        for (int i = 0; i < N; i++) {
//            str += "*";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("+=用时" + (endTime - startTime) + "毫秒");
//
//
//        //使用StringBuffer进行字符串拼接
//        startTime = System.currentTimeMillis();
//        StringBuffer str1 = new StringBuffer("*");
//        for (int i = 0;i<N;i++){
//            str1.append("*");
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("+=用时" + (endTime - startTime) + "毫秒");
//
//
//        //StringBuilder 速度比StringBuffer更快
//        startTime = System.currentTimeMillis();
//        StringBuilder str2 = new StringBuilder("*");
//        for (int i = 0;i<N;i++){
//            str2.append("*");
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("+=用时" + (endTime - startTime) + "毫秒");
//
        StringBuffer strBuffer = new StringBuffer("你好,成都");
        StringBuffer strBuffer1 = new StringBuffer("你好,成都");
        StringBuffer strBuffer2 = new StringBuffer("你好,成都");

        System.out.println(strBuffer.equals(strBuffer1));//比较的地址

        //值比较
        System.out.println(strBuffer.toString().equals(strBuffer1.toString()));
        strBuffer.append('a');
        strBuffer.append(1213L);

        System.out.println(strBuffer.reverse());//反转字符串
        strBuffer1.insert(3,"abc");//在规定的下标处插入元素
        System.out.println(strBuffer1);

        strBuffer2.deleteCharAt(3);
        System.out.println(strBuffer2);
        strBuffer2.delete(2,4);//删除【2，4）下标之间的元素
        System.out.println(strBuffer2);

        strBuffer1.replace(2,4,"北京");
        System.out.println(strBuffer1);

        strBuffer.setCharAt(3,'神');
        System.out.println(strBuffer);

        System.out.println("缓存大小：" + strBuffer.capacity());//实例化对象时16+字符串大小；

        //strBuffer.setLength(0);//相当于清空字符串对象

        //将缓冲区裁剪成与实际字符串长度一致
        strBuffer.trimToSize();
        System.out.println("缓存大小：" + strBuffer.capacity());




    }




}
