import service.WithGenerics;
import service.WithoutGenerics;

public class Main {
    public static void main(String[] args) {
        WithGenerics generics = new WithGenerics();
        generics.addBook("Last of Us","Author of Last of Us");
        generics.addVideo("Unboxing new phone", 1444);
        generics.addNewspaper("Alunelu", 4.99);

        generics.getBookList();
        generics.getVideoList();
        generics.getNewspaperList();

        System.out.println("\n");

        WithoutGenerics withoutGenerics = new WithoutGenerics();
        withoutGenerics.addBook("Dying Light","Author of Dying Light");
        withoutGenerics.addVideo("Java Lesson 43", 2560);
        withoutGenerics.addNewspaper("JDM Tunes", 12.09);

        withoutGenerics.getBookList();
        withoutGenerics.getVideoList();
        withoutGenerics.getNewspaperList();
    }
}