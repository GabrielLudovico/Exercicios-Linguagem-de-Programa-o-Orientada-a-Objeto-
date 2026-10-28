import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ENTRADA DE DADOS
        Scanner teclado = new Scanner(System.in);
        System.out.println("Controle de Entrada");
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Diga qual o tipo de ingresso: \n(1)-Comum \n(2)-Vip \n(3)-Meia ");
        int tipoIngresso = teclado.nextInt();

        System.out.println("Informe se possui documento com foto: \n(1)-Sim \n(2)-Não");
        int documentoFoto = teclado.nextInt();


        //PROCESSAMENTO DE DADOS
        int proximoParticipante = 0;
        while (proximoParticipante == 1) {
            if (idade < 16) {
                System.out.println("voçe tem um responsavel presente: (1)-Sim | (2)-Não ");
                int responsavel = teclado.nextInt();

                if (responsavel == 1) {
                    System.out.println("Entrada autorizada");
                } else {
                    System.out.println("Entrada para menores de 16 anos somente com acompanhante");
                }
            } else if (tipoIngresso == 3 && documentoFoto == 1) {
                System.out.println("Entrada autorizada");
            } else {
                System.out.println("Entrada não autorizada");
            }
            if (tipoIngresso == 1 || tipoIngresso == 2) {
                System.out.println("Entrada autorizada");
            } else {
                System.out.println("Entrada não autorizada");
            }

            System.out.println("Informe se a um proximo participante: \n(1)-Sim \n(2)-Não");
            proximoParticipante = teclado.nextInt();
        }
    }
}