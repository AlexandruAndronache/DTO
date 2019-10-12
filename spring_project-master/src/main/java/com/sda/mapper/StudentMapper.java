package com.sda.mapper;

import com.sda.dto.StudentDTO;
import com.sda.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO convertStudentToStudentDTO( Student student ){
        StudentDTO studentDTO = new StudentDTO ();
        studentDTO.setName ( student.getName () );
        studentDTO.setAge ( student.getAge () );
        studentDTO.setAverageGrade ( student.getAverage_grade () );

        return studentDTO;
    }

    public Student convertStudentDTOToConvertStudent(StudentDTO studentDTO){
        Student student = new Student ();
        student.setName ( studentDTO.getName () );
        student.setAge ( studentDTO.getAge () );
        student.setAverage_grade ( studentDTO.getAverageGrade () );

        return student;
    }
}
