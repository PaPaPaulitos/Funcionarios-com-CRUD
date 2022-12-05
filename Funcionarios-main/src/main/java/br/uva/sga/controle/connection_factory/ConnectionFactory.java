package br.uva.sga.controle.connection_factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    //Nome do usuario do MySQL
    private static final String USERNAME = "root";

    //Senha do banco MySQL
    private static final String PASSWORD = "12345";

    //Caminho do Banco de dados, porta, Database
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/fiscalizacao";

    /*
     * Conexão com o Banco de Dados
     */

    public static Connection createConnectionToMySQL() throws Exception {
        //com.mysql.jdbc.Driver
        //Faz com que a classe carregada pela JVM
        Class.forName("com.mysql.jdbc.Driver");

        //Cria a conexão com o Banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        return connection;

    }

    public static void main(String[] args) throws Exception {
        //Recuperar conexão com o banco de dados
        Connection con = createConnectionToMySQL();

        //Tentar se a conexão é NULL
        if(con != null){
            System.out.println("Conexão obtida com sucesso!");
            con.close();
        }
    }

}
