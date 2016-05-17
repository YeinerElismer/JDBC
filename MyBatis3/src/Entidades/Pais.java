
package Entidades;

import java.util.List;

/**
 *
 * @author Oliverco
 */
public class Pais {
    private Integer Id;
    private Integer Codigo;
    private String Nombre;
    private List<Ciudad> lCiudad;

    public Pais() {
    }

    public Pais(Integer Id) {
        this.Id = Id;
    }

    public Pais(Integer Id, Integer Codigo, String Nombre, List<Ciudad> lCiudad) {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.lCiudad = lCiudad;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Ciudad> getlCiudad() {
        return lCiudad;
    }

    public void setlCiudad(List<Ciudad> lCiudad) {
        this.lCiudad = lCiudad;
    }

    @Override
    public String toString() {
        return this.Nombre;
    }

    
    
}
