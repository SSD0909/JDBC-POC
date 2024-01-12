package stock_marketing;
import java.sql.Timestamp;
import java.time.LocalDateTime;
public class Trade {
	private int trader_id;
	 // private int trade_id;
	  private int stock_id;
	  	// ----Constructor---
	   public Trade() 
	   {
		  
	   }
	   
	   public Trade( int stock_id, int trader_id)
	   {
	       this.trader_id = trader_id;
	       //this.trade_id = trade_id;
	       this.stock_id=stock_id;
	   }
	   	 // getter setter methods
	  public int getTraderId() {
	     return trader_id;
	  }
	  public void setTraderId(int trader_id) {
	     this.trader_id = trader_id;
	  }
	 	  public int getStockId() {
	     return stock_id;
	  }

	  public void setStockId(int stock_id) {
	     this.stock_id = stock_id;
	  }

	  //public int getTrade_id() {
	//     return trade_id;
	 // }

	 // public void setTrade_id(int trade_id) {
	 //    this.trade_id = trade_id;
	 // }
	/*  public int getQuantity() {
		     return quantity;
		  }

		  public void setQuantity(int quantity) {
		     this.quantity = quantity;
		     
		     
		  }
		  
		  public double getPrice() {
			  return price;
			  
		  }
		  public void setPrice(double price) {
			     this.price = price;
			     
			     
			  }
		  
		  /*public Timestamp getTimeStamp() {
			  return time_stamp;
		  }
		  public void setTimeStamp(Timestamp time_Stamp) {
			     this.time_stamp = time_Stamp;*/
			     
			     
			  
	}


