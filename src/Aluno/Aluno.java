package Aluno;

public class Aluno {
    private int idade;
    private String nome;
    private String endereco;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirInformacao(){
        System.out.println(" A idade do aluno é: "+idade);
        System.out.println("O nome do aluno é: "+nome);
        System.out.println("O endereço do aluno é: "+endereco);


    }

}
