import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ENTRADA DE DADOS
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistema de Desconto");
        System.out.println("Digite o seu nome:");
        String nome = teclado.nextLine();

        System.out.println("Digite o tipo de cliente: \n(1)-comum  \n(2)-premium");
        int tipoCliente = teclado.nextInt();

        System.out.println("Qual a forma de pagamento: \n(1)-pix \n(2)-cartão \n(3)-boleto");
        int formaPagamento = teclado.nextInt();

        System.out.println("Digite o valor da compra: R$ ");
        double valorCompra = teclado.nextDouble();

        //PROCESSAMENTO DE DADOS
        double valorComDesconto=0;
        double percentualDesconto = 0;
        if (tipoCliente == 1 && formaPagamento == 1 && valorCompra
        >= 200){
            valorComDesconto = valorCompra * 0.9;//10% de desconto
            percentualDesconto = 10;
        } else if (tipoCliente == 1 && (formaPagamento == 2 || formaPagamento == 3) && valorCompra >= 500 ) {
            valorComDesconto = valorCompra * 0.95;//5% de desconto
            percentualDesconto = 5;
        } else if (tipoCliente == 2 && formaPagamento == 1) {
            valorComDesconto = valorCompra * 0.8;//20% de desconto
            percentualDesconto = 20;
        } else if (tipoCliente == 2 && (formaPagamento == 2 || formaPagamento == 3)) {
            valorComDesconto = valorCompra * 0.9; //10% de desconto
            percentualDesconto = 10;
        }

        //SAIDA DE DADOS
        double valorDesconto;
        System.out.print("Nome do cliente: " + nome);
        System.out.print("Desconte de: " + percentualDesconto + "%");
        System.out.print("Valor da compra: " + valorCompra);
        System.out.print("O valor com desconto: " + valorComDesconto);

        if (percentualDesconto >0){
            System.out.print("Compra com desconto");
        } else{
            System.out.print("Compra sem desconto");
        }
    }
}