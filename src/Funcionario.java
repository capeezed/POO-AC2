public class Funcionario extends FuncionarioBase {

    private double salario = salarioBase;

    public Funcionario(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularSalario(){
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return "Nome: " + getNome() + ", Salário: " + calcularSalario();
    }

}
