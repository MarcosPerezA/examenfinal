/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demo2bprimero.servicios;

import gt.edu.umg.demop2bprimero.Usuarios;
import gt.edu.umg.demop2bprimero.dao.IusuarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author W10
 */
@Service

public class usuariosserviceimplementation implements usuariosservice {
@Autowired
private IusuarioDao IusuarioDao;
    
    
    
    
    @Override
    @Transactional(readOnly=true)
    public List<Usuarios> listausarios() {
        return (List<Usuarios>) IusuarioDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuarios usuarios) {
         IusuarioDao.save(usuarios);
    }

    @Override
    @Transactional
    public void eliminar(Usuarios usuarios) {
        IusuarioDao.delete(usuarios);
    }

    @Override
    @Transactional(readOnly=true)
    public Usuarios encontrarUsuario(Usuarios usuarios) {
        
                
        
        return IusuarioDao.findById(usuarios.getID_USUARIO()).orElse(null);
        
        
        
    }
  
    
    
}
