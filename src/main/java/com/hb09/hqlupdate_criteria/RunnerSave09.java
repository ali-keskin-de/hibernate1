package com.hb09.hqlupdate_criteria;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Random;

public class RunnerSave09 {
    public static void main(String[] args) {

        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student09.class);

        SessionFactory sf=con.buildSessionFactory();
        Session session= sf.openSession();

        Transaction tx= session.beginTransaction();
        // Persist method void döner. session.persist
        //save method ise persiste edilen obejeji döner.
        //sessios.save, hql ile insert yapilamiyor
        //

        Random random=new Random();
        for (int i = 1; i <=50 ; i++) {
            Student09 student=new Student09();
            student.setName("Randeom Name"+i);
            student.setId(i);
            student.setGrade(random.nextInt(100));
            session.save(student);

        }


        tx.commit();
        session.close();
        sf.close();

    }
}
