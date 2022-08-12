package DAO;
import controller.ConnectionFactory;
import mainMenu.Main;
import model.Currency;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrencyDAO {

    public ArrayList<Currency> selectAll(){
        ArrayList<Currency> currencyArrayList = new ArrayList<>();
        ConnectionFactory connectionFactory = new ConnectionFactory();
        ResultSet rs = null;
        Statement stmt = null;

        connectionFactory.connect();
        String query = "SELECT * FROM tbl_currency";
        stmt = connectionFactory.createStatement();

        try{
            rs = stmt.executeQuery(query);

            //System.out.println("DADOS DAS MOEDAS: ");
            while (rs.next()){
//                System.out.println("...............................");
//                System.out.println("Rowid: "+rs.getInt("rowid"));
//                System.out.println("Name: "+ rs.getString("name"));
//                System.out.println("Symbol: "+ rs.getString("symbol"));
//                System.out.println("Value: " +rs.getDouble("value"));
//                System.out.println("...............................");
                currencyArrayList.add(new Currency(rs.getInt("rowid"),rs.getString("name"),rs.getString("symbol"), BigDecimal.valueOf((rs.getDouble("value")))));
            }

        }catch (SQLException e){
            System.err.println("Erroooou!!!!");
        }finally {
            try {
                stmt.close();
                connectionFactory.disconnect();
            }catch (SQLException ex){
                System.err.println("Erro de fechamento!");
            }
        }
        return currencyArrayList;
    }

    public void insertCurrency(Currency newCurrency){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        PreparedStatement stmt = null;
        connectionFactory.connect();
        String query = "INSERT INTO tbl_currency(rowid, name, symbol,value)"
                        + "values(?,?,?,?)";
        stmt = connectionFactory.createPreparedStatement(query);

        try{
            stmt.setInt(1,newCurrency.getRowid());
            stmt.setString(2,newCurrency.getName());
            stmt.setString(3, newCurrency.getSymbol());
            stmt.setDouble(4, newCurrency.getValue().doubleValue());

            int result = stmt.executeUpdate();

            if(result == 1){
                System.out.println("MOEDA INSERIDA");
            }else{
                System.err.println("MOEDA NÃO INSERIDA");
            }
        }catch (SQLException e){
            System.err.println("MOEDA NÃO INSERIDA");
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
            }catch (SQLException ex){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        connectionFactory.disconnect();
    }

}
