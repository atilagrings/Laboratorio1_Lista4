public class testeFuncionario{
    public static void main(String[] args){
        Teclado t= new Teclado();
        Funcionario f1 = new Funcionario(   t.leString("\fDigite o nome do funcionario"),
                                            t.leInt("Qual o departamento? - número"),
                                            t.leString("Nome do departamento"),
                                            t.leDouble("Digite o salário do funciário"));
                                        
        int reajuste = t.leInt("\fQual o código do reajuste?\n1 - Reajusta 20%\n2 - Reajusta 5%\n3 - Reajusta 13%");
        double antigoSalario = f1.getSalario();
        
        if (reajuste >=1 && reajuste <=3) {
            f1.reajustaSalario(reajuste); 
            System.out.println("\f---------------------------------------------------------------------");
            System.out.println("Nome Funcionario\tSalarioAntigo\tNovoSalario\tNomeDpto");
            System.out.println(f1.getNome()+"\t\t\t"+antigoSalario+"\t\t"+f1.getSalario()+"\t\t"+f1.getDepartamento().getNome());
        }
        
    }
}


