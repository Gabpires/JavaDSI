package P1DesenvolvimentoParaServidores;

public class Produtos {
    
    private String nome;
    private String marca;
    private String categoria;
    private double preco;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    private int quantidadeDisponivel;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    
    public double precoParcelado() {
        return this.preco + (this.preco * 0.05);
        
    }
    
    public void exibeDados() {
        System.out.println("Produto: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Preço à Vista: " + getPreco());
        System.out.println("Preço à prazo: " + precoParcelado());
    }
    
    
}
