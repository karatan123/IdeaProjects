public class ForDemo {
    public static void main(String[] args){
      //操场上有100多人排队，三人一组多1人，四人一组多2人，5人一组多3人。问：一共多少人
      for(int i = 100; i < 200; i++){
          if(i % 3 == 1 && i % 4 == 2 && i % 5 == 3){
              System.out.println(("一共有" + i + "人！"));
          }
      }

//      甲乙丙丁一共加工零件370个，如果把甲做的个数加10，乙做的个数20，丙做的个数乘以2
         //丁做的个数除以2，那么四个人做的零件数量相等。问：甲一共做了多少个零件
       for(int i = 1;i <367; i++){//甲加工的零件数
           for(int j= 1; j<367; j++){//乙点的数量
               for(int k = 1;k<367; k++){
                  //丁的数量
                  int d = 370-i-j-k;
                  if(i+j+k+d == 370 && i+10 == j-20&& j-20 == k*2 && k*2 == d/2){
                      System.out.printf("四个人的数量分别为：%-4d%-4d%-4d%-4d",i, j,k,d);
                  }
               }
           }
       }

 //求1-500之间不含数字4的自然数有多少
        int count = 0;
        for(int i =1;i<501;i++){
            int a =i%10;//个位
            int b =i/10%10; //十位
            int c= i/100;//百位
            if(a == 4||b==4||c==4){
               continue;
            }
            count++;
        }
        System.out.println("1到500之间不含4的自然数有：" + count +"个");
    }
}
