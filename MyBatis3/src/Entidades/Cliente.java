
package Entidades;

/**
 *
 * @author Oliverco
 */
public class Cliente {
    private Integer Id;
    private String Codigo;
    private String Nombre;
    private String Tipo;
    private Ciudad oCiudad;

    public Cliente() {
    }

    public Cliente(Integer Id) {
        this.Id = Id;
    }

    public Cliente(Integer Id, String Codigo, String Nombre, String Tipo, Ciudad oCiudad) {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.oCiudad = oCiudad;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Ciudad getoCiudad() {
        return oCiudad;
    }

    public void setoCiudad(Ciudad oCiudad) {
        this.oCiudad = oCiudad;
    }

    @Override
    public String toString() {
        return this.Nombre;
    }

    
}
