package v.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import v.domain.Category;
import v.domain.Client;
import v.service.CategoryService;
import v.service.ClientService;


@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value = "/showAllCategory")
	public String getAllCategory (Model model) {
		List<Category> categories = service.getCategories();
		model.addAttribute("categories", categories);
		return "categories-all";
	}
	
	@RequestMapping(value = "/createCategory")
	public String createPage() {
		return "categories-new";
	}
	
	@RequestMapping(value = "/showAllCategory", method=RequestMethod.POST)
	public String creatingCategory(Model model, @RequestParam(value="categoryName") String categoryName) {
		
		Category category = new Category(categoryName); 
		service.insertCategory(category);		
		return "redirect:/showAllCategory";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteCategory(@RequestParam(value = "delete") String delete) {
		int id = Integer.parseInt(delete);
		service.deleteCategory(id);
		return "redirect:/showAllCategory";
	}
	
//	//tyt
//	@RequestMapping(value = "/holodylnuk")
//	public String getCategoryholodylnuk (Model model) {
//		Category categories = service.findCategorybyid(4);
//		model.addAttribute("holodylnuk", categories);
//		return "holodylnuk";
//	}
//	
	
}
