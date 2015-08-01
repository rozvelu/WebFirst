package v.service;

import java.util.List;


import v.domain.Category;


public interface CategoryService {

	void insertCategory(Category category);
	
	Category findCategory(String name);
	
	List<Category> getCategories();
	
	void deleteCategory (int id);

	Category findCategorybyid(int id);

}
