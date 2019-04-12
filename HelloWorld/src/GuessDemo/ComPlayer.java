package GuessDemo;

/**
 * 机器玩家
 */
public class ComPlayer {
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
            "机器 动感光波~~~~biubiu",
            "机器 大象大象你的鼻子为什么这么长",
            "机器 必杀:露pp外星人",
            "机器 大姐姐你喜欢吃辣椒吗",
            "机器 心熊狭窄"
    };
    private String[] winnerWords= {
            "机器 还有谁",
            "机器 猜拳有点意思",
            "机器 超神",
            "机器 全军出击",
            "机器 吃着火锅唱着歌"
    };

    private String[] loseWords = {
            "机器 通往成功的路总是在施工中",
            "机器 等到潮水退去，就知道睡在裸泳",
            "机器 夏天就是不好",
            "机器 将来我死了，把qq捐给希望工程",
            "机器 众人皆醉我独醒"
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
        //电脑的出拳实际就是1-3之间的随机数
        fist=((int)(Math.random()*30000))%3+1;
        return fist;
    }

//    public void setFist(int fist) {
//        this.fist = fist;
//    }
//



    //方法：设置和得到名称、分数、（播放音效）、说个性化台词、出拳

}
