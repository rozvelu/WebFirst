package v.controller;

import java.util.List;

import v.domain.Client;
import v.domain.Orders;
import v.service.ClientService;
import v.service.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OrdersController {
@Autowired
private OrdersService service;

@RequestMapping(value = "/showAllOrders")
public String getAllOrders(Model model) {
	
	List<Orders> orders = service.getAllOrders();
	model.addAttribute("orders", orders);
	return "orders-all";
}

@RequestMapping(value = "/createOrders")
public String createPage() {
	return "orders-new";
}

@RequestMapping(value = "/showAllOrders", method=RequestMethod.POST)
public String creatingOrders(Model model, @RequestParam(value="timeorders") String timeorders, @RequestParam(value="shipAdress") String shipAdress, @RequestParam(value="price") String price) {
	int priceInt = Integer.parseInt(price);
	Orders orders = new Orders(timeorders, shipAdress, priceInt);
	service.insertOrders(orders);
		return "redirect:/showAllOrders";
}

@RequestMapping(value = "/deleteOrders", method = RequestMethod.POST)
public String deleteCategory(@RequestParam(value = "delete") String delete) {
	int id = Integer.parseInt(delete);
	service.deleteOrders(id);
	return "redirect:/showAllCategory";
}

}



