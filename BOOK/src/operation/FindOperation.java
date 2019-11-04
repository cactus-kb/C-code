package operation;

//import book.Book;
import book.BookList;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("输入需要查找图书的名字");
        String name = scaner.next();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                System.out.println(bookList.getBooks(i));
                return;
            }
        }
        if (i > bookList.getUsedSize()) {
            System.out.println("没有此书籍");
            //return;
        }
        System.out.println("查找完毕！");
    }
}
