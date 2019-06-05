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
 * @author ESTUDIANTES
 */
public class Computador implements Serializable{ //si voy a mandar el objeto lo serializa 
    //para convertirlos en un objeto 
    //como es la llave primaria no la pongo
    @Id
    private String Serial;
    @Column (nullable = false) // columna, la info de la columna
    private String Ram;
    @Column (nullable=false)
    private String SO;
    @Column (nullable=false)
    private String Disco;
    public String getSerial(){
        return (String) Serial;
    }

public Computador(){
    
}
public void setSerial(String s){
    Serial=s;
}
public void setRam(String r){
    Ram=r;
}
public String getRam(){
    return Ram;
}
public void setSO(String s){
    SO=s;
}
public String getSO(){
    return SO;
}
public void setDisco(String d){
    Disco=d;
}
public String getDisco(){
    return Disco;
}

}
