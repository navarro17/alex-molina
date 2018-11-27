/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import dao.etapaDao;
import dao.etapaDaoImp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import modelos.Etapas;
import modelos.Proyecto;
/**
 *
 * @author Erick
 */
@Named(value = "etapasBean")
@SessionScoped
@ManagedBean
public class EtapasBean implements Serializable {

    private Etapas etapa;
    List<Etapas> listetapa;
    private List<SelectItem> ListPro;
    /**
     * Creates a new instance of EtapasBean
     */
    public EtapasBean() {
        etapa = new Etapas();
        Proyecto p= new Proyecto();
    }
    
    public void insertar(){
        etapaDao eta = new etapaDaoImp();
        eta.insertarEtapas(etapa);
        etapa = new Etapas();
    }

    public List<SelectItem> getListPro() {
        this.ListPro = new ArrayList<SelectItem>();
        etapaDao eta =  new etapaDaoImp();
        List<Proyecto> p = eta.ListarProyectos();
        ListPro.clear();
        for(Proyecto proyecto : p){
            SelectItem proyectoItem = new SelectItem(proyecto.getIdProyecto(), proyecto.getNombrePry());
            this.ListPro.add(proyectoItem);
        }
        return ListPro;
    }

    public Etapas getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapas etapa) {
        this.etapa = etapa;
    }

    public List<Etapas> getListetapa() {
        etapaDao eta =  new etapaDaoImp();
        listetapa = eta.mostrarEtapas();
       
        return listetapa;
    }

    public void setListetapa(List<Etapas> listetapa) {
        this.listetapa = listetapa;
    }
    
}
