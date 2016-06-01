package Servicios;

import Entidades.Pais;
import Mapeadores.PaisMapeador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PaisServicio {
    @Autowired
    private PaisMapeador paisMapeador;
    public List<Pais> Consultar(String nombre) {
        return paisMapeador.Seleccionar(nombre);
    }
}