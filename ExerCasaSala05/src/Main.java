import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistema de check-in");
        String[] nomes = new String[30];
        String[] cpfs = new String[30];
        int[] poltronas = new int[30];
        boolean continua = true;
        int qtdPassageiros = 0;

        for (int i = 0; i <30; i++) {
            System.out.println("Informe o nome do passageiro " + (i+1) + ": ");
            nomes[i] = teclado.nextLine();
            
            System.out.println("Informe o cpf do passageiro " + (i+1) + ": ");
            cpfs[i] = teclado.nextLine();

            continua = true;

            while (continua) {
                System.out.println("informe a poltrona do passageiro " + (i + 1) + ": ");
                poltronas[i] = teclado.nextInt();
                if (poltronas[i] <= 0 || poltronas[i] > 30) {
                    System.out.println("Poltrona deve seer um numero entre 1 e 30");
                    continua = true;
                } else {
                    continua = false;
                }
            }
            teclado.nextLine();

            System.out.println("Check-in para o passageiro " + nomes[i] + " realizado com sucesso!");
            qtdPassageiros++;

            System.out.println("Deseja realizar um novo check-in? \n1-Sim \n2-Não");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            if (opcao == 2){
                System.out.println("Check-in encerrado");
                break;
            }
        }

        for (int i = 0; i < qtdPassageiros; i++) {
            System.out.println("Quantidade de passgeiro: " + qtdPassageiros);
            System.out.println("Nome do passageiro " + (i+1) + ": " + nomes[i]);
            System.out.println("CPF do passageiro " + (i+1) + ": " + cpfs[i]);
            System.out.println("Poltrona do passageiro " + (i+1) + ": " + poltronas[i]);
        }

    }
}
