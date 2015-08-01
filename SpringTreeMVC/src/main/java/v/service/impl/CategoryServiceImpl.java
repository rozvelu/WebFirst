package v.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import v.dao.CategoryDao;
import v.domain.Category;
import v.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao dao;
	
	public void insertCategory(Category category) {
		dao.insert(category);
		
	}

	public Category findCategory(String name) {
		
		return dao.findByName(name);
	}

	public List<Category> getCategories() {
		
		return dao.getAll();
	}

	public void deleteCategory(int id) {
	dao.delete(id);
		
	}

	public Category findCategorybyid(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
