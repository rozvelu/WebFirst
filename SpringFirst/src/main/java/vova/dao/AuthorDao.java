package vova.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vova.app.SessionUtil;
import vova.domain.Author;

public class AuthorDao {
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void insertAuthor(Author a) {
		Session s = SessionUtil.getS();
		s.beginTransaction();
		s.save(a);
		s.getTransaction().commit();
	}
	
	public Author findAuthor (int id) {
		Session s = SessionUtil.getS();
		Author a = (Author) s.get(Author.class, id);
		return a;
	}
}
