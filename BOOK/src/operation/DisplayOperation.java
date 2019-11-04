package operation;

import book.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}
