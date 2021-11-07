/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bprimero;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author henryflores
 */
@Data
@Entity
@Table(name="tb_usuarios")

public class Usuarios implements Serializable  {
   private static final long serialVersionUI=1L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int  ID_USUARIO;
    
    @NotNull
    private int ID_DEPTO;
    
    @NotNull
    private int ID_PROFESION;
   
    @NotEmpty
    private String NOMBRE;
    
    @NotEmpty
    private String APELLIDO;
    
    @NotEmpty
    private String CORREO_ELECTRONICO;
    
    @NotEmpty
    private String TELEFONO;
    
    @NotEmpty
    private String FECHA_NACIMIENTO;
    
    @NotNull
    @Digits(integer = 2, fraction = 6)
    private Double LONGITUD;
    
    @NotNull
    @Digits(integer = 2, fraction = 6)
    private Double LATITUD;
    
    private Timestamp FECHA_REGISTRO;

   
    
    
    
}
