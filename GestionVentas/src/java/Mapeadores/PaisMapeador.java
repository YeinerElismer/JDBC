package Mapeadores;

import Entidades.Pais;
import java.util.List;

public interface PaisMapeador {
    public List<Pais> Seleccionar(String nombre);
}