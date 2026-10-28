import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continua = true;
        double totalVendido = 0;
        int qtdVendas = 0;
        int qtdDescontos = 0;

        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("\nVENDA " + (i + 1));

                System.out.println("Nome do cliente: ");
                String nome = teclado.nextLine();
                System.out.println("Valor da compra: ");
                double valorCompra = teclado.nextDouble();
                System.out.println("Forma de pagamento: \n1-Pix \n2-Cartão \n3-Dinheiro");
                int pagamento = teclado.nextInt();
                System.out.println("Tipo de cliente: \n1-Comum \n2-Fidelidade");
                int tipoCliente = teclado.nextInt();
                teclado.nextLine();

                double desconto = 0;
                if (tipoCliente == 2 && valorCompra >= 100) {
                    desconto = valorCompra * 0.10;
                } else if (tipoCliente == 1 && valorCompra >= 200 && pagamento == 1) {
                    desconto = valorCompra * 0.05;
                }

                double valorFinal = valorCompra - desconto;
                if (desconto > 0) {
                    qtdDescontos++;
                }

                totalVendido += valorFinal;
                qtdVendas++;

                System.out.println("\nRESUMO DA VENDA");
                System.out.println("Cliente: " + nome);
                System.out.println("Valor original: R$ " + valorCompra);

                if (desconto > 0) {
                    System.out.println("Desconto: R$ " + desconto);
                }

                System.out.println("Valor final: R$ " + valorFinal);
            }

            System.out.println("\n=== RESUMO ===");
            System.out.println("Valor total vendido até o momento: R$ " + totalVendido);
            System.out.println("Quantidade de vendas até o momento: " + qtdVendas);
            System.out.println("Clientes que receberam desconto: " + qtdDescontos);

            System.out.println("\nDeseja registrar novas vendas? \n1-Sim \n2-Não");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 2) {
                System.out.println("\nExpediente encerrado.");
                continua = false;
            }

        } while (continua);

        System.out.println("\nTOTAL DO DIA");
        System.out.println("Valor total vendido: R$ " + totalVendido);
        System.out.println("Quantidade de vendas: " + qtdVendas);
        System.out.println("Clientes que receberam desconto: " + qtdDescontos);
        teclado.close();
    }
}