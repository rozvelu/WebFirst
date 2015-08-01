package v.service;



import java.util.List;

import v.domain.Commodity;

public interface CommodityServce {
	void insertCommodity(Commodity com);
	
	Commodity findCommodity(int id);
	
	List<Commodity> getCommoditys();
	
	void deleteCommodity (int id);
}
