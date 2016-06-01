package Entidades;

public class Pais {
    private Integer Id;
    private String Codigo;
    private String Nombre;

    public Pais() {
    }

    public Pais(Integer Id) {
        this.Id = Id;
    }

    public Pais(Integer Id, String Codigo, String Nombre) {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
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

    @Override
    public String toString() {
        return this.Nombre;
    }
}