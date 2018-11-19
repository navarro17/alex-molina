/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.config.HibernateUtil;
import java.util.List;
import modelos.Proyecto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RAUL
 */
public class ProyectoDAOImp implements ProyectoDAO{

    @Override
    public List<Proyecto> mostrarProyectos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Proyecto> listaPry = null;
        
        String hql = "From Proyecto";
        
        try{            
            //session = NewHibernateUtil.getSessionFactory().openSession();
            //Query query = session.createQuery(hql).list();
            //listaPry = (List<Proyecto>) query.list();
            listaPry = session.createQuery(hql).list();
            tx.commit();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return listaPry;
    }

    @Override
    public void insertarProyecto(Proyecto proyecto) {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(proyecto);
            session.getTransaction().commit();
        }catch(Exception e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
    
}
