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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="commodity")
 @NamedQuery (name = Commodity.FIND_BY_CATEGORY_ID, query = Commodity.FIND_BY_CATEGORY_ID_QUERY)
public class Commodity {

	public static final String FIND_BY_CATEGORY_ID = "Commodity.findByCategoryId";
	public static final String FIND_BY_CATEGORY_ID_QUERY = "SELECT co FROM Commodity co WHERE co.categoryid.id = :id";
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="commodityId")
	private int id;
	
	@Column
	private String maker;
	
	

	@Column
	private String title;
	
	@Column
	private int price;
	
	@Column
	private String description;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="categoryId")
	private Category category;
	
	
	// cascade - послідовне з'єднання  fetch-отримувати mappedBy - відображатись по...
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="commodity")
	private List<Orders> orders;
	
	public Commodity(){}
	public Commodity(String maker){}


	public Commodity(String maker, String title, int price, String description,
			Category category) {
		super();
		this.maker = maker;
		this.title = title;
		this.price = price;
		this.description = description;
		this.category = category;
	}


	public Commodity( String title, String maker, int price, String description) {
		super();
		this.maker=maker;
		this.title = title;
		this.price = price;
		this.description = description;
	}

public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Orders> getOrders() {
		return orders;
	}


	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}


	@Override
	public String toString() {
		return "Commodity [id=" + id + ", maker=" + maker + ", title=" + title
				+ ", price=" + price + ", description=" + description + "]";
	}


	
	
	
	
	
}
