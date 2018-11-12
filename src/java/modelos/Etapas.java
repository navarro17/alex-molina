package modelos;
// Generated 11-nov-2018 17:52:52 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Etapas generated by hbm2java
 */
public class Etapas  implements java.io.Serializable {


     private int idEtapa;
     private Proyecto proyecto;
     private String nombreEtap;
     private String descripcionEtap;
     private Long presupuesto;
     private Date fechaInicioEt;
     private Date fechaFinEt;
     private Set<Actividades> actividadeses = new HashSet<Actividades>(0);

    public Etapas() {
    }

	
    public Etapas(int idEtapa) {
        this.idEtapa = idEtapa;
    }
    public Etapas(int idEtapa, Proyecto proyecto, String nombreEtap, String descripcionEtap, Long presupuesto, Date fechaInicioEt, Date fechaFinEt, Set<Actividades> actividadeses) {
       this.idEtapa = idEtapa;
       this.proyecto = proyecto;
       this.nombreEtap = nombreEtap;
       this.descripcionEtap = descripcionEtap;
       this.presupuesto = presupuesto;
       this.fechaInicioEt = fechaInicioEt;
       this.fechaFinEt = fechaFinEt;
       this.actividadeses = actividadeses;
    }
   
    public int getIdEtapa() {
        return this.idEtapa;
    }
    
    public void setIdEtapa(int idEtapa) {
        this.idEtapa = idEtapa;
    }
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    public String getNombreEtap() {
        return this.nombreEtap;
    }
    
    public void setNombreEtap(String nombreEtap) {
        this.nombreEtap = nombreEtap;
    }
    public String getDescripcionEtap() {
        return this.descripcionEtap;
    }
    
    public void setDescripcionEtap(String descripcionEtap) {
        this.descripcionEtap = descripcionEtap;
    }
    public Long getPresupuesto() {
        return this.presupuesto;
    }
    
    public void setPresupuesto(Long presupuesto) {
        this.presupuesto = presupuesto;
    }
    public Date getFechaInicioEt() {
        return this.fechaInicioEt;
    }
    
    public void setFechaInicioEt(Date fechaInicioEt) {
        this.fechaInicioEt = fechaInicioEt;
    }
    public Date getFechaFinEt() {
        return this.fechaFinEt;
    }
    
    public void setFechaFinEt(Date fechaFinEt) {
        this.fechaFinEt = fechaFinEt;
    }
    public Set<Actividades> getActividadeses() {
        return this.actividadeses;
    }
    
    public void setActividadeses(Set<Actividades> actividadeses) {
        this.actividadeses = actividadeses;
    }




}


