package vova.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vova.app.SessionUtil;
import vova.domain.Author;
import vova.domain.Book;

public class BookDao {
	private SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void insertBook(Book b) {
		Session s = SessionUtil.getS();
		s.beginTransaction();
		s.save(b);
		s.getTransaction().commit();
	}
}
