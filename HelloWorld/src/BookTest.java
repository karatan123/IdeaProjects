public class BookTest {
    public static void main(String[] args){
//        Book book = new Book("老九军醉酒谈java","123-123",98.8,6);
//        BookService bookService = new BookService();
//        bookService.sellBook(book);
//        System.out.println(book.getCount());

//传地址才为应用传递

//        int[] nums = {1,2};
//        Swap(nums[0],nums[1]);
//        System.out.println(nums[0] + "\t"+nums[1]);

        //引用传递
        Demo demo = new Demo();
        Swap(demo);
        System.out.println(demo.attr1 + "\t" + demo.attr2);


    }

//    public  static void Swap(int num1,int num2){
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//    }

    static class Demo{
        int attr1 = 10;
        int attr2 = 50;
    }
    public static void Swap(Demo demo){
       // demo = new Demo();
        int temp = demo.attr1;
        demo.attr1 = demo.attr2;
        demo.attr2 = temp;
    }
}
