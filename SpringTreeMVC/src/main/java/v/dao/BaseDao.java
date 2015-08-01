package v.dao;

import java.util.List;

public interface BaseDao <E> {
	
	void insert(E e);
	
	E findByName (String name);
	E findById (int id);
	List<E> getAll();
	
	void delete (int id);
	//E  researchByname (String name);
}
