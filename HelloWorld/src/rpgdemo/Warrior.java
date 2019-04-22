package rpgdemo;

/**
 * 战士类    继承：私有属性和方法不能继承，父类构造不能继承
 * 使用super（）关键字调用父类的构造方法
 * 默认会先调用父类构造 再调用子类构造
 * java中只能继承一个父类
 * 父类中的私有属性在子类中不能直接访问
 * 继承关系是一种is-a的关系：父类和子类之间必须存在is-a的关系
 */
public class Warrior extends Hero {

    /**
     * 战士类静态属性 每实例化一个新的战士对象 ID++
     * 不管实例化多少个对象，均是共享同一个静态属性的
     */
    public static int ID=1;
    /**战士特有属性 物理攻击*/
    private int pysicalAttach;

    public Warrior(){
        setNickName("默认战士" + ID);
        setLevel(1);
        setMaxLife(100);
        setCurrentLife(100);
        setPysicalAttach(99);
        ID++;
    }

    public Warrior(String nickName,int pysicalAttach){
        this();
        setNickName(nickName);
        setPysicalAttach(pysicalAttach);
    }

    /**
     * 方法重写发生在通过继承而相关地地道道的不同类中
     * 方法重写具有同样的方法和返回值类型
     */

    @Override    //注解：重写
    public void move() {
       System.out.println("战士的移动：交通基本靠腿");
    }

    /**
     * 重写Object类中的equals方法，以便比较两个对象是否相等
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        //如果传入的是obj对是Warrior类的实例
        if (!(obj instanceof Warrior)){
            return false;
        }
        Warrior newWarrior = (Warrior)obj;
        //比较两个属性
        if(getNickName().equals(newWarrior.getNickName())&& getPysicalAttack() == newWarrior.getPysicalAttack()){
            return true;
        }
        return false;
    }

    /**
     * 重写Object类中的toString方法
     * @return
     */
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(getLevel());
        str.append("\t");
        str.append(getNickName());
        str.append("\t");
        str.append(getMaxLife());
        str.append("\t\t");
        str.append(getCurrLife());
        str.append("\t");
        str.append(getPysicalAttack());
        return str.toString();
    }

    /**
     * 重写父类的移动方法
     */


//    public void move(){
//        System.out.println(getNickName() + "移动基本靠腿");
//    }

    public int getPysicalAttack() {
        return pysicalAttach;
    }

    public void setPysicalAttach(int pysicalAttach) {
        this.pysicalAttach = pysicalAttach;
    }


}
