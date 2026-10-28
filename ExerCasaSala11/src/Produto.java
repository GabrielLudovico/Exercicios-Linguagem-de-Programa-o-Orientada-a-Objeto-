public class Produto {
    //MODIFICADORES DE ACESSO:
    //1 - PUBLIC
    //2 - PRIVATE
    //3 - PROTECTED
    //4 - DEFAULT
    private int codigo; //modificadores de acesso: 1 - Private - o elemento só pode ser acessado dentro da própria classe
    private String nome;
    private double preco;
    private int qtdEstoque;

    public String showProduto(){ //MÉTODO CRIADO MANUALMENTE
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: " + preco + " | Quantidade: " + qtdEstoque;
    }

    @Override
    public String toString() { //MÉTODO GERADO AUTOMATICAMENTE PELO INTELLIJ - BOTÃO DIREITO / GENERATE / toString
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: " + preco + " | Quantidade: " + qtdEstoque;
    }

    public void registrarEntrada(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade inválida!");
        }else {
            System.out.println("Entrada de " + qtd + " registrada!");
            qtdEstoque += qtd;
        }
    }
    public void registrarSaida(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade inválida!");
        }else{
            System.out.println("Saída de " + qtd + " registrada!");
            qtdEstoque -= qtd;
        }
    }

    //botão direito / generate / Getter and Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <=0 ){
            System.out.println("Preço inválido!");
        }else{
            this.preco = preco;
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}