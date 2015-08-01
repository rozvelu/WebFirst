package v.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import v.dao.OrdersDao;
import v.domain.Orders;

@Repository
public class OrdersDaoImpl extends BaseDaoImpl<Orders> implements OrdersDao{

	public OrdersDaoImpl() {
		super(Orders.class);
		// TODO Auto-generated constructor stub
	}
	
}
