package common;

public class Operator extends Client{
	/* That company that this turistic operator represents. */
	private String company;
	
	/* The constructor. */
	public Operator(String comp, String name, String addr, String phone, String mail){
		super(name,addr,phone,mail);
		company = comp;
	}

	/* Getters and setters. */
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}