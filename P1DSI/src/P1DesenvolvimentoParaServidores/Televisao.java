package P1DesenvolvimentoParaServidores;

public class Televisao extends Produtos {

    private int tamanhoPolegadas;
    private String resolucao;
    
    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    
    @Override
    public double precoParcelado() {
    return this.getPreco() + (this.getPreco() * 0.04);
}
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("O tamanho em polegadas é: " + getTamanhoPolegadas());
        System.out.println("Qualidade da Tela: " + getResolucao());
    }
   }
