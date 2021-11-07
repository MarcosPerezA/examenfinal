/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demo2bprimero.servicios;

import gt.edu.umg.demop2bprimero.Usuarios;
import java.util.List;

/**
 *
 * @author W10
 */
public interface usuariosservice {
    
    public List<Usuarios> listausarios();
    public void guardar(Usuarios usuarios);
    public void eliminar(Usuarios usuarios);
    public Usuarios encontrarUsuario(Usuarios usuarios);
       
}
