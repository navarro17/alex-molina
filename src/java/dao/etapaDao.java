/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import modelos.Etapas;
import modelos.Proyecto;
/**
 *
 * @author Erick
 */
public interface etapaDao {
    
    public List<Etapas> mostrarEtapas();
    public void insertarEtapas(Etapas etapa);
    
    //Para seleccionar de una lista desplegable
    
    public List<Proyecto> ListarProyectos();
    
}
