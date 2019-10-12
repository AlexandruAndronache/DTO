package com.sda.repo;

import com.sda.dao.implementation.StudentDaoImpl;
import com.sda.dao.implementation.TeacherDaoImpl;
import com.sda.entities.Student;
import com.sda.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepo {
    private TeacherDaoImpl teacherDao;

    public TeacherDaoImpl getTeacherDao() {
        return teacherDao;
    }

    @Autowired
    public void SetTeacherDao(TeacherDaoImpl teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void createTeacher( Teacher teacher) {
        System.out.println("Am ajuns in clasa TeacherDao");
        getTeacherDao ().addTeacher (teacher);
    }
}
