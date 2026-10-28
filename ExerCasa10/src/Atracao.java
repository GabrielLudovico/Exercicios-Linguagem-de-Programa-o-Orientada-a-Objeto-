public class Atracao {
    String nome;
    int codigo;
    String tipo;
    int duracao;
    double alturaMinima;

    public String exibirInformacoesAtracao() {
        return "Nome: " + nome
                + "\nCodigo: " + codigo
                + "\nTipo: " + tipo
                + "\nDuração: " + duracao + " minutos"
                + "\nAltura mínima: " + alturaMinima;
    }
}
