package ContaBancaria.UsuarioDAO;

import ContaBancaria.Modelo.Usuario;
import ContaBancaria.Database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

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
            System.out.println("Deu erro.");
        } finally {
            try {

            if (stmt != null) stmt.close();
            if (conn != null) conn.close();

            } catch (Exception e) {
                System.out.println("Erro ao fachar.");
            }
        }
    }

    public List<Usuario> listar() {

        Connection conn = null;
        PreparedStatement stmt = null;

        try{

            List<Usuario> usuarios = new ArrayList<>();

            conn = Conexao.conectar();

            String sql = "SELECT * FROM usuarios";
            stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();


            while(rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double saldo = rs.getDouble("saldo");

                Usuario u = new Usuario(nome, id, saldo);

                usuarios.add(u);

            }
            return usuarios;

        } catch (Exception e) {
            System.out.println("Erro ao lista.");
            return new ArrayList<>();
        } finally {
            try {
                if (conn != null) conn.close();
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                System.out.println("Erro ao fechar.");
            }
        }

    }

    public void atualizar(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            conn = Conexao.conectar();

            String sql = "UPDATE usuarios SET saldo = ? WHERE id ?";
            stmt = conn.prepareStatement(sql);

            stmt.setDouble(1, usuario.getSaldo());
            stmt.setInt(2, usuario.getId());

            stmt.executeUpdate();


        } catch (Exception e) {
            System.out.println("erro ao atualizar dados.");
        } finally {
            try {
                if (conn != null) conn.close();

                if (stmt != null) stmt.close();

            } catch (Exception e) {
                System.out.println("erro ao fechar.");
            }
        }

    }
    
}
