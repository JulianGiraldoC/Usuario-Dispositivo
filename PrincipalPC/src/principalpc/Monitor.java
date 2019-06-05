/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author Jusot
 */
public class Monitor implements Serializable{ //si voy a mandar el objeto lo serializa 
    //para convertirlos en un objeto 
    //como es la llave primaria no la pongo
    @Id
    private String Serial;
    @Column (nullable = false) // columna, la info de la columna
    private String Modelo;
    @Column (nullable=false)
    private String Color;
    @Column (nullable=false)
    private String Marca;
    @Column (nullable=false)
    private String Resolucion;
    public String getSerial(){
        return (String) Serial;
    }

   public Monitor(){
    
}
public void setModelo(String m){
    Modelo=m;
}
public String getModelo(){
    return Modelo;
}
public void setColor(String c){
    Color=c;
}
public String getColor(){
    return Color;
}
public void setMarca(String m){
    Marca=m;
}
public String getMarca(){
    return Marca;
} 
public void setResolucion(String r){
    Resolucion=r;
}
public String getResolucion(){
    return Resolucion;
}
   
}
