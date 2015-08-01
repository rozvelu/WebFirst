package v.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import v.domain.Client;
import v.service.ClientService;

@Controller
public class ClientController {
	@Autowired
	private ClientService service;
	
	@RequestMapping(value = "/showAllClient")
	public String getAllClients(Model model) {
		List<Client> client = service.getClients();
		model.addAttribute("client", client);
		return "client-all";
	}
	
	@RequestMapping(value = "/createClient")
	public String createPage() {
		return "client-new";
	}
	
	@RequestMapping(value = "/showAllClient", method=RequestMethod.POST)
	public String creatingClient(Model model, @RequestParam(value="fname") String fname,
			@RequestParam(value="lname") String lname, @RequestParam(value="balance") String balance) {
		
		Client client= new Client(fname, lname, balance);
		service.insertClient(client);		
		return "redirect:/showAllClient";
	}
	
	@RequestMapping(value="/deleteClient",  method=RequestMethod.POST)
    public String deleteClient(@RequestParam(value="id") int id) {
		Client client= new Client();
		service.deleteClient(id);
     
        return "redirect:/showAllClient";
}
	
	}
