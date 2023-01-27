package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Madina",book);
        uniLibrary.getMagazine();
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
        uniLibrary.addMagazine();
//        uniLibrary.addBook();
        context.close();
    }
}
