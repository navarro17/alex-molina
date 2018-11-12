/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.config.HibernateUtil;
import java.util.List;
import modelos.Departamento;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author famil
 */
public class DepartamentoDAOImp implements DepartamentoDao {
    //CONSULTAR
    @Override
    public List<Departamento> mostrarDepartamentos() {

        List<Departamento> departamentos = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "FROM Departamento";

        try {
            departamentos = session.createQuery(hql).list();
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return departamentos;
    }
    
    //CREAR
    @Override
    public void nuevoDepartamento(Departamento departamento) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(departamento);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
