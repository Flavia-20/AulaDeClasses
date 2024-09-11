package Musica;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double somaDasAvaliacao;
    private int numAvaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirFichaTecnica(){
        System.out.println("O titulo da musica é: "+titulo);
        System.out.println("O artista responsável: "+artista);
        System.out.println("O ano de lancamento é: "+anoLancamento);

    }

    public void avalia(double notas){
        somaDasAvaliacao += notas;
        numAvaliacao ++;
    }

    double media(){
        return somaDasAvaliacao / numAvaliacao;
    }


}
