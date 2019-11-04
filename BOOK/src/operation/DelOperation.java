package operation;

import book.Book;
import book.BookList;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //输入删除图书的名字
        System.out.println("输入删除图书的名字");
        String name = scaner.next();
        //根据书籍名称查看书籍是否存在
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getUsedSize()) {
            System.out.println("没有删除的书籍");
            return;
        }
        //删除i = i + 1，将i + 1下标的对象赋值给i下标
        for (int j = i; j < bookList.getUsedSize() - 1; j++) {
            Book book = bookList.getBooks(j + 1);
            bookList.setBook(j, book);
        }
        bookList.setUsedSize(bookList.getUsedSize() - 1);
    }
}
