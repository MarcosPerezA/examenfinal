/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bprimero;

import gt.edu.umg.demo2bprimero.servicios.usuariosservice;
import gt.edu.umg.demop2bprimero.dao.IdeptoDao;
import gt.edu.umg.demop2bprimero.dao.IprofesionDao;
import gt.edu.umg.demop2bprimero.dao.IusuarioDao;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author henryflores
 */
@Controller
public class ControladorInicio {
    @Autowired
    //private usuariosservice usuariosservice;
     private IusuarioDao IusuarioDao;
    
    @GetMapping("/usuario")
    public String mostrar(Model model){
        //var usuarios = usuariosservice.listausarios();
         var usuarios = IusuarioDao.findAll();
         
         model.addAttribute("usuarios", usuarios);
         
       
        return "index";
    }
    @GetMapping("/")
    public String inicio(Model model){
        //var usuarios = usuariosservice.listausarios();
        
        return "pagprincipal";
    }
    @GetMapping("/op")
    public String deci(Model model){
        //var usuarios = usuariosservice.listausarios();
        
        return "op";
    }
    
//    private usuariosservice usuariosservice;
    @GetMapping("/agregar")
     
    public String agregar(Usuarios usuarios){
        
       return "agregar";
       }
        
        @PostMapping("/guardar")
        public String guardar(Usuarios usuarios){
//        usuariosservice.guardar(usuarios);
        var usuario = IusuarioDao.save(usuarios);
        return "redirect:/usuario";
    
    
}
        
    @GetMapping("/editar/{ID_USUARIO}") 
    
    public String editar(Usuarios usuarios,Model modelo){
        
         usuarios = IusuarioDao.findById(usuarios.getID_USUARIO()).orElse(null);
        
        modelo.addAttribute("Usuarios", usuarios);
        return "agregar";
        
    }
    @GetMapping("/eliminar/{ID_USUARIO}") 
    
    public String eliminar(Usuarios usuarios,Model modelo){
        
          IusuarioDao.delete(usuarios);
        
       
       return "redirect:/usuario";
    }
    
    
    
    @Autowired
    private IprofesionDao IprofesionDao;
    @GetMapping("/profesion")
    
    
    
    public String mostrarProf(Model model){
//        var profesion = IprofesionDao.findAll();
        
        
        model.addAttribute("profesion",IprofesionDao.findAll());
        
        
        return"profesion";
        
    }
    
   @GetMapping("/agregarpro")
     
    public String agregarpro(Profesion profesion){
        
       return "agregarProfesion";
       }
        
        @PostMapping("/guardarpro")
        public String guardarpro(Profesion profesion){

        var prof = IprofesionDao.save(profesion);
        return "redirect:/profesion";
    
    
}
        
        
        @GetMapping("/editarpro/{ID_PROFESION}") 
    
    public String editarpro(Profesion profesion,Model modelo){
        
         
        profesion= IprofesionDao.findById(profesion.getID_PROFESION()).orElse(null);
        modelo.addAttribute("Profesion", profesion);
        return "agregarprofesion";
        
    }
    @GetMapping("/eliminarpro/{ID_PROFESION}") 
    
    public String eliminarpro(Profesion profesion,Model modelo){
        
         
        IprofesionDao.delete(profesion);
       
       return "redirect:/profesion";
    }
     @Autowired
    private IdeptoDao IdeptoDao;
     @GetMapping("/departamento")
    
    public String mostrardepto(Model model){
        var departamento = IdeptoDao.findAll();
        
        
        model.addAttribute("departamento",departamento);
        
        
        return"departamento";
        
    }
    
    
    @GetMapping("/agregardep")
     
    public String agregardep(Departamento departamento){
        
       return "agregarDep";
       }
        
        @PostMapping("/guardardep")
        public String guardardep(Departamento departamento){

        var depto = IdeptoDao.save(departamento);
        
        return "redirect:/departamento";
    
    
}
        
         @GetMapping("/editardep/{ID_DEPTO}") 
    
    public String editardep(Departamento departamento,Model modelo){
        
         
        departamento= IdeptoDao.findById(departamento.getID_DEPTO()).orElse(null);
        modelo.addAttribute("Departamento", departamento);
        return "agregardep";
        
    }
    @GetMapping("/eliminardep/{ID_DEPTO}") 
    
    public String eliminardep(Departamento departamento,Model modelo){
        
         
        IdeptoDao.delete(departamento);
       
       return "redirect:/departamento";
    }

}
     
     