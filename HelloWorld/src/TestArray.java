public class TestArray {
    public static void main(String[] args){
        double[] myList = {1.9, 2.9, 3.9,4.9};

        for (int i= 0; i<myList.length;i++){
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for(int i=0; i <myList.length; i++){
            total +=myList[i];
        }
        System.out.println("total is" + total);

//        c查找最大的元素
        double max = myList[0];
        for(int i=1;i<myList.length;i++){
            if(myList[i]>max)
                max = myList[i];
        }
        System.out.println("max is" + max);
    }
}
