package exceptions;

public class NewspaperNameException extends RuntimeException{
    public NewspaperNameException(String message){
        System.out.println(message);
    }
}
