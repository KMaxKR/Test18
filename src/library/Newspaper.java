package library;

import exceptions.NewspaperNameException;
import exceptions.NewspaperPriceException;

public class Newspaper {
    private String newspaperName;
    private double newspaperPrice;
    public Newspaper(String newspaperName, double newspaperPrice){
        if (!newspaperName.equals("") || !newspaperName.equals(null)){
            this.newspaperName = newspaperName;
        }else{
            throw new NewspaperNameException("Newspaper name can not be empty...");
        }

        if(newspaperPrice > 0){
            this.newspaperPrice = newspaperPrice;
        }else{
            throw new NewspaperPriceException("Newspaper price can not be less than 0$...");
        }
    }

    @Override
    public String toString() {
        return  newspaperName +  " " + newspaperPrice;
    }
}
