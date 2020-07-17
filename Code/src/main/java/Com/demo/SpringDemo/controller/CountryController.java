package Com.demo.SpringDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.demo.SpringDemo.Entity.Country;

@Controller
@RequestMapping("/details")
public class CountryController {
	
	
	@RequestMapping("/showForm")
	public String showCountry( Model mymodel)
	{
		// create a country obj
		Country mycountry = new Country();
		//add those country obj to model attribute
		mymodel.addAttribute("C_obj", mycountry);
		
		return "CountryData";
	}

	@RequestMapping("/processdata")
	public String processform(@ModelAttribute("C_obj") Country cnew)
	{
		System.out.println("Countryname:"+cnew.getCname() +"\n"+"Name:"+cnew.getFname()+" " +cnew.getLname() );
		
		
		return "CountryConfirm1";
	}
	
	
	
	
}
