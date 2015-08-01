package v.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import v.dao.CategoryDao;
import v.dao.impl.CategoryDaoImpl;
import v.domain.Category;

@Repository
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {

	public  CategoryDaoImpl() {
		
		super(Category.class);
	}
		
	@Transactional
	public Category findByName (String catName) {
		Category cat = (Category) CategoryDaoImpl.this.getEm().createQuery("select c from commodity c where c.category.nameCategory = name").setParameter("name", catName).getSingleResult();
		return cat;
	}

	@Transactional
	public void deleteByName (String catName) {
		Category cat = (Category) CategoryDaoImpl.this.getEm().createQuery("from Category where catName=:name").setParameter("name", catName).getSingleResult();
		CategoryDaoImpl.this.getEm().remove(cat);
	}

	@Transactional
	public void updateCategory(String catName, String newName) {
		Category cat = (Category) CategoryDaoImpl.this.getEm().createQuery("from Category where catName=:name").setParameter("name", catName).getSingleResult();
		cat.setCategoryName(newName);
		CategoryDaoImpl.this.getEm().merge(cat);
	}
	
	//tyt
//	@Transactional
//public Category findbyid(int id){
//	
//	Category cat= (Category) CategoryDaoImpl.this.getEm().createQuery("select c from commodity c where c.category.nameCategory = id");
//	return cat;  
//}

}
