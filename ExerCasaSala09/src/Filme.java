public class Filme {
    //ATRIBUTOS DA CLASSE
    String nomeFilme;
    int codigo;
    int duracaoMinutos;
    int classificacao;
    String genero;

    //METODOS
    public String exibirInformacoesFilme(){
        return "Nome: " + nomeFilme + "\nCodigo: " + codigo + "\nDuração: " + duracaoMinutos + "minutos\nClassificaçao: " + classificacao + "\nGenero: " + genero;
    }

}
