package rpgdemo;

public class Hero {
    private String nickName;
    private int level;
    private int maxLife;
    private int currLife;

    public Hero(){
        super();
    }

    public Hero(String nickName,int level,int maxLife,int currLife){
        super();
        this.nickName = nickName;
        this.level = level;
        this.maxLife = maxLife;
        this.currLife = currLife;
    }

    /**
     * 比较当前英雄对象和传入的英雄对象的大小相等
     * @param hero
     */
    public int compareTo(Hero hero){
//只比较级别
        if(this.level > hero.getLevel())
            return 1;
        else if(this.level == hero.getLevel())
            return 0;
        else
            return -1;
    }

    public int compareToByName(Hero hero){
        return getNickName().compareTo(hero.getNickName());

    }


    public void move(){
        System.out.println("Hero类点的move方法");
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurrLife() {
        return currLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currLife = currentLife;
    }




}
