public abstract class FuncionarioBase {

    private String nome;
    protected double salarioBase;

    public FuncionarioBase(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public double calcularSalario(){
        return salarioBase;
    }

    public double calcularSalario(double bonusAdicional){
        return salarioBase + bonusAdicional;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }



}
