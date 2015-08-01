package vova.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vova.domain.Person;

public class PersonDao {
	private SessionFactory factory;
	
	public void insertPerson(Person person) {
		Session s = factory.openSession();
		s.beginTransaction();
		s.persist(person);
		s.getTransaction().commit();
	}

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	
}
