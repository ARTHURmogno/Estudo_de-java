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

            String sql = "INSERT INTO usuarios (nome, id, saldo) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setInt(2, usuario.getId());
            stmt.setDouble(3, usuario.getSaldo());

            stmt.executeUpdate();

        }catch (Exception e) {
            System.out.println("erro ao adicionar Usuario.");
        } finally {
            try {

                if (conn != null) conn.close();
                if (stmt != null) stmt.close();

            }catch (Exception e) {
                System.out.println("erro ao fechar.");
            }
        }

    }

    public List<Usuario> listar() {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            List<Usuario> usuarios = new ArrayList<>(); 

            conn = Conexao.conectar();

            String sql = "SELECT * FROM usuarios";
            stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                double saldo = rs.getDouble("saldo");

                Usuario u = new Usuario(nome, id, saldo);

                usuarios.add(u);

            }
            return usuarios;

        }catch (Exception e) {
            System.out.println("erro ao listar.");
            return null;
        } finally {
            try {
                if (conn != null) conn.close();
                if (stmt != null) stmt.close();

            } catch (Exception e) {
                System.out.println("erro ao fechar.");
            }
        }

    }

    public Usuario mostraPorId(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            conn = Conexao.conectar();

            String sql = "SELECT * FROM usuarios WHERE id = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, usuario.getId());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                String nome = rs.getString("nome");
                double saldo = rs.getDouble("saldo");

                Usuario u = new Usuario(nome, usuario.getId(), saldo);

                return u;

            }

            return null;

        }catch (Exception e) {
            System.out.println("erro ao mostrar usuario.");
            return null;
        } finally {
            try {
                if (conn != null) conn.close();
                if (stmt != null) stmt.close();

            }catch (Exception e) {
                System.out.println("erro ao fechar.");
            }
        }

    }

}
