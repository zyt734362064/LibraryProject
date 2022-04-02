package book;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-03-15
 */
public class BookList {
    private Book[] books = new Book[10];

    private int uesdSize;

    public BookList(){
        books[0] = new Book("三国演义","罗贯中",17,"小说");
        books[1] = new Book("水浒传","施耐庵",27,"小说");
        books[2] = new Book("红楼梦","曹雪芹",30,"小说");
        books[3] = new Book("西游记","吴承恩",20,"小说");
        this.uesdSize = 4;
    }

    public int getUesdSize() {

        return uesdSize;
    }

    public void setUesdSize(int uesdSize) {

        this.uesdSize = uesdSize;
    }

    /**
     * 获取到pos 位置的书
     * @param pos
     * @return
     */
    public Book getPos (int pos){

        return books[pos];
    }

    /**
     * 在 pos 位置放一本书数（添加一本书）
     * @param pos
     * @param book
     */

    public void setBook (int pos,Book book) {
        this.books[pos] = book;
    }
}
