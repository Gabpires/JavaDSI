
package P1DesenvolvimentoParaServidores;

public class CarregadorCelular extends Produtos {
    private String potencia;
    private String tipoCabo;

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTipoCabo() {
        return tipoCabo;
    }

    public void setTipoCabo(String tipoCabo) {
        this.tipoCabo = tipoCabo;
    }
    
    @Override
    public double precoParcelado() {
        return this.getPreco() + (this.getPreco() * 0.04);
    }
    
    @Override 
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Potencia de Carregamento: " + getPotencia());
        System.out.println("Tipo do Cabo: " + getTipoCabo());
    }
}
