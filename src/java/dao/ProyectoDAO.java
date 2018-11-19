/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelos.Proyecto;

/**
 *
 * @author RAUL
 */
public interface ProyectoDAO {
    public List<Proyecto> mostrarProyectos();

    public void insertarProyecto(Proyecto proyecto);
    //public void modificarProyecto(Proyecto proyecto);
    //public void eliminarProyecto(Proyecto proyecto);

}
