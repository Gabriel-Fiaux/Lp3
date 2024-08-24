package br.edu.ifpr.ifpr.edu.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe de conxeão com o BD Usuario: root senha: ""
 *
 * Utilizamos essa estrutura para evitar a repetição de codigo e simplificar a
 * obtenção de conexão com o banco de dados
 *
 * @author Aluno
 */
public class ConnectionFactory {

    // Nome do usuario do MySQL 
    private static final String USERNAME = "root";

    // Senha do Mysql
    private static final String PASSWORD = "";

    // String de conexão com o BD
    //porta e nome do BD no qual pretende-se conectar
    //jdbc é java database connect
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ifpr";

    // se der merda no codigio a merda ta aqui
    public static Connection createConnectionToMySQL() {
        try {

            //cria a conexão com o db
            Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

            return connection;

        } catch (SQLException e) {
            System.out.println("NÃO FOI POSSIVEL CONECTAR-SE NO BD");
            System.out.println(DATABASE_URL);
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    public static void main(String[] args) {
        
        Connection con = createConnectionToMySQL();
        if(con != null){
            System.out.println("Connected");
        }else{
            System.out.println("Not possible to connect");
        }
        
        
    }
    
    

}
