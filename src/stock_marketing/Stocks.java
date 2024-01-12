package stock_marketing;
public class Stocks {
	  private int stock_id;
	  private String stock_name, ticker;
		   public Stocks() 
	   {
		  }
	   public Stocks(int stock_id, String stock_name)
	   {
	       this.stock_id = stock_id;
	       this.stock_name = stock_name;
	   }
	   public Stocks(int stock_id, String stock_name, String ticker)
	 {
	     this.stock_id = stock_id;
	     this.stock_name = stock_name;
	     this.ticker = ticker;
	  }
	 // getter setter methods
public int getStockId() {
	     return stock_id;
	  }
	  public void setStockId(int stock_id) {
	     this.stock_id = stock_id;
	  }
	  	  public String getStockName() {
	     return stock_name;
	  }
	  public void setStockName(String stock_name) {
	     this.stock_name = stock_name;
	  }
	  public String getTicker() {
	     return ticker;
	  }
	  public void setTicker(String ticker) {
	     this.ticker = ticker;
	  }
	}


