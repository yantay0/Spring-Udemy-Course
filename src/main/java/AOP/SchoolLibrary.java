package AOP;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary {
//    @Override
    public void getBook() {
        System.out.println("Book from School");
    }
}
