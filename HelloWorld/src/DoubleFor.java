
public class DoubleFor {
    public static void main(String[] args){
        //行 列  双循环\

        //外层循环控制行数、控制换行
        for(int i = 0;i < 4; i++){
            //内层循环控制列，控制列数、控制列打印符号
            for(int j = 0; j <=2-i; j++){
                System.out.print(" " +
                        "");//只打印#
            }
            for(int j =0;j <=2*i;j++){
                System.out.print("*");
            }
            System.out.println();//由外层循环控制换行
        }

        for(int i = 0;i < 3; i++){
            //内层循环控制列，控制列数、控制列打印符号
            for(int j = 0; j <=i; j++){
                System.out.print(" ");//只打印#
            }
            for(int j =0;j <= 4-2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i=0;i< 5; i++){  //外层循环 控制行数
//            for(int j=0;j < 5;j++){
//                System.out.print("*");
//               // if (j==4){
//                 //   System.out.println();
//               // }
//            }
//            System.out.println();
//
//        }


        char ch = 'A';
        //外层循环控制行数、控制换行
        for(int i = 0;i < 4; i++){
            //内层循环控制列，控制列数、控制列打印符号
            for(int j = 0; j <=2-i; j++){
                System.out.print(" ");//只打印#
            }
            for(int j =0;j <=2*i;j++){
                System.out.print(ch);
            }
            System.out.println();//由外层循环控制换行
            ch++;
        }

        for(int i = 0;i < 3; i++){
            //内层循环控制列，控制列数、控制列打印符号
            for(int j = 0; j <=i; j++){
                System.out.print(" ");//只打印#
            }
            for(int j =0;j <= 4-2*i; j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }


        //外层循环控制行数、控制换行
        for(int i = 0;i < 4; i++){
            //内层循环控制列，控制列数、控制列打印符号
            for(int j = 0; j <=2-i; j++){
                System.out.print(" ");//只打印#
            }
            for(int j =0;j <=2*i;j++){
                if(j==0 || j==2*i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();//由外层循环控制换行
        }

        for(int i = 0;i < 3; i++){
            //内层循环控制列，控制列数、控制列打印符号
            for(int j = 0; j <=i; j++){
                System.out.print(" ");//只打印#
            }
            for(int j =0;j <= 4-2*i; j++){
                if (j==0 || j==4-2*i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        for(int i =0;i <= 8;i ++) {
            for (int j = 0; j <= 7 - i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                    System.out.print((int)Math.pow(2,j) + "    ");
            }
            for (int j = i-1;j>=0;j--){
                System.out.print((int)Math.pow(2,j) + "    ");

            }

            System.out.println();
        }
    }
}
