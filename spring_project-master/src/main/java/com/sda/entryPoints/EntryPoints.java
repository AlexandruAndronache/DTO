package com.sda.entryPoints;

import com.sda.dto.StudentDTO;
import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.service.implementation.StudentServiceImpl;
import com.sda.service.implementation.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class EntryPoints {
    private StudentServiceImpl studentService;
    private TeacherServiceImpl teacherService;

    public StudentServiceImpl getStudentService () {
        return studentService;
    }

    @Autowired
    public void setStudentService ( StudentServiceImpl studentService ) {
        this.studentService = studentService;
    }

    public TeacherServiceImpl getTeacherService () {
        return teacherService;
    }

    @Autowired
    public void setTeacherService ( TeacherServiceImpl teacherService ) {
        this.teacherService = teacherService;
    }

    public void execute () {
        System.out.println ( "Am ajuns in clasa EntryPoints" );
        StudentDTO studentDTO = new StudentDTO ();
        studentDTO.setName ( "Marin Preda" );
        studentDTO.setAge ( 25 );
        studentDTO.setAverageGrade ( 8 );
        getStudentService ().addStudent (studentDTO  );

        Teacher teacher = new Teacher ();
        teacher.setName ( "Teacher Test" );
        teacher.setAge ( 26 );
        teacher.setDiscipline ( "Accounting" );
        getTeacherService ().addTeacher ( teacher );

    }

    public void executeStudent( StudentDTO studentDTO ){
        getStudentService ().addStudent ( studentDTO );



    }


}
