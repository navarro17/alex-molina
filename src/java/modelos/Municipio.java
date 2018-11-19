package modelos;
// Generated 18-nov-2018 21:13:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Municipio generated by hbm2java
 */
public class Municipio  implements java.io.Serializable {


     private int idMunicipio;
     private Departamento departamento;
     private String nombreMun;
     private Set<Asociacion> asociacions = new HashSet<Asociacion>(0);
     private Set<Encargado> encargados = new HashSet<Encargado>(0);

    public Municipio() {
    }

	
    public Municipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    public Municipio(int idMunicipio, Departamento departamento, String nombreMun, Set<Asociacion> asociacions, Set<Encargado> encargados) {
       this.idMunicipio = idMunicipio;
       this.departamento = departamento;
       this.nombreMun = nombreMun;
       this.asociacions = asociacions;
       this.encargados = encargados;
    }
   
    public int getIdMunicipio() {
        return this.idMunicipio;
    }
    
    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNombreMun() {
        return this.nombreMun;
    }
    
    public void setNombreMun(String nombreMun) {
        this.nombreMun = nombreMun;
    }
    public Set<Asociacion> getAsociacions() {
        return this.asociacions;
    }
    
    public void setAsociacions(Set<Asociacion> asociacions) {
        this.asociacions = asociacions;
    }
    public Set<Encargado> getEncargados() {
        return this.encargados;
    }
    
    public void setEncargados(Set<Encargado> encargados) {
        this.encargados = encargados;
    }




}


