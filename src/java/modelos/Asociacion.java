package modelos;
// Generated 18-nov-2018 21:13:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Asociacion generated by hbm2java
 */
public class Asociacion  implements java.io.Serializable {


     private int idAsosiacion;
     private Municipio municipio;
     private String nombreAso;
     private Set<Encargado> encargados = new HashSet<Encargado>(0);

    public Asociacion() {
    }

	
    public Asociacion(int idAsosiacion) {
        this.idAsosiacion = idAsosiacion;
    }
    public Asociacion(int idAsosiacion, Municipio municipio, String nombreAso, Set<Encargado> encargados) {
       this.idAsosiacion = idAsosiacion;
       this.municipio = municipio;
       this.nombreAso = nombreAso;
       this.encargados = encargados;
    }
   
    public int getIdAsosiacion() {
        return this.idAsosiacion;
    }
    
    public void setIdAsosiacion(int idAsosiacion) {
        this.idAsosiacion = idAsosiacion;
    }
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public String getNombreAso() {
        return this.nombreAso;
    }
    
    public void setNombreAso(String nombreAso) {
        this.nombreAso = nombreAso;
    }
    public Set<Encargado> getEncargados() {
        return this.encargados;
    }
    
    public void setEncargados(Set<Encargado> encargados) {
        this.encargados = encargados;
    }




}


