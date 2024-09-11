package Musica;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Uma musica aqui");
        musica.setArtista("Um artista aqui");
        musica.setAnoLancamento(2014);
        musica.exibirFichaTecnica();
        musica.avalia(5);
        musica.avalia(9);
        musica.avalia(7);
        musica.media();

        System.out.println("A media das avaliação é: "+musica.media()+"\n");
    }
}
