public class Main {

    public static void main(String[] args) {

    Departamento ti = new Departamento("TI");

    Funcionario f = new Funcionario("João", 3000);
    Gerente g = new Gerente("Maria", 5000, 20);
    Diretor d = new Diretor("Carlos", 10000,30, 2000 );

    ti.adicionarFuncionario(f);
    ti.adicionarFuncionario(g);
    ti.adicionarFuncionario(d);

    //imprimindo folha salarial
    System.out.println(ti.calcularFolhaSalarial());

    //imprimindo salario e nome dos funcionarios
    ti.imprimirSalarioFuncionarios();


    }

}
