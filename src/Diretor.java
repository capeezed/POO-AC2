public class Diretor extends FuncionarioBase {

    protected double salario = salarioBase;
    protected double bonusPercentual;
    protected double auxilioMoradia;

    public Diretor(String nome, double salario, double bonusPercentual, double auxilioMoradia ){
        super(nome,salario);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }

    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public double calcularSalario(){
        return salario + (salario * bonusPercentual / 100) + auxilioMoradia;
    }

    public double calcularBonus(double percentual){
        return salario * percentual;
    }

    public double calcularAuxilio(double auxilio){
        return salario + auxilio;
    }

}
