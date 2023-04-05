package library;

import exceptions.VideoNameException;
import exceptions.VideoQualityException;

public class Video {
    private String videoName;
    private int videoQuality;
    public Video(String videoName, int videoQuality){
        if(!videoName.equals("") || !videoName.equals(null)){
            this.videoName = videoName;
        }else{
            throw new VideoNameException("Video name can not by empty...");
        }

        if (videoQuality > 144){
            this.videoQuality = videoQuality;
        }else {
            throw new VideoQualityException("Video quality can not by less than 144p...");
        }
    }

    @Override
    public String toString() {
        return videoName + " " + videoQuality;
    }
}
