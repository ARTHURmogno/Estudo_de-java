package PequenoUsuario;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Map<Integer, Usuario> usuarios = new HashMap<>();

        Usuario u1 = new Usuario(1, "ana", "ana@email");
        Usuario u2 = new Usuario(2, "juju", "jujuEemail");
        Usuario u3 = new Usuario(3, "ff", "ffemail");

        usuarios.put(u1.getId(), u1);
        usuarios.put(u2.getId(), u2);
        usuarios.put(u3.getId(), u3);

        Usuario usuario = usuarios.get(u2);

        System.out.println("nome: " + usuario.getNome());
        System.out.println("email: " + usuario.getEmail());


    }
    
}
