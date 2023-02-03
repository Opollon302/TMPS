class Main {
    public static void main(String args[])
    {
        BookPool bookPool = new BookPool(){};
        Book book=BookPool.getBook();
        book.getName().toString();
        bookPool.releaseBook(book);
    }
}