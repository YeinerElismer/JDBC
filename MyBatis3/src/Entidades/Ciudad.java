
package Entidades;

/**
 *
 * @author Oliverco
 */
public class Ciudad {
    private Integer Id;
    private String Codigo;
    private String Nombre;
    private String Ubicacion;

    

    public Ciudad() {
    }

    public Ciudad(Integer Id) {
        this.Id = Id;
    }
    
    public Ciudad(Integer Id, String Codigo, String Nombre, String Ubicacion) {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
    }
    

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
     
    
    @Override
    public String toString(){
        return this.Nombre;
    }
    
}
