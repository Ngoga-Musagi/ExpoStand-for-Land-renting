/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.ExpoStands;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class ExpoStandDao {
    public void Save(ExpoStands ex){
    Session session =NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(ex);
    session.getTransaction().commit();
    session.close();
    }
    
    public List<ExpoStands> getExpos(){
     Session session =NewHibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     List<ExpoStands> l = new ArrayList<>();
        Query q= session.createQuery("from ExpoStands");
        l=q.list();
        session.close();
        return l;
    }
}
