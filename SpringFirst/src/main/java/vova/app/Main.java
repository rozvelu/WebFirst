package vova.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vova.dao.AuthorDao;
import vova.dao.BookDao;
import vova.domain.Author;
import vova.domain.Book;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"appContext.xml");
		AuthorDao daoA = (AuthorDao) context.getBean("daoAuthor");
//		daoA.insertAuthor(new Author("Tolkin", 25));
		BookDao daoB = (BookDao) context.getBean("daoBook");
		daoB.insertBook(new Book("LOTR", daoA.findAuthor(1)));
		context.close();
	}

}
