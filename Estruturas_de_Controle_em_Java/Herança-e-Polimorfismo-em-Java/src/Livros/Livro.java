package Livros;

public class Livro {

    public String titulo;
    public int paginas;

    public Livro(String titulo, int paginas) {
        if (paginas < 1) {
            throw new IllegalArgumentException("Páginas Inválidas.");
        }
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O nome é obrigatório e não pode estar vazio. ");
        }
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    
}
