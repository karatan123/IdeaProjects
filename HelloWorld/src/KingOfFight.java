import java.io.File;
import java .applet.Applet;
import java.lang.InterruptedException;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.util.Scanner;


public class KingOfFight {
    public static void main(String[] args) throws MalformedURLException {
        Scanner input = new Scanner(System.in);
//        播放音乐  mp3格式java不支持
        File sound1 = new File("/Users/kara/IdeaProjects/HelloWorld/sound/media.io_顾珣-你.wav");
        AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
        sound_choose.play();

//        随机数
//        (int)(Math.random()*10000)%10 +5;       //Math.random生成0-1之间的小数【0.0，1.0）
//   (int)(Math.random()*10000)%(b-a+1) + a    此表达式为生成a-b之间的随机数表达式


//        1.让双方选名字
        System.out.print("请输入玩家名字：");
        String userName = input.next();
        String comName = "大脑";
        System.out.println(userName + "VS" + comName);
        sound1 = new File("/Users/kara/IdeaProjects/HelloWorld/sound/media.io_葫芦娃儿歌-七个葫芦兄弟.wav");
        sound_choose = Applet.newAudioClip(sound1.toURL());
        sound_choose.play();

//        初始化双方的数据（体力值默认100）
        int hp1 =100, hp2 = 100;
        int attack1 = 0, attack2 = 0;
//        使用循环模拟对战过程
        while(hp1 >0 && hp2 >= 0){
            attack1 = (int)(Math.random()*10000)%11 + 5;
            attack2 = (int)(Math.random()*10000)%11 + 5;

//            让玩家先攻击
            hp2 -= attack1;//玩家攻击，电脑掉血
            System.out.println(userName + "打出了一记-离你低的金额" + comName + "掉血" + attack1);
            sound_choose.stop();
            sound1 = new File("/Users/kara/IdeaProjects/HelloWorld/sound/media.io_葫芦娃儿歌-亲爱的爷爷和神气的六娃.wav");
            sound_choose = Applet.newAudioClip(sound1.toURL());
            sound_choose.play();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            hp1 -= attack2;
            System.out.println(comName + "打出了一记-离你低的金额" + userName + "掉血" + attack2 );

            sound_choose.stop();
            sound1 = new File("/Users/kara/IdeaProjects/HelloWorld/sound/media.io_葫芦娃儿歌-勇敢的三娃本领大.wav");
            sound_choose = Applet.newAudioClip(sound1.toURL());
            sound_choose.play();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

//        4打印最终结果
        System.out.println("KO!");
        System.out.println("玩家姓名\t血量");
        System.out.println(userName + "\t" + hp1);
        System.out.println(comName + "\t" + hp2);
        sound_choose.stop();

    }

}

