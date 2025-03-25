package P1DesenvolvimentoParaServidores;


public class TestaProdutos {

   
    public static void main(String[] args) {
        Televisao t =  new Televisao();
        
        //Classe mãe(Produtos)
        t.setNome("Televisão Smart com Android TV");
        t.setMarca("LG");
        t.setCategoria("Televisores");
        t.setPreco(4000.00);
        
        //Classe Filha(Televisão)
        t.setTamanhoPolegadas(50);
        t.setResolucao("4K Ultra HD");
        
        Telefone t2 = new Telefone();
        //Classe mãe(Produtos)
        t2.setNome("Celular Touch com 256gb de armazenamento");
        t2.setMarca("Motorola");
        t2.setCategoria("Smartphones");
        t2.setPreco(5000.00);
        
        //Classe Filha(Telefone)
        t2.setArmazenamento("256GB");
        t2.setRam("8GB");
        t2.setSistemaOperacional("Android");
        
        Notebook n = new Notebook();
        //Classe mãe(Produtos)
        n.setNome("Notebook Gamer com led ssd");
        n.setMarca("Acer");
        n.setCategoria("Notebooks");
        n.setPreco(8000.00);
        
        //Classe Filha(Notebook)
        n.setProcessador("Amd Ryzen 7 5000 series 1TB ssd 32GB Ram");
        n.setPlacaDeVideo("AMD Radeon Graphics");
        n.setUnidadeArmazenamento("SSD");
        
        CarregadorCelular c = new CarregadorCelular();
        
        //Classe mãe(Produtos)
        c.setNome("Carregador Turbo");
        c.setMarca("Samsung");
        c.setCategoria("Acessórios");
        c.setPreco(300.00);
        
        //Classe Filha(CarregadorCelular)
        c.setPotencia("68 Whats");
        c.setTipoCabo("USB-C");
        
        //Exibindo dados
        System.out.println("Televisão");
        t.exibeDados();
        System.out.println("----------------------");
        
        System.out.println("Telefone");
        t2.exibeDados();
        System.out.println("----------------------");
        
        System.out.println("Notebbok");
        n.exibeDados();
        System.out.println("----------------------");
        
        System.out.println("Carregadores");
        c.exibeDados();
        System.out.println("----------------------");
        
        
        
    }
    
}
