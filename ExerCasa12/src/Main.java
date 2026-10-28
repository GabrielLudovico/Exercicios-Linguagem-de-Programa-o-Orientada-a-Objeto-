import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pedido pedido = new Pedido();
        System.out.println("SISTEMA DE DELIVERY");

        System.out.println("Nome do cliente:");
        String nome = teclado.nextLine();
        pedido.setNomeCliente(nome);

        System.out.println("Valor dos produtos:");
        double valor = teclado.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor dos produtos inválido");
        } else {

            pedido.setValorProdutos(valor);
            System.out.println("Distância da entrega em km:");
            double distancia = teclado.nextDouble();

            if (distancia <= 0) {
                System.out.println("Distância inválida");
            } else {

                pedido.setDistancia(distancia);
                System.out.println("Tipo de entrega:\n1-Normal\n2-Expressa");
                int tipo = teclado.nextInt();

                if (tipo != 1 && tipo != 2) {
                    System.out.println("Tipo de entrega inválido");
                } else {

                    pedido.setTipoEntrega(tipo);
                    System.out.println("Forma de pagamento:\n1-Pix\n2-Cartão\n3-Dinheiro");
                    int pagamento = teclado.nextInt();

                    if (pagamento < 1 || pagamento > 3) {
                        System.out.println("Forma de pagamento inválida");
                    } else {

                        pedido.setFormaPagamento(pagamento);
                        System.out.println("\nRESUMO DO PEDIDO");
                        System.out.println("Cliente: " + pedido.getNomeCliente());
                        System.out.println("Valor dos produtos: R$ " + pedido.getValorProdutos());
                        System.out.println("Taxa de entrega: R$ " + pedido.calcularTaxaEntrega());

                        if (pedido.calcularDesconto() > 0) {
                            System.out.println("Desconto: R$ " + pedido.calcularDesconto());
                        }
                        System.out.println("Valor final: R$ " + pedido.calcularValorFinal());
                    }
                }
            }
        }

        teclado.close();
    }
}