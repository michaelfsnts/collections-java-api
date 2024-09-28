package list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoFabricacao;

    public Livro(String titulo, String autor, int anoFabricacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoFabricacao = anoFabricacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
