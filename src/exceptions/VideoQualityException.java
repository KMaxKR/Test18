package exceptions;

public class VideoQualityException extends RuntimeException{
    public VideoQualityException(String message){
        System.out.println(message);
    }
}
