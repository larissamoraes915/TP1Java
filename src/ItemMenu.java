public class ItemMenu {
    private String nome;
    private String descricao;
    private double preco;
    private boolean disponivel;

    // Construtor
    public ItemMenu(String nome, String descricao, double preco, boolean disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    // Getters e Setters
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean estaEmPromocao() {
        final double PRECO_PROMOCAO = 10.0;
        return preco < PRECO_PROMOCAO;
    }
}