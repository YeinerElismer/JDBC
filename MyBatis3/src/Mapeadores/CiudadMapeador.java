
package Mapeadores;

import Entidades.Ciudad;
import java.util.List;

/**
 *
 * @author Oliverco
 */
public interface CiudadMapeador {
    
    public Ciudad SeleccionarCiudad(String Id);
    public List<Ciudad> SeleccionarCiudades(String Nombre);
    
    
    
}
