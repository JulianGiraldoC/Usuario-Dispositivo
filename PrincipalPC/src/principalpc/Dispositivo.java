/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpc;

import java.awt.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ESTUDIANTES
 *
 */
public class Dispositivo implements Serializable{ //si voy a mandar el objeto lo serializa 
    //para convertirlos en un objeto 
    //como es la llave primaria no la pongo
    @Id
    private String Serial;
    @Column (nullable = false) // columna, la info de la columna
    private String Marca;
    @Column (nullable=false)
    private String Color;
    @OneToMany (targetEntity=Computador.class)
    private List ComputadorList;
    @OneToMany (targetEntity=Impresora.class)
    private List ImpresoraList;
    @OneToMany (targetEntity=Mouse.class)
    private List MouseList;
    @OneToMany (targetEntity=Monitor.class)
    private List MonitorList;
    @OneToMany (targetEntity=Parlantes.class)
    private List ParlantesList;
     @OneToMany (targetEntity=Teclado.class)
    private List TecladoList;
    public String getSerial(){
        return (String) Serial;
    }

public Dispositivo(){
    super();
}
public void setMarca(String m){
    Marca=m;
}
public String getMarca(){
    return Marca;
}
public void setColor(String c){
    Color=c;
}
public String getColor(){
    return Color;
}
public List getComputadorList(){
        return ComputadorList;
}
public void setComputadorList(List ComputadorList){
        this.ComputadorList=ComputadorList;
}
public List getImpresoraList(){
        return ImpresoraList;
}
public void setImpresoraList(List ImpresoraList){
        this.ImpresoraList=ImpresoraList;
}
public List getMouseList(){
        return MouseList;
}
public void setMouseList(List MouseList){
        this.MouseList=MouseList;
}
public List getTecladoList(){
        return TecladoList;
}
public void setTecladoList(List TecladoList){
        this.TecladoList=TecladoList;
}
public List getParlantesList(){
        return ParlantesList;
}
public void setParlantesList(List ParlantesList){
        this.ParlantesList=ParlantesList;
}
}
