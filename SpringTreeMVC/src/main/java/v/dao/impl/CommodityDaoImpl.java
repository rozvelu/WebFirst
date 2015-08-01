package v.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;








import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import v.dao.CommodityDao;
import v.domain.Commodity;

@Repository
public class CommodityDaoImpl extends BaseDaoImpl<Commodity> implements CommodityDao{

	public CommodityDaoImpl() {
		super(Commodity.class);
		// TODO Auto-generated constructor stub
	}
	
}
