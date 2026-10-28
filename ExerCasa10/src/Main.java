import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atracao[] atracoes = new Atracao[3];
        Scanner teclado = new Scanner(System.in);
        boolean interromper;
        int menu;
        cadastrarAtracoes(atracoes);

        System.out.println("Parque de Diversões");
        do {
            System.out.println("Menu:\n1-Exibir atrações\n2-Escolher atração\n3-Encerrar");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    exibirAtracoes(atracoes);
                    interromper = true;
                    break;

                case 2:
                    if (escolherAtracao(atracoes, teclado)) {
                        interromper = false;
                    } else {
                        interromper = true;
                    }
                    break;

                case 3:
                    System.out.println("Encerrando parque de diversões");
                    interromper = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    interromper = true;
                    break;
            }
        } while (interromper);
        teclado.close();
    }

    public static boolean escolherAtracao(
            Atracao[] atracoes,
            Scanner teclado) {
        System.out.println("Informe o código da atração: ");
        int codigoInformado = teclado.nextInt();

        for (Atracao minhaAtracao : atracoes) {
            if (minhaAtracao.codigo == codigoInformado) {
                if (minhaAtracao.alturaMinima == 0) {
                    System.out.println("Atração " + minhaAtracao.nome + " liberada");
                    return true;
                } else {
                    System.out.println("Informe a sua altura: ");
                    double alturaInformada = teclado.nextDouble();
                    if (alturaInformada >= minhaAtracao.alturaMinima) {
                        System.out.println("Atração " + minhaAtracao.nome + " liberada");
                        return true;
                    } else {
                        System.out.println("Sua altura não é suficiente para entrar na atração");
                        return false;
                    }
                }
            }
        }
        System.out.println("Atração não encontrada!");
        return false;
    }

    public static void exibirAtracoes(Atracao[] atracoes) {
        for (int i = 0; i < atracoes.length; i++) {
            System.out.println(atracoes[i].exibirInformacoesAtracao());
        }
    }

    public static void cadastrarAtracoes(Atracao[] atracoes) {

        Atracao atracao1 = new Atracao();
        atracao1.nome = "Montanha Russa";
        atracao1.codigo = 1;
        atracao1.tipo = "Radical";
        atracao1.duracao = 5;
        atracao1.alturaMinima = 1.40;

        Atracao atracao2 = new Atracao();
        atracao2.nome = "Roda Gigante";
        atracao2.codigo = 2;
        atracao2.tipo = "Familiar";
        atracao2.duracao = 10;
        atracao2.alturaMinima = 0;

        Atracao atracao3 = new Atracao();
        atracao3.nome = "Torre de Queda";
        atracao3.codigo = 3;
        atracao3.tipo = "Radical";
        atracao3.duracao = 3;
        atracao3.alturaMinima = 1.50;

        atracoes[0] = atracao1;
        atracoes[1] = atracao2;
        atracoes[2] = atracao3;
    }
}