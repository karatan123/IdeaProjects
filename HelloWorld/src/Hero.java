public class Hero {
    /**
     * 玩家的名称创建之后不能修改
     * 级别在1-999之间
     * (（等级-1）^3+60)/5*(（等级-1)*2+60）
     */
    private long id;
    private String  nickName;
    private int level;
    private long currentExp;
    private long exp;




    //怎么在另一个类中访问其他类的private的变量或者方法
    // 1 在另一个类中是无法访问本类的私有属性或者方法
    //2 在内部类中可以直接访问
    //可以通过定义方法的形式，让外部类调用，以获得方法的返回值

    /**
     * 内部类
     */
    class Weapon{
        public void fight(){
            System.out.println(id);
        }
    }

    public long getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(long currentExp) {
        this.currentExp = currentExp;
    }


    public Hero(long id, String nickName, int level, long exp) {
        this.id = id;
        this.nickName = nickName;
        this.level = level;
        this.exp = exp;
    }

    public Hero() {
        super();
    }

    public Hero(String nickName){
        this.nickName = nickName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id <=0) id=1;
        else
            this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    private void setNickName(String nickName) {
        if(nickName == null){
            nickName="未知英雄";
        }else {
            this.nickName = nickName;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level <1 || level>999){
            this.level =1;//如果级别超限，就中心从1级开始
            //如果大于999，可以设置英雄角色转生轮数+ --
        }else {
            this.level = level;
        }
    }

    public long getExp() {
        exp= ((long)Math.pow(level-1,3)+60)/5+((level-1)*2+60);
        return exp;
    }

//    public void setExp(long exp) {
//        this.exp = exp;
//    }
}
