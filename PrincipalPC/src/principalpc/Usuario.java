/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpc;

import static com.oracle.webservices.internal.api.databinding.DatabindingModeFeature.ID;
import java.awt.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ESTUDIANTES
 */
@Entity //la clase usuario es una entidad para jpa
@Table (name="Usuario") //nombre que tendrá en la base de datos
public class Usuario implements Serializable{ //si voy a mandar el objeto lo serializa 
    //para convertirlos en un objeto 
    //como es la llave primaria no la pongo
    @Id
    private long ID;
    @Column (nullable = false) // columna, la info de la columna
    private String Nombre;
    @Column (nullable=false)
    private String Apellido;
    @OneToOne 
    private Dispositivo dispositivo;
    
    public int getId(){
        return (int) ID;
    }


/*public class Usuario extends Dispositivo {
    private String ID;
    private String Nombre;
    private String Computador;
    private int Cantidad;
    private String Apellido;
  */  
    public Usuario(){
        
    }
    
    public void setID(long i){
        ID=i;
    }
    public long getID(){
        return ID;
    }
    public void setNombre(String n){
        Nombre=n;
    }
    public String getNombre(){
        return Nombre;
    }
    public Dispositivo getDispositivo(){
        return dispositivo;
    }
    public void setDispositivo(Dispositivo dispositivo){
        this.dispositivo=dispositivo;
    }
    
}
