/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bprimero.dao;


import gt.edu.umg.demop2bprimero.Departamento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author W10
 */
public interface IdeptoDao extends CrudRepository<Departamento,Integer> {
    
}
