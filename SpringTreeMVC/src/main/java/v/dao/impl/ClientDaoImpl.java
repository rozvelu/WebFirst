package v.dao.impl;

import org.springframework.stereotype.Repository;

import v.dao.ClientDao;
import v.domain.Client;




@Repository
public class ClientDaoImpl extends BaseDaoImpl<Client> implements ClientDao {
public ClientDaoImpl() {
super(Client.class);
}
}
