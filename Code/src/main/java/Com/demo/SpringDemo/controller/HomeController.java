package Com.demo.SpringDemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Com.demo.SpringDemo.Entity.Country;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
		
	}
	@RequestMapping(value="/country")
	public String showPage()
	{
		return "countryOption";
	}
	
	@RequestMapping(value="/VisitingPlace")
	public String showPage(HttpServletResponse response) throws IOException
	{
		return "Showhome";
	}
	
	@RequestMapping("/showForm")
	public String showCountry( Model mymodel)
	{
		// create a country obj
		Country mycountry = new Country();
		//add those country obj to model attribute
		mymodel.addAttribute("C_obj", mycountry);
		
		return "CountryData";
	}
}
