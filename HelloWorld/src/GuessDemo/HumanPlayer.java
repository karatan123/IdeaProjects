package GuessDemo;

/**
 * 人类玩家
 */
public class HumanPlayer {
    /** 静态常量：出拳的信息*/
    public static final int MessageTypeFist = 1;
    /** 静态常量：赢得比赛的信息*/
    public static final int MessageTypeWin = 2;
    /** 静态常量：输掉比赛的信息*/
    public static final int MessageTypeLose = 3;
    //属性：名称、分数、所出的拳、（角色对应的音效）、角色个性化台词
    private String name;
    private int score;
    private  int fist;
    //.........
    /**
     * 角色在出拳的时候说的个性化台词
     */
    private String[] firstWords={
            "动感光波~~~~biubiu",
            "大象大象你的鼻子为什么这么长",
            "必杀:露pp外星人",
            "大姐姐你喜欢吃辣椒吗",
            "心熊狭窄"
    };
    private String[] winnerWords= {
            "还有谁",
            "猜拳有点意思",
            "超神",
            "全军出击",
            "吃着火锅唱着歌"
    };
    private String[] loseWords = {
            "通往成功的路总是在施工中",
            "等到潮水退去，就知道睡在裸泳",
            "夏天就是不好",
            "将来我死了，把qq捐给希望工程",
            "众人皆醉我独醒"
    };

    /**
     * 根据传入的消息类型，随机打印对应类型的消息
     * @param msgType 对应HumanPlayer类中定义的静态变量
     */
    public void sendMessage(int msgType){
        //生成0-4之间的随机数
        int index = ((int)(Math.random()*1000))%5;
        String message =null;//要打印的消息
        switch (msgType){
               case MessageTypeFist:
                    message = firstWords[index];
                    break;
               case MessageTypeWin:
                    message = winnerWords[index];
                    break;
               case MessageTypeLose:
                    message = loseWords[index];
                    break;
        }
        System.out.println(message);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFist() {
        return fist;
    }

    public void setFist(int fist) {
        this.fist = fist;
    }



    //方法：设置和得到名称、分数、（播放音效）、说个性化台词、出拳

}
