package ContaBancária.App;

import java.sql.Connection;
import java.sql.DriverManager;

public class testes {

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/banco_java",
            "root",
            "836AXi6"
        );

        System.out.println("Conectado com sucesso!");


    }
    
}
