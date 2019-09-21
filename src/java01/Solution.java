package java01;

public class Solution {
    private String bookname;
    private String authorname;
    private long ISBN;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void Solution(String Bookname, String Authorname, long ISBN) {
        this.bookname = Bookname;
        this.authorname = Authorname;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return
                ("Book Name:" + bookname + "\nAuthor Name:" + authorname + "\nISBN:" + ISBN);
    }

}

class Test {
    public static void main(String[] args) {

    }
}


