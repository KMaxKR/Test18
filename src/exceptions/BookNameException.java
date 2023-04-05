package exceptions;

public class BookNameException extends RuntimeException{
    public BookNameException(String message){
        System.out.println(message);
    }
}
