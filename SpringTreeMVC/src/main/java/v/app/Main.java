package v.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





import v.domain.Category;
import v.domain.Commodity;
import v.domain.Client;
import v.domain.Orders;
import v.service.CategoryService;
import v.service.CommodityServce;
import v.service.ClientService;
import v.service.OrdersService;

public class Main {
	
	public static void main (String [] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
		
		
		ClientService clientService = (ClientService) context.getBean("clientService");
		OrdersService ordersService = (OrdersService) context.getBean("ordersService");
		CommodityServce commodityService= (CommodityServce) context.getBean("commodityService");
		CategoryService categoryService = (CategoryService) context.getBean("categoryService");
		
		
	/*
	
		categoryService.insertCategory(new Category("������������"));
		categoryService.insertCategory(new Category("������ ��������"));
		categoryService.insertCategory(new Category("��������"));
		categoryService.insertCategory(new Category("���������"));
		categoryService.insertCategory(new Category("̳������������"));
		
	*/
	
		/*
		commodityService.insertCommodity(new Commodity("LG", "TV", 12333, "TVLED", categoryService.findCategory(4)));
		commodityService.insertCommodity(new Commodity("Samsung", "TV", 14431, "TVLCD", categoryService.findCategory(4)));
		commodityService.insertCommodity(new Commodity("Philips", "TV", 100333, "TV", categoryService.findCategory(4)));
		commodityService.insertCommodity(new Commodity("AEG", "TV", 120003, "TV", categoryService.findCategory(4)));
		commodityService.insertCommodity(new Commodity("LG", "TV", 333, "TVLED", categoryService.findCategory(4)));
		
		commodityService.insertCommodity(new Commodity("LG", "GW-B469SLCW", 12333, "WIFI", categoryService.findCategory(5)));
		commodityService.insertCommodity(new Commodity("Apple", "WBE 3414 TS", 12333, "WIFI", categoryService.findCategory(5)));
		commodityService.insertCommodity(new Commodity("Sony", "ERRDS", 12333, "WASH", categoryService.findCategory(5)));
		
		*/
		// ��������� �볺���
		//clientService.insertClient(new Client("Petro", "Ren", "21212"));
		//������� ���������� � ������ �� �볺��� � ����! 
		//ordersService.insertOrders(new Orders("14-02-2015", "Lviv", 123122, commodityService.findCommodity(1), clientService.findClient(1)));
		
		//ordersService.insertOrder(new Orders(clientService.findCustomer(1), commService.findCommodity(5), 2, "�.�����, ���.�������� 21"));*/
		
		/*
		�������� �볺��� �� ������
		clientService.deleteClient(2);*/
		
		categoryService.deleteCategory(4);
		categoryService.deleteCategory(5);
		
 		context.close();
	}

	
}
