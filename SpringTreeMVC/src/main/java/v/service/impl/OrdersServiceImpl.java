package v.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import v.dao.OrdersDao;
import v.domain.Orders;
import v.service.OrdersService;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	private OrdersDao dao;
	
	public void insertOrders(Orders e) {
		dao.insert(e);
		
	}

	public Orders findOrders(int id) {
		return dao.findById(id);
	}

	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	public void deleteOrders(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
