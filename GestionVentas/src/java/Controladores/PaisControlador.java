package Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaisControlador {   
    @RequestMapping(value="/listarpaises", method=RequestMethod.GET)
    public ModelAndView ListarPaises(@RequestParam(value="txtNumero1") String numero1,@RequestParam(value="txtNumero2") String numero2,@RequestParam(value="cboOperacion") String operacion) {        
        ModelAndView modelAndView = new ModelAndView("calculadora");
        
        modelAndView.addObject("mensaje",resultado);
        
        return modelAndView;
    }    
}