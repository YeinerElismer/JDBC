
package Mapeadores;

import Entidades.Cliente;
import java.util.List;

/**
 *
 * @author Oliverco
 */
public interface ClienteMapeador {
    
    public Cliente SeleccionarCiudad(String Id);
    public List<Cliente> SeleccionarCliente(String Nombre);
    
    
    
}
