package exceptions;

public class AuthorException extends RuntimeException{
    public AuthorException(String message){
        System.out.println(message);
    }
}
