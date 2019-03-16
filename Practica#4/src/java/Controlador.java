/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class Controlador {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView usuario() {
      return new ModelAndView("user", "command", new User());
   }
   
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addUser(@ModelAttribute("SpringWeb")User user, 
   ModelMap model) {
      model.addAttribute("correo", user.getCorreo_electronico());
      model.addAttribute("password", user.getPassword());
      model.addAttribute("nombre", user.getNombre_user());
      model.addAttribute("fecha_nacimiento", user.getFecha_nacimiento());
      
      return "Mostrar";
        }
}
