public class ShuffleCard
{
    public static void main(String[] args){
        final int N = 52;
        //52张牌
        int[] cards = new int[N];
        for(int i = 0; i < cards.length; i++){
            cards[i] = i;
        }
        System.out.println("洗牌前：");
        for(int i = 0; i < cards.length; i++){
            System.out.print(cards[i]);
            if((i + 1) % 13 == 0){
                System.out.println();
            }else{
                System.out.print(",");
            }
        }
        //洗牌 随机生成0-51之间数字newIndex，cards[i]和cards[newIndex]元素交换
        for(int i = 0; i < cards.length; i++){
            int newIndex = (int)(Math.random() * N);//0-51之间的随机数
            int temp = cards[i];
            cards[i] = cards[newIndex];
            cards[newIndex] = temp;
        }
        String[] cardColors = {"黑桃","红心","方块","梅花"};
        //牌面数组
        String[] cardValues = {
                "A","2","3","4","5","6","7","8","9","10","J","Q","k"
        };



        System.out.println("洗牌后：");
        for(int i = 0; i < cards.length; i++){
//          System.out.print(cards[i]);
            System.out.printf("%s-%s",cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
          if((i + 1) % 13 == 0){
              System.out.println();
          }else{
              System.out.print(",");
          }
        }

    }
}
