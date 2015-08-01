package vova.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SessionUtil {
	private static SessionFactory factory;
	private static Session s;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public static Session getS() {
		if (s == null) {
			s = factory.openSession();
		}
		return s;
	}
}
