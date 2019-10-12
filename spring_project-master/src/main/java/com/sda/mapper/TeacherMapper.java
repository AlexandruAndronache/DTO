package com.sda.mapper;

import com.sda.dto.TeacherDTO;
import com.sda.entities.Teacher;

public class TeacherMapper {

    public TeacherDTO convertTeacherToTeacherDTO ( Teacher teacher ) {
        TeacherDTO teacherDTO = new TeacherDTO ();
        teacherDTO.setName ( teacher.getName () );
        teacherDTO.setDiscipline ( teacher.getDiscipline () );

        return teacherDTO;
    }

    public Teacher convertTeacherDTOToConvertTeacher ( TeacherDTO teacherDTO ) {
        Teacher teacher = new Teacher ();
        teacher.setName ( teacherDTO.getName () );
        teacher.setDiscipline ( teacherDTO.getDiscipline () );

        return teacher;
    }
}
