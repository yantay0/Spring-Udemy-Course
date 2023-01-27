package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testAround {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("Book is returned "+bookName);

        context.close();
        System.out.println("Method main ends");
    }

}
