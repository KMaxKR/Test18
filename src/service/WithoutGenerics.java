package service;

import exceptions.*;
import library.*;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
    private List bookList = new ArrayList<>();
    private List videoList = new ArrayList<>();
    private List newspaperList = new ArrayList<>();

    public List addBook(String bookName, String bookAuthor){
        try {
            bookList.add(new Book(bookName, bookAuthor));
        }catch (BookNameException e){
            System.out.println(e.getMessage());
        }catch (AuthorException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return bookList;
    }
    public List addVideo(String videoName, int videoQuality){
        try {
            videoList.add(new Video(videoName, videoQuality));
        }catch (VideoNameException e){
            System.out.println(e.getMessage());
        }catch (VideoQualityException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return videoList;
    }
    public List addNewspaper(String newspaperName, double newspaperPrice){
        try {
            newspaperList.add(new Newspaper(newspaperName, newspaperPrice));
        }catch (NewspaperNameException e){
            System.out.println(e.getMessage());
        }catch (NewspaperPriceException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return newspaperList;
    }

    public void getBookList(){
        System.out.println(bookList);;
    }
    public void getVideoList(){
        System.out.println(videoList);
    }
    public void getNewspaperList(){
        System.out.println(newspaperList);
    }
}
