package stock_marketing;

import java.sql.SQLException;
import java.util.List;
public interface StocksMarketingDao 
{

/** This is the method to be used to list down all the records from the stocks table.*/
List<Stocks> getAllStocks() throws ClassNotFoundException, SQLException;
//are api's...alias name is seen in internet
/** This method to be used to create a stock in the stocks table. */
void saveStock(List<Stocks> StockList);
/** This is the method to be used to delete a stock from 
 * the stocks table corresponding to a passed stock id. */
boolean deleteStock(int id);
/** This is the method to be used to update a record into the stocks table. */
boolean updateStock(Stocks stock, int id);

List<Traders> getAllTrader() throws ClassNotFoundException, SQLException;
void saveTrader(List<Traders> TraderList);
boolean deleteTrader(int id);
boolean updateTrader(Traders trader, int id);

List<Trade> getAllTrade() throws ClassNotFoundException, SQLException;
void saveTrade(List<Trade> TradeList);

}


