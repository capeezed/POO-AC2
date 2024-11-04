import java.util.ArrayList;

public class Departamento {

    private String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(FuncionarioBase funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(FuncionarioBase funcionario){
        funcionarios.remove(funcionario);
    }

    public double calcularFolhaSalarial(){
        double folha = 0;
        for(int i = 0; i < funcionarios.size(); i++){
            folha += funcionarios.get(i).calcularSalario();
        }
        return folha;
    }

    public void imprimirSalarioFuncionarios(){
        for(int i = 0; i < funcionarios.size(); i++){
            FuncionarioBase funcionario = funcionarios.get(i);
            System.out.println("Nome: " + funcionario.getNome() + ", Salario: " + funcionario.calcularSalario());
        }
    }

}
