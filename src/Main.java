public class Main {

    public static void main(String[] args) {

    Departamento ti = new Departamento("TI");

    Funcionario funcionario = new Funcionario("João", 3000);
    Gerente gerente = new Gerente("Maria", 5000, 20);
    Diretor diretor = new Diretor("Carlos", 10000,30, 2000 );

    ti.adicionarFuncionario(funcionario);
    ti.adicionarFuncionario(gerente);
    ti.adicionarFuncionario(diretor);

    //imprimindo folha salarial
    System.out.println("Folha salarial: " + ti.calcularFolhaSalarial());

    //imprimindo salario e nome dos funcionarios
    ti.imprimirSalarioFuncionarios();

  

    }

}
