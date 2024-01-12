package stock_marketing;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StocksMarketingDaoImpl extends StockConnectionDAO implements StocksMarketingDao {
	
     public void saveStock(List<Stocks> StockList) {
       try {
          Connection con = StockConnectionDAO.getConnection();
          
          for(Stocks st: StockList) 
          {
        	  String sqlQuery1 = "INSERT INTO stock (stock_id,stock_name,ticker) VALUES (?,?,?)";
              PreparedStatement prepStmt = con.prepareStatement(sqlQuery1);
              int stock_id=st.getStockId();
              String stock_name=st.getStockName();
              String ticker=st.getTicker();
              
              prepStmt.setInt(1, stock_id);
              prepStmt.setString(2, stock_name);
              prepStmt.setString(3, ticker);
              int affectedRows = prepStmt.executeUpdate();
              System.out.println(affectedRows + " row(s) affected !!");
              
              
          }
          con.close();
       }
       catch (ClassNotFoundException e)
       {
       } catch (SQLException throwables)
       {
           throwables.printStackTrace();
       }
   }
    
     public void saveTrader(List<Traders> TraderList) {
         try {
            Connection con1 = StockConnectionDAO.getConnection();
     for(Traders tl: TraderList) 
     {
   	  String sqlQuery2 = "INSERT INTO trader (trader_id,trader_name,email,phone) VALUES (?,?,?,?)";
         PreparedStatement prepStmt = con1.prepareStatement(sqlQuery2);
         int trader_id=tl.getTraderId();
         String trader_name=tl.getTraderName();
         String email=tl.getEmail();
         String phone=tl.getPhone();
         
         prepStmt.setInt(1, trader_id);
         prepStmt.setString(2, trader_name);
         prepStmt.setString(3, email);
         prepStmt.setString(4, phone);
         int affectedRows = prepStmt.executeUpdate();
         System.out.println(affectedRows + " row(s) affected !!");
     
     }
     
         }
         catch (ClassNotFoundException e)
         {
         } catch (SQLException throwables)
         {
             throwables.printStackTrace();
         }
     }
   public List<Stocks> getAllStocks() {
       try {
           Connection connection = StockConnectionDAO.getConnection();
           Statement stmt = connection.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM stock");
           List StockList = new ArrayList();
           while(rs.next())
           {
               Stocks s = new Stocks();
               s.setStockId(rs.getInt("stock_id"));
               s.setStockName(rs.getString("stock_name"));
               s.setTicker(rs.getString("ticker"));
               StockList.add(s);
           }
           return StockList;

       } catch (SQLException ex) {
           ex.printStackTrace();
           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return null;
   }

   public List<Traders> getAllTrader() {
       try {
           Connection connection1 = StockConnectionDAO.getConnection();
           Statement stmt = connection1.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM trader");
           List TraderList = new ArrayList();
           while(rs.next())
           {
               Traders tr = new Traders();
               tr.setTraderId(rs.getInt("trader_id"));
               tr.setTraderName(rs.getString("trader_name"));
               tr.setEmail(rs.getString("email"));
               tr.setPhone("phone");
               TraderList.add(tr);
           }
           connection1.close();
           return TraderList;

       } 
       
       catch (SQLException ex) {
           ex.printStackTrace();
           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return null;
   }

   public void saveTrade(List<Trade> TradeList) {
       try {
          Connection con3 = StockConnectionDAO.getConnection();
   for(Trade trd: TradeList) 
   {
 	  String sqlQuery3 = "INSERT INTO trade (stock_id,trader_id) VALUES (?,?)";
       PreparedStatement prepStmt = con3.prepareStatement(sqlQuery3);
       int trader_id=trd.getTraderId();
       int stock_id=trd.getStockId();
       //int trade_id=trd.getTrade_id();
      // int quantity=trd.getQuantity();
      // double price=trd.getPrice();
       //Timestamp time_stamp=trd.getTimeStamp();
       
       
      // prepStmt.setInt(1, trade_id);
       
       prepStmt.setInt(1, stock_id);
       prepStmt.setInt(2, trader_id);
      // prepStmt.setInt(4, quantity);
      // prepStmt.setDouble(5, price);
       
       //prepStmt.setTimestamp(6, time_stamp);
       int affectedRows = prepStmt.executeUpdate();
       System.out.println(affectedRows + " row(s) affected !!");
   
   }
   
       }
       catch (ClassNotFoundException e)
       {
       } catch (SQLException throwables)
       {
           throwables.printStackTrace();
       }
   }
 public List<Trade> getAllTrade() {
     try {
         Connection connection2 = StockConnectionDAO.getConnection();
         Statement stmt = connection2.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM trade");
         List TradeList = new ArrayList();
         while(rs.next())
         {
             Trade tr = new Trade();
             
            // tr.setTrade_id(rs.getInt("trade_id"));
             tr.setStockId(rs.getInt("stock_id"));
             tr.setTraderId(rs.getInt("trader_id"));
             
            // tr.setQuantity(rs.getInt("quantity"));
            // tr.setPrice(rs.getDouble("price"));
             TradeList.add(tr);
         }
         return TradeList;

     } catch (SQLException ex) {
         ex.printStackTrace();
         System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }
     return null;
 }




@Override
public boolean deleteStock(int id) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean updateStock(Stocks stock, int id) {
	// TODO Auto-generated method stub
	return false;
}
public boolean deleteTrader(int id) {
	// TODO Auto-generated method stub
	return false;
}
public boolean updateTrader(Traders trader, int id) {
	// TODO Auto-generated method stub
	return false;
}


 
 }


          

