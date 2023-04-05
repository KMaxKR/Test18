package exceptions;

public class NewspaperPriceException extends RuntimeException{
    public NewspaperPriceException(String message){
        System.out.println(message);
    }
}
