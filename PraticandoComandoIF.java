public class PraticandoComandoIF{
    
    public String analisaNumeros(int a, int b){
        if (a>b) return "Maior: "+a;
            else if (a==b) return "Valores são iguais";
                return "Maior: "+b;
    }
            
    public String nParouImpar(){
        int vlr = (int) (Math.random()*10);
        System.out.println (vlr);
        if ((vlr%2)==0) return "\fNúmero par";
            else return "\fNúmero ímpar";
        }
    
    public String nEntreA_B_par_Impar(int a, int b){
        int valor;
        if (a>b) {
            valor = (b+(int) (Math.random()*(a-b)));
            System.out.println ("\f"+valor);
            if ((valor%2)==0) return "\fNúmero par";
                else return "\fNúmero ímpar";
            }
        else if (b>a) {
            valor = (a+(int) (Math.random()*(b-a)));
            System.out.println ("\f"+valor);
            if ((valor%2)==0) return "Número par";
                else return "Número ímpar";
            }
            else 
                valor = (a+(int) (Math.random()*(b-a)));
                System.out.println ("\f"+valor);
                if ((valor%2)==0) return "Número par";
                else return "Número ímpar";
                
            }
        
    public int quantidadeDigitosNome(String nome){
        int valor = nome.length();
        return valor;
    }
    
    
    public String comparaNomeCofrinho(Cofrinho a, Cofrinho b){
        double vlrA = a.calculaTotal();
        double vlrB = b.calculaTotal();
        
        if (vlrA>vlrB) return a.getNome();
            else if (vlrB>vlrA) return b.getNome();
            else
                return "Valores iguais";
    }    
    
    public Cofrinho comparaCofrinhos(Cofrinho a, Cofrinho b){
        double vlrA = a.calculaTotal();
        double vlrB = b.calculaTotal();
        
        if (vlrA>vlrB) return a;
            else if (vlrB>vlrA) return b;
            else
                return null;
    }
    
   public String estudante(double a, double b){
       if (((a+2*b)/3)>=6) return "Aprovado";
       else {
           Teclado t= new Teclado();
           double notaC = t.leInt("Digite a nota do grauC");
           if (a>b) {
               if (((a+2*notaC)/3)>=6) return "Aprovado";
               else{
                return "Reprovado";}
           }
           else
           
         
        }
    }
