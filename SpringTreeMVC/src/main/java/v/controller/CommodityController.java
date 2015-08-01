package v.controller;

import java.util.List;

import javax.management.modelmbean.ModelMBeanOperationInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import v.domain.Category;
import v.domain.Commodity;
import v.service.CommodityServce;

@Controller
public class CommodityController {

	@Autowired
	CommodityServce service;
// тут метод get
	@RequestMapping(value = "/showAllCommodity") 
	public String showAll(Model model) {
		List<Commodity> commodity = service.getCommoditys();
		model.addAttribute("commodity", commodity);
		return "commodity-all";
	}

	@RequestMapping(value = "/createCommodity")
	public String create() {
		return "commodity-new";
	}

	@RequestMapping(value = "/showAllCommodity", method = RequestMethod.POST)
	public String createCommodity(@RequestParam(value = "maker") String maker, @RequestParam(value = "title") String title,
			@RequestParam(value = "price") String price, @RequestParam(value = "description") String description) {
		int priceInt = Integer.parseInt(price);
		Commodity commoditys = new Commodity(maker, title, priceInt, description);
		service.insertCommodity(commoditys);
		return "redirect:/showAllCommodity";
	}
	
	@RequestMapping(value = "/deleteCommodity", method = RequestMethod.POST)
	public String deleteCategory(@RequestParam(value = "delete") String delete) {
		int id = Integer.parseInt(delete);
		service.deleteCommodity(id);
		return "redirect:/showAllCategory";
	}
	
	
	
		 
		 
		 
			 
		
			
		
	}

