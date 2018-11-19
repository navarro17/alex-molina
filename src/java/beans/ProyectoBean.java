/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.ProyectoDAO;
import dao.ProyectoDAOImp;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelos.Proyecto;

/**
 *
 * @author RAUL
 */
@ManagedBean
@SessionScoped
public class ProyectoBean implements Serializable {
    private Proyecto proyecto;
    List<Proyecto> listPry;
    /**
     * Creates a new instance of ProyectoBean
     */
    public ProyectoBean() {
        proyecto = new Proyecto();
    }
    
    public void insertar(){
        ProyectoDAO pryDAO = new ProyectoDAOImp();
        pryDAO.insertarProyecto(proyecto);
        proyecto = new Proyecto();
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<Proyecto> getListPry() {
        ProyectoDAO pryDAO = new ProyectoDAOImp();
        listPry = pryDAO.mostrarProyectos();
        return listPry;
    }

    public void setListPry(List<Proyecto> listPry) {
        this.listPry = listPry;
    }
    
    
}
