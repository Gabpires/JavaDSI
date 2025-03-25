package P1DesenvolvimentoParaServidores;

public class Telefone extends Produtos {
    private String armazenamento;
    private String ram;
    private String sistemaOperacional;

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    @Override 
    public double precoParcelado() {
        return this.getPreco() + (this.getPreco() * 0.1);
    }
    
    @Override 
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Armazenamento: " + getArmazenamento());
        System.out.println("Mémoria Ram: " + getRam());
        System.out.println("Sistema Operacional: " + getSistemaOperacional());
    }
}
