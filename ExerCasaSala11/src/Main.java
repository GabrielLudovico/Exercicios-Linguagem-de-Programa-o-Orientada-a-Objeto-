
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto1 = new Produto();
        boolean continua = true;

        //cadastro de produtos
        produto1.setCodigo(1);
        produto1.setPreco(20);
        produto1.setNome("Arroz");
        produto1.setQtdEstoque(15);

        System.out.println("Gerenciamento de Estoque");
        do{
            System.out.println("Menu\n1-Exibir Dados do Produto\n2-Registrar Entrada\n3-Registrar Saída\n4-Alterar Preço\n5-Encerrar");
            int menu = teclado.nextInt();
            switch (menu){
                case 1:
                    //DONE - exibir dados do produto
                    //System.out.println(produto1.showProduto());//MÉTODO CRIADO MANUALMENTE
                    System.out.println(produto1.toString()); //MÉTODO GERADO PELO INTELLIJ
                    break;
                case 2:
                    //DONE - REGISTRAR ENTRADA NO ESTOQUE
                    System.out.println("Informe a quantidade de entrada: ");
                    int qtdEntrada = teclado.nextInt();
                    produto1.registrarEntrada(qtdEntrada);
                    break;
                case 3:
                    //DONE - REGISTRAR SAÍDA DO ESTOQUE
                    System.out.println("Informe a quantidade de saída: ");
                    int qtdSaida = teclado.nextInt();
                    produto1.registrarSaida(qtdSaida);
                    break;
                case 4:
                    //DONE - ALTERAR PREÇO DO PRODUTO;
                    System.out.println("Informe o novo preço: ");
                    double preco = teclado.nextDouble();
                    produto1.setPreco(preco);
                    break;
                case 5:
                    System.out.println("Encerrando Sistema");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                    }
                }while (continua);


    }
}