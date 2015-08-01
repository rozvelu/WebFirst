package v.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import v.dao.CommodityDao;
import v.dao.impl.CommodityDaoImpl;
import v.domain.Commodity;
import v.service.CommodityServce;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityServce{
	
	@Autowired
	private CommodityDao dao;


	public void insertCommodity(Commodity com) {
		dao.insert(com);
	}

	public Commodity findCommodity(int id) {
		return dao.findById(id);
	}

	public List<Commodity> getCommoditys() {
		return dao.getAll();
	}

	public void deleteCommodity(int id) {
		// TODO Auto-generated method stub
	
		dao.delete(id);
	}

	

}
