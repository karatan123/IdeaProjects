/**
 * 图书的业务类 封装了对图书数组的增删改查
 */

public class BookService {
    /**
     * 销售书籍
     * @param book 要销售的图书对象
     * @return 如果销售成功 返回销售的数量，销售失败，返回-1
     */
    public int sellBook(Book book){
//判断图书的库存是否大于1
        //图书库存减去1
        //返回销售的数量
        if(!(book.getCount()>1)){
            return -1;
        }
        book.setCount(book.getCount()-1);
        return 1;

    }

}
