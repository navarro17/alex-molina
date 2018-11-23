/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import modelos.Etapas;
/**
 *
 * @author Erick
 */
public interface etapaDao {
    
    public List<Etapas> mostrarEtapas();
    public void insertarEtapas(Etapas etapa);
    
}
