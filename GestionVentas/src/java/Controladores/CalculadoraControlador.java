package Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculadoraControlador {
    @RequestMapping(value="/calculadora", method=RequestMethod.GET)
    public ModelAndView getCalculadora() {
        ModelAndView modelAndView = new ModelAndView("calculadora");
        return modelAndView;
    }
    
    @RequestMapping(value="/calcular", method=RequestMethod.POST)
    public ModelAndView Calcular(@RequestParam(value="txtNumero1") String numero1,@RequestParam(value="txtNumero2") String numero2,@RequestParam(value="cboOperacion") String operacion) {
        Double resultado;
        
        if(operacion.equals("S")) {
            resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
        }
        else if(operacion.equals("R")) {
            resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
        }
        else if(operacion.equals("M")) {
            resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
        }
        else {
            if(Double.parseDouble(numero2) == 0.00) {
                resultado = 0.00;
            }
            else {
                resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);    
            }
        }
        
        ModelAndView modelAndView = new ModelAndView("calculadora");
        
        modelAndView.addObject("mensaje",resultado);
        
        return modelAndView;
    }    
}