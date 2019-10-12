package com.sda.service.implementation;

import com.sda.dao.implementation.StudentDaoImpl;
import com.sda.dto.StudentDTO;
import com.sda.entities.Student;
import com.sda.mapper.StudentMapper;
import com.sda.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {

    public StudentDaoImpl getStudentDao () {
        return studentDao;
    }
    @Autowired
    public void setStudentDao ( StudentDaoImpl studentDao ) {
        this.studentDao = studentDao;
    }

    private StudentDaoImpl studentDao;

    @Autowired
    StudentMapper studentMapper;

    private StudentRepo studentRepo;

    public void addStudent( StudentDTO studentDTO){

        System.out.println("Am ajuns in clasa StudentServiceImpl");
        Student student = studentMapper.convertStudentDTOToConvertStudent ( studentDTO );
        getStudentRepo().createStudent(student);

    }

    public Student getStudentById(Integer id){
        return studentDao.displayStudentById ( id );

    }

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
}
