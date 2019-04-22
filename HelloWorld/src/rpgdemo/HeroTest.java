package rpgdemo;

public class HeroTest {
    public static void main(String[] args){
//        Warrior hanxin = new Warrior("hanxin",500);
//        System.out.println(hanxin.getNickName());
//        hanxin.move();
//        Hero hanxin;//声明了一个Hero类型的变量 hanxin（多态）
//        hanxin = new Warrior();//在堆内存中分配了空间（同时调用子类构造进行初始化），将地址赋值给了hanxin变量
//        hanxin.move();
//
//        //问题：对象韩信的类型是什么   实际是父类对象     多态
//
//        Warrior 曹操1 = new Warrior("曹操",1500);
//        曹操1.setLevel(99);
//        Warrior 曹操2 = new Warrior("曹操",1500);
//        曹操2.setLevel(99);
//        //System.out.println(曹操1 == 曹操2);
//        //System.out.println(曹操1.equals(曹操2));
//        System.out.println(曹操1.compareTo(曹操2));

       // System.out.println(曹操1);

        Archmage 貂蝉 = new Archmage("貂蝉");
        貂蝉.biubiubiu();
        System.out.println(貂蝉);
        Archmage xiaoqiao =  new Archmage();
        System.out.println(xiaoqiao);







    }
}
