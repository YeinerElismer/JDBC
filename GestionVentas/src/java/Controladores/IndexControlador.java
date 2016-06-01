package Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControlador {
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    
    @RequestMapping(value="/bienvenida", method=RequestMethod.GET)
    public ModelAndView Saludar() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        return modelAndView;
    }    
}