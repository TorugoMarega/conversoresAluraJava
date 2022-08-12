package controller;

import java.sql.*;

public class ConnectionFactory {
    private Connection connection;


    /*Realiza conexão com o banco de dados e cria se não existe*/
    public boolean connect(){

        try{
            String url = "jdbc:sqlite:src/db/converterDB.db";
            this.connection = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }

    public boolean disconnect(){
        try{
            if (this.connection.isClosed()){
               this.connection.close();
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }

    public Statement createStatement(){
        try{
           return this.connection.createStatement();
        }catch (SQLException e){
            return null;
        }
    }

    public PreparedStatement createPreparedStatement(String sql){
        try{
            return this.connection.prepareStatement(sql);
        }catch (SQLException e){
            return null;
        }
    }

    public Connection getConnection(){
        return this.connection;
    }
}
