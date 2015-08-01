package v.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import v.dao.ClientDao;
import v.dao.OrdersDao;
import v.domain.Client;
import v.domain.Commodity;
import v.domain.Orders;
import v.service.ClientService;

@Service("clientService")
public class ClientServiceImpl implements ClientService{
	@Autowired
	private ClientDao dao;

	

	public Client findClient(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	

	public void insertClient(Client cl) {
		// TODO Auto-generated method stub
		dao.insert(cl);
		
	}

	

	public void deleteClient(int id) {
		dao.delete(id);
		
	}

	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}



	
	}

	

	
	

	

