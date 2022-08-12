package data;

import controller.ConnectionFactory;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    private final ConnectionFactory connectionFactory;

    public CreateDatabase(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
        System.out.println("DATABASE CRIADA !!!");
    }

    public void createTableCurrency(){
//        String sql = "DROP TABLE IF EXISTS tbl_currency; CREATE TABLE IF NOT EXISTS tbl_currency"
//                +"("
//                +   "rowid INTEGER PRIMARY KEY NOT NULL,"
//                +   "name TEXT NOT NULL,"
//                +   "symbol TEXT(4) NOT NULL,"
//                +   "value DOUBLE NOT NULL"
//                +")";

        String sql = "CREATE TABLE IF NOT EXISTS tbl_currency"
                +"("
                +   "rowid INTEGER PRIMARY KEY NOT NULL,"
                +   "name TEXT NOT NULL,"
                +   "symbol TEXT(4) NOT NULL,"
                +   "value DOUBLE NOT NULL"
                +")";


        boolean connect = false;

        try{
            connect = this.connectionFactory.connect();
            System.out.println("CONECTADO!!!");
            Statement stmt = this.connectionFactory.createStatement();
            System.out.println("STATEMENT CRIADO!!!");
            stmt.executeUpdate(sql);
            System.out.println("Tabela Criada!!!");
        }
        catch (SQLException e){
            System.err.println("Falha na Criação da Tabela!!!");
            System.err.println(e.getMessage());
        }finally {
            if(connect){
                this.connectionFactory.disconnect();
                System.out.println("Desconectado!!!");
            }
        }
    }
}
