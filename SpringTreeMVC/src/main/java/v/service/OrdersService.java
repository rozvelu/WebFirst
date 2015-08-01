package v.service;

import java.util.List;

import v.domain.Orders;

public interface OrdersService {
	void insertOrders(Orders o);

	Orders findOrders(int id);
	
	List<Orders> getAllOrders();
	
	void deleteOrders(int id);
}
