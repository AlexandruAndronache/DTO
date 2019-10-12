package com.sda.dao.implementation;

import com.sda.entities.Student;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDaoImpl {
    public void addStudent ( Student student ) {
        System.out.println ( "Am ajuns in clasa StudentDaoImpl" );
        try (Session session = HibernateUtils.getSessionFactory ().openSession ()) {
            session.beginTransaction ();
            Integer id = (Integer) session.save ( student );
            System.out.println ( "Student was creates with id: " + id );
            session.getTransaction ().commit ();
        } catch (HibernateException e) {
            e.printStackTrace ();
        }
    }

    public Student displayStudentById ( Integer id ) {
        System.out.println ( "Am ajuns in clasa StudentDaoImpl, metoda displayStudentById" );
        List<Student> studentList = new ArrayList<> ();
        Student student = null;
        try (Session session = HibernateUtils.getSessionFactory ().openSession ()) {
            session.beginTransaction ();
             student = session.get ( Student.class,id );
//
//            String sqlSelect = "SELECT FROM Student where id = :id";
//            studentList = (List<Student>) session.createQuery ( sqlSelect ).setParameter ( "id" , id );
//            System.out.println ( "Student was creates with id: " + id );
            session.getTransaction ().commit ();

        } catch (HibernateException e) {
            e.printStackTrace ();
        }
//            if (studentList.size () < 1){
//                return null;
//            }

        return student;

    }

    public void updateStudentById ( Integer id , Integer average_grade ) {

    }

    public void deleteStudentById ( Integer id ) {

    }

    public void getStudentById ( Student student ) {

    }
}
