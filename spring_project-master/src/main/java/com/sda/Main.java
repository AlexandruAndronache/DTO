package com.sda;

import com.sda.dto.StudentDTO;
import com.sda.entryPoints.EntryPoints;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentDTO studentDTO = new StudentDTO ();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyConfig.class);
        EntryPoints entryPoints = applicationContext.getBean(EntryPoints.class);
        entryPoints.execute();
        System.out.println (entryPoints.getStudentService ().getStudentById ( 3 ));

        Scanner s = new Scanner ( System.in );
        System.out.println ("Please type student's name");
        String studentName = s.nextLine ();
        System.out.println ("Student's name is: " + studentName);

        System.out.println ("Please type student's age:");
        Integer age = s.nextInt (  );
        System.out.println ("Student's age is:" + age);

        System.out.println ("Please type student's average grade:");
        Integer averageGrade = s.nextInt ();
        System.out.println ("Student's average grade is" + averageGrade);

        studentDTO.setAge ( age );
        studentDTO.setName ( studentName );
        studentDTO.setAverageGrade ( averageGrade );
        entryPoints.executeStudent (studentDTO);
    }
}
