package ContaBancaria.App;

import java.sql.Connection;
import java.sql.DriverManager;

public class testes {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/banco_java",
            "root",
            "836AXi6"
        );

           System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}




































