public class Cofrinho{
    private String donoDoCofrinho;
    private int qtd10;
    private int qtd25;
    private int qtd50;
    
    public Cofrinho(String d){
        donoDoCofrinho = d;
    }
    
    public void setNome(String novoNome){
        donoDoCofrinho = novoNome;
    }
    
    public String getNome(){
        return donoDoCofrinho;
    }
    
    public void depositaUmaMoedaDezCentavos(){
        ++qtd10;
    }
    
    public void depositaUmaMoedaVinteCincoCentavos(){
        ++qtd25;
    }

    public void depositaUmaMoedaCinquentaCentavos(){
        ++qtd50;
    }
    
    public double calculaTotal(){
        return ((qtd10*0.1) + (qtd25*0.25) + (qtd50*0.5));
    }
    
    public double calculaTotal(double vlrDolar){
        return ((qtd10*0.1) + (qtd25*0.25) + (qtd50*0.5))/vlrDolar;
    }    
    
}