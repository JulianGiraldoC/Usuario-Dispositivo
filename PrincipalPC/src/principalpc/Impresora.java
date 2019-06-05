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
public class Impresora implements Serializable{ //si voy a mandar el objeto lo serializa 
    //para convertirlos en un objeto 
    //como es la llave primaria no la pongo
    @Id
    private String Serial;
    @Column (nullable = false) // columna, la info de la columna
    private String Modelo;
    @Column (nullable=false)
    private String Color;
    @Column (nullable=false)
    private String Idioma;
    @Column (nullable=false)
    private String Tipo;
    @Column (nullable=false)
    private String Marca;
    public String getSerial(){
        return (String) Serial;
    }

   public Impresora(){
    
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
public void setIdioma(String i){
    Idioma=i;
}
public String getIdioma(String i){
    return Idioma;
}
public void setTipo(String t){
    Tipo=t;
}
public String getTipo(){
    return Tipo;
}
public void setMarca(String m){
    Marca=m;
}
public String getMarca(){
    return Marca;
}

}
