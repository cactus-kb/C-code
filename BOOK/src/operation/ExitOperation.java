package operation;

import book.BookList;

public class ExitOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("程序退出");
        System.exit(0);
    }
}
