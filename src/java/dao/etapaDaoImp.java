/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import hibernate.config.HibernateUtil;
import java.util.List;
import modelos.Etapas;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Erick
 */
public class etapaDaoImp implements etapaDao{
    public List<Etapas> mostrarEtapas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Etapas> listae = null;
        
        String hql = "From etapas";
        
        try{            
            //session = NewHibernateUtil.getSessionFactory().openSession();
            //Query query = session.createQuery(hql).list();
            //listaPry = (List<Proyecto>) query.list();
            listae = session.createQuery(hql).list();
            tx.commit();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return listae;
    }

    
    public void insertarEtapas(Etapas etapa) {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(etapa);
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
