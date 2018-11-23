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
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelos.Etapas;
/**
 *
 * @author Erick
 */
//@Named(value = "etapasBean")
@SessionScoped
@ManagedBean
public class EtapasBean implements Serializable {

    private Etapas etapa;
    List<Etapas> listetapa;
    /**
     * Creates a new instance of EtapasBean
     */
    public EtapasBean() {
        etapa = new Etapas();
    }
    
    public void insertar(){
        etapaDao eta = new etapaDaoImp();
        eta.insertarEtapas(etapa);
        etapa = new Etapas();
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
