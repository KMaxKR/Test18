package library;

import exceptions.AuthorException;
import exceptions.BookNameException;

public class Book {
    private String bookName;
    private String author;
    public Book(String bookName, String author){
        if(!bookName.equals("") || !bookName.equals(null)){
            this.bookName = bookName;
        }else{
            throw new BookNameException("Book name can not by empty...");
        }

        if (!author.equals("") || !!author.equals(null)){
            this.author = author;
        }else {
            throw new AuthorException("Author spaces can not by empty...");
        }
    }

    @Override
    public String toString() {
        return bookName + " " + author;
    }
}
