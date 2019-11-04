package operation;

import book.Book;
import book.BookList;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //输入需要借阅书籍的名称
        System.out.println("输入需要借阅书籍的名称");
        String name = scaner.nextLine();
        int i = 0;
        //根据书籍的名称查找书籍是否存在
        for (; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                break;
            }
        }
        //拿到书籍的对象，将书籍对象的isBorrowed = true
        if (i >= bookList.getUsedSize()) {
            System.out.println("没有找到此书");
            return;
        }
        //i为此时借阅书籍的下标
        Book book = bookList.getBooks(i);
        if (book.isBorrowed()) {
            System.out.println("此书已经被借出");
        } else {
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }

    }
}
