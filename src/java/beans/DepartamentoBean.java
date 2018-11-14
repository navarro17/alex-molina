/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.DepartamentoDao;
import dao.DepartamentoDAOImp;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import modelos.Departamento;

/**
 *
 * @author famil
 */
@Named(value = "departamentoBean")
@ManagedBean
@ViewScoped
public class DepartamentoBean {

    /**
     * Creates a new instance of DepartamentoBean
     */
    private List<Departamento> listar;
    private Departamento departamento;

    public DepartamentoBean() {
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Departamento> getListar() {
        DepartamentoDao dep = new DepartamentoDAOImp();
        listar = dep.mostrarDepartamentos();
        return listar;
    }

    public void nuevoDepartamento() {
        DepartamentoDao dep = new DepartamentoDAOImp();
        dep.nuevoDepartamento(departamento);
        departamento = new Departamento();
    }

    public void modificarDepartamento() {
        DepartamentoDao dep = new DepartamentoDAOImp();
        dep.modificarDepartamento(departamento);
        departamento = new Departamento();
    }
    
    public void eliminarDepartamento() {
        DepartamentoDao dep = new DepartamentoDAOImp();
        dep.eliminarDepartamento(departamento);
        departamento = new Departamento();
    }
    
    //Botón Cancelar
    public void cancelar() {
        departamento = new Departamento();
    }
    
    //Si el objeto devuelve Null
    @PostConstruct
    public void init() {
        departamento = new Departamento();
    }

}
