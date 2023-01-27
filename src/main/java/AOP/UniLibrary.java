package AOP;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary {
    public void getBook(){
        System.out.println("Book from Uni");
        System.out.println("--------------------------------------");
    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("Book is returned");
        return "Война и Мир";
//        System.out.println("--------------------------------------");
    }
    public void getMagazine(){
        System.out.println("Magazine from Uni");
        System.out.println("--------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("Magazine is returned");
        System.out.println("--------------------------------------");
    }
    public void addBook(String personName, Book book){
        System.out.println("Adding new Book");
        System.out.println("--------------------------------------");
    }
    public void addMagazine(){
        System.out.println("Adding new Magazine");
        System.out.println("--------------------------------------");
    }
}
