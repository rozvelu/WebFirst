package v.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="orders")
public class Orders {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ordersId")
	private int id;
	
	@Column
	private String timeorders;
	
	@Column
	private String shipAdress;
	
	@Column
	private int price;
	
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="commodityId")
	private Commodity commodity;

	
	
	//@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE}, mappedBy="orders")
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="clientId")
	private Client client;
	
	public Orders(){}

	public Orders(String timeorders, String shipAdress, int price, Commodity commodity, Client client) {
		super();
		this.timeorders = timeorders;
		this.shipAdress=shipAdress;
		this.price=price;
		this.client=client;
		this.commodity=commodity;
		
	
	}

	public Orders(String timeorders, String shipAdress, int price) {
		super();
		this.timeorders = timeorders;
		this.shipAdress=shipAdress;
		this.price=price;
		
		
	
	}



	public String getShipAdress() {
		return shipAdress;
	}



	public void setShipAdress(String shipAdress) {
		this.shipAdress = shipAdress;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimeorders() {
		return timeorders;
	}

	public void setTimeorders(String timeorders) {
		this.timeorders = timeorders;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}



	@Override
	public String toString() {
		return "Orders [id=" + id + ", timeorders=" + timeorders
				+ ", shipAdress=" + shipAdress + ", price=" + price + "]";
	}

	
	
	
	
}
