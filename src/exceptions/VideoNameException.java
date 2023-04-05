package exceptions;

public class VideoNameException extends RuntimeException{
    public VideoNameException(String message){
        System.out.println(message);
    }
}
