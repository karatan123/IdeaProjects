public class Hero1 {
    String name = "默认值"; // 成员变量 有默认初始值
    public void test1(){
        String name = "盖伦";//局部变量必须初始化   在方法中局部变量优先级高
        System.out.println(name);
    }
    public static void main(String[] args){
        new Hero1().test1();
    }
}
