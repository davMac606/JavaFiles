package projeto201238;

public class Produto {
    private String nome;
    private String descricao;
    private int codigo;
    private double preco;
    private String autor;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibir() {
        System.out.println("Nome do produto: " + nome + "\nDescrição do Produto: " + descricao + "\nAutor do produto: "
                + autor + "\nCódigo do produto: " + codigo + "\nPreço do produto: " + preco + "\nTipo do produto: "
                + tipo);
    }

    public void maiorPreco() {
        System.out.println("Maior preço");
    }

    public void menorPreco() {
        System.out.println("Menor preço");
    }

    public void mediaPreco() {
        System.out.println("Média de preços");
    }

    public void quantidadeAcimaMedia() {
        System.out.println("Quantidade de produtos acima da média de preço");
    }
}
