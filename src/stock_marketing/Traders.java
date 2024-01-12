package stock_marketing;

public class Traders {

	 private int trader_id;
	  private String trader_name;
	  private String email;
	  private String phone;
	// ----Constructor---
	   public Traders() 
	   {
		   
	   }
	   
public Traders(int trader_id, String trader_name)
	   {
	       this.trader_id = trader_id;
	       this.trader_name = trader_name;
	   }
	   
public Traders(int trader_id, String trader_name, String email,String  phone)
	 {
	     this.trader_id = trader_id;
	     this.trader_name = trader_name;
	     this.email = email;
	     this.phone=phone;
	  }
	 // getter setter methods

public int getTraderId() {
	     return trader_id;
	  }

	  public void setTraderId(int trader_id) {
	     this.trader_id = trader_id;
	  }
	  
	  public String getTraderName() {
	     return trader_name;
	  }

	  public void setTraderName(String trader_name) {
	     this.trader_name = trader_name;
	  }

	  public String getEmail() {
	     return email;
	  }

	  public void setEmail(String email) {
	     this.email = email;
	  }
	  public String getPhone() {
		     return phone;
		  }

		  public void setPhone(String phone) {
		     this.phone = phone;
		  }
	}


