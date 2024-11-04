public class Gerente extends FuncionarioBase implements Beneficios {

    protected double bonusPercentual;
    protected double salario = salarioBase;

    public Gerente(String nome, double salario, double bonusPercentual){
        super(nome,salario);
        this.bonusPercentual = bonusPercentual;
    }
    @Override
    public double calcularSalario(){
        return salario + (salario * (bonusPercentual / 100));
    }

    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularBonus(double percentual){
        return salario * percentual;
    }

    public double calcularSalario(double bonusAdicional){

    return salario + bonusAdicional;
    }
    @Override
    public double calcularAuxilio(double auxilio) {
        return 0;
    }

    public String toString(){
        return "Nome: " + getNome() + ", Salário: " + calcularSalario();
    }
}
