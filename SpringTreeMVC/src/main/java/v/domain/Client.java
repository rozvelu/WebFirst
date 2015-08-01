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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="clientId")
	private int id;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	
	@Column
	private String balance;
	
	
	/*@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="Client_Orders", joinColumns=@JoinColumn(name="clientId"), inverseJoinColumns=@JoinColumn(name="ordersId"))*/
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="client")
	private List <Orders> orders;
	
	public Client(){}

	public Client(String fname, String lname, String balance) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.balance = balance;
		
	}
	

	public Client(String fname, String lname, String balance, List <Orders> orders) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.balance = balance;
		this.orders=orders;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", fname=" + fname + ", lname=" + lname
				+ ", balance=" + balance + "]";
	}

	
	}
	
	
	
	
	

