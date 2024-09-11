package Aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Alana");
        aluno.setEndereco("Rua da casa dele");
        aluno.setIdade(25);

        aluno.exibirInformacao();
    }
}
