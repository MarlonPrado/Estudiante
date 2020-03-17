import java.util.*;
public class Carrera{
    private String codigo;
    private String nombre;
    private Integer numsem;
    private Integer numcreditos;
    private String titulo;
    private String director;
    private Date fechaini;

//Constructor inicializado
public Carrera(){
    this.codigo=codigo;
    this.nombre=nombre;
    this.numsem=numsem;
    this.numcreditos=numcreditos;
    this.titulo=titulo;
    this.fechaini=fechaini;
}
    /**Metodo de acceso a la propiedad codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**Metodo de modificación a la propiedad codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad numsem*/
    public Integer getNumsem(){
        return this.numsem;
    }//end method getNumsem

    /**Metodo de modificación a la propiedad numsem*/
    public void setNumsem(Integer numsem){
        this.numsem = numsem;
    }//end method setNumsem

    /**Metodo de acceso a la propiedad numcreditos*/
    public Integer getNumcreditos(){
        return this.numcreditos;
    }//end method getNumcreditos

    /**Metodo de modificación a la propiedad numcreditos*/
    public void setNumcreditos(Integer numcreditos){
        this.numcreditos = numcreditos;
    }//end method setNumcreditos

    /**Metodo de acceso a la propiedad titulo*/
    public String getTitulo(){
        return this.titulo;
    }//end method getTitulo

    /**Metodo de modificación a la propiedad titulo*/
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }//end method setTitulo

    /**Metodo de acceso a la propiedad director*/
    public String getDirector(){
        return this.director;
    }//end method getDirector

    /**Metodo de modificación a la propiedad director*/
    public void setDirector(String director){
        this.director = director;
    }//end method setDirector

    /**Metodo de acceso a la propiedad fechaini*/
    public Date getFechaini(){
        return this.fechaini;
    }//end method getFechaini

    /**Metodo de modificación a la propiedad fechaini*/
    public void setFechaini(Date fechaini){
        this.fechaini = fechaini;
    }//end method setFechaini

}