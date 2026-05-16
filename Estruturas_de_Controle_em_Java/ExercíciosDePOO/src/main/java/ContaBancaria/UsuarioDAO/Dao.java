package ContaBancaria.UsuarioDAO;

import ContaBancaria.Modelo.Usuario;
import ContaBancaria.Database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Dao {



    public void salvar(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
              conn = Conexao.conectar();

            String sql = "INSERT INTO usuarios (nome, saldo) VALUES (?, ?)";
              stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setDouble(2, usuario.getSaldo());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("DEU ERRO: AÓ INSERI DADOS.");
        } finally {
            try {
            if (stmt != null) {
                stmt. close();
            }

            if (conn != null) {
                conn.close();
            }
            
            } catch (Exception e) {
                System.out.println("Erro ao fachar.");
            }
        }
    }
    
}
