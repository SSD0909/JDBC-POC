package stock_marketing;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
	public class AccessStockMarketing 
	{
	  public static void main(String[] args) 
	  {
	       // creating object
	       StocksMarketingDao stockmarketingDao = new StocksMarketingDaoImpl();
	       System.out.println("--------- inserting stocks records ----------");
	       ArrayList<Stocks> StockList = new ArrayList<Stocks>();
	       ArrayList<Traders> TraderList = new ArrayList<Traders>();
	       ArrayList<Trade> TradeList = new ArrayList<Trade>();
	       Stocks s1 = new Stocks();
	       s1.setStockId(1101);
	       s1.setStockName("Apple Inc");
	       s1.setTicker("AAPL");
	       StockList.add(s1);
	       
	       Stocks s2 = new Stocks();
	       s2.setStockId(1102);
	       s2.setStockName("Amazon Inc");
	       s2.setTicker("AMZN");
	       StockList.add(s2);
	       
	       Stocks s3 = new Stocks();
	       s3.setStockId(1103);
	       s3.setStockName("Microsoft Inc");
	       s3.setTicker("MSFT");
	       StockList.add(s3);
	       
	       Stocks s4 = new Stocks();
	       s4.setStockId(1104);
	       s4.setStockName("Walgreens Inc");
	       s4.setTicker("WLGRN");
	       StockList.add(s4);
	       
	       stockmarketingDao.saveStock(StockList);
	       System.out.println("--------- inserting traders records ----------");
	     Traders t1 = new Traders();
	       t1.setTraderId(2301);
	       t1.setTraderName("John Depp");
	       t1.setEmail("johndepp@gmail.com");
	       t1.setPhone("7374145236");
	       TraderList.add(t1);
	       
	       Traders t2 = new Traders();
	       t2.setTraderId(2302);
	       t2.setTraderName("Jane Smith");
	       t2.setEmail("janesmith@gmail.com");
	       t2.setPhone("6362345234");
	       TraderList.add(t2);
	       
	       Traders t3 = new Traders();
	       t3.setTraderId(2303);
	       t3.setTraderName("Benjamin Hale");
	       t3.setEmail("benhale@gmail.com");
	       t3.setPhone("4567234523");
	       TraderList.add(t3);
	       
	       Traders t4 = new Traders();
	       t4.setTraderId(2304);
	       t4.setTraderName("Shannah Morgan");
	       t4.setEmail("smorgan@gmail.com");
	       t4.setPhone("5123697523");
	       TraderList.add(t4);

	       stockmarketingDao.saveTrader(TraderList);
	       
	       System.out.println("--------- inserting trades records ----------");
	       
	       Trade tr1 = new Trade();
	       //tr1.setTrade_id(123);
	       tr1.setTraderId(2301);
	       tr1.setStockId(1101);
	       TradeList.add(tr1);
	       
	       Trade tr2 = new Trade();
	       tr2.setTraderId(2302);
	       tr2.setStockId(1102);
	       TradeList.add(tr2);
	       
	       Trade tr3 = new Trade();
	       tr3.setTraderId(2303);
	       tr3.setStockId(1103);
	    
	       TradeList.add(tr3);
	       
	       Trade tr4 = new Trade();
	  
	       tr4.setTraderId(2304);
	       tr4.setStockId(1104);
	   
	       TradeList.add(tr4);

	       stockmarketingDao.saveTrade(TradeList);
	       
	   }
	}




