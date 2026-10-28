import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE VENDA DE INGRESSOS");
        Scanner teclado = new Scanner(System.in);
        boolean continua;
        double valorTotal;
        double valorTotalArrecadado = 0;

        // ENTRADA DE DADOS
        do {
            System.out.println("Informe o nome do cliente: ");
            String nome = teclado.nextLine();
            System.out.println("Informe o tipo de sala\n1-Convencional\n2-VIP:");
            int sala = teclado.nextInt();
            System.out.println("Quantidade de ingressos: ");
            int qtdIngressos = teclado.nextInt();
            System.out.println("Possui parceria?\n1-Sim\n2-Não:");
            int parceria = teclado.nextInt();
            teclado.nextLine();

            if (parceria == 1) {
                System.out.println("Informe a empresa parceira:\n1-SENAC\n2-SESC\n3-CNI");
                int empresa = teclado.nextInt();

                if (validarParceria(empresa)) {
                    System.out.println("Parceria válida!");
                    valorTotal = calcularValorTotal(sala, qtdIngressos, 10);
                    System.out.println("Valor total com desconto: " + valorTotal);

                } else {
                    System.out.println("Parceria inválida!");
                    valorTotal = calcularValorTotal(sala, qtdIngressos);
                    System.out.println("Valor sem desconto: " + valorTotal);
                }

            } else {
                valorTotal = calcularValorTotal(sala, qtdIngressos);
                System.out.println("Valor da compra: " + valorTotal);
            }

            System.out.println("Deseja receber comprovante?\n1-Sim\n2-Não");
            int comprovante = teclado.nextInt();

            if (comprovante == 1) {
                imprimirComprovante(nome, sala, qtdIngressos, valorTotal);
            }
            valorTotalArrecadado = calcularValorTotalArrecadado(valorTotalArrecadado, valorTotal);

            System.out.println("Deseja registrar uma nova venda?\n1-Sim\n2-Não");
            int opcao = teclado.nextInt();

            if (opcao == 1) {
                continua = true;

            } else {
                System.out.println("SISTEMA ENCERRANDO");
                System.out.println("Valor total arrecadado: " + valorTotalArrecadado);
                continua = false;
            }
            teclado.nextLine();

        } while (continua);
        teclado.close();
    }


    public static double calcularValorTotal(int sala, int qtdIngressos) {
        if (sala == 1) {
            return 30 * qtdIngressos;
        }
        return 50 * qtdIngressos;
    }


    public static double calcularValorTotal(
            int sala,
            int qtdIngressos,
            double porcentagemDesconto) {

        double valorTotal;

        if (sala == 1) {
            valorTotal = 30 * qtdIngressos;
        } else {
            valorTotal = 50 * qtdIngressos;
        }
        return valorTotal -
                (valorTotal * porcentagemDesconto / 100);
    }


    public static void imprimirComprovante(
            String nome,
            int sala,
            int qtdIngressos,
            double valorTotal) {

        System.out.println("Comprovante");
        System.out.println(
                "Cliente: " + nome + "\nTipo de sala: " + sala + "\nQuantidade de ingressos: " + qtdIngressos + "\nValor pago: " + valorTotal
        );
    }


    public static double calcularValorTotalArrecadado(
            double valorTotalArrecadado,
            double valorTotal) {
        return valorTotalArrecadado += valorTotal;
    }


    public static boolean validarParceria(int empresa) {

        switch (empresa) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default:
                return false;
        }
    }
}