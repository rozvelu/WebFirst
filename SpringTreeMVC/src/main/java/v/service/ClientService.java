package v.service;



import java.util.List;

import v.domain.Client;
import v.domain.Commodity;
import v.domain.Orders;

public interface ClientService {
void insertClient(Client cl);
	
	Client findClient(int id);
	
	List<Client> getClients();
	
	void deleteClient (int id);


	

}
