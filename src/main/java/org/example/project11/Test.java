package org.example.project11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        universityLibrary.getBook();
        universityLibrary.returnBook();
//        universityLibrary.getMagazine();

//        System.out.println("----------------");
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
//
//        context.close();
    }
}
