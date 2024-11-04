import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<FuncionarioBase> funcionarios;

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
        for(FuncionarioBase funcionario : funcionarios){
            folha += funcionario.calcularSalario();
        }
        return folha;
    }

    public void imprimirSalarioFuncionarios(){
        for(FuncionarioBase funcionarios : funcionarios){
            System.out.println("Nome: " + funcionarios.getNome() + ", Salario: " + funcionarios.calcularSalario());
        }
    }

}
