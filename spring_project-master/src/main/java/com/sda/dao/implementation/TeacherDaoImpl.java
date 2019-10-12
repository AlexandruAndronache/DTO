package com.sda.dao.implementation;

import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class TeacherDaoImpl {
    public void addTeacher( Teacher teacher) {
        System.out.println("Am ajuns in clasa TeacherDaoImpl");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.beginTransaction();
            Integer id = (Integer) session.save(teacher);
            System.out.println("Teacher was creates with id: " + id);
            session.getTransaction().commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public Teacher displayTeacherById(Integer id) {


        return null;
    }

    public void updateTeacherById(Integer id, String discipline) {

    }

    public void deleteTeacherById(Integer id) {

    }

    public void getTeacherById(Teacher teacher) {

    }


}
