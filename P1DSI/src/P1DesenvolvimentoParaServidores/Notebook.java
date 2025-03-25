package P1DesenvolvimentoParaServidores;


public class Notebook extends Produtos {
    private String processador;
    private String placaDeVideo;
    private String unidadeArmazenamento;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getUnidadeArmazenamento() {
        return unidadeArmazenamento;
    }

    public void setUnidadeArmazenamento(String unidadeArmazenamento) {
        this.unidadeArmazenamento = unidadeArmazenamento;
    }
    
    @Override 
    public double precoParcelado() {
        return this.getPreco() + (this.getPreco() * 0.05);
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Processador: " + getProcessador());
        System.out.println("Placa de Vídeo: " + getPlacaDeVideo());
        System.out.println("Unidade de armazenamento: " + getUnidadeArmazenamento());
    }
}
