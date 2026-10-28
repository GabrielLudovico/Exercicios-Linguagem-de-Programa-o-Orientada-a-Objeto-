import java.util.Scanner;

public static class main {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[3];
        Scanner teclado = new Scanner(System.in);
        boolean interromper;
        int menu;
       cadastrarFilme(filmes);
        System.out.println("Streaming de Filmes");
        do {
            System.out.println("Menu:\n1-exibir catalogo\n2-assistir filme\n3-encerrar");
            menu = teclado.nextInt();
            switch (menu){
                case 1:
                    exibirCatalogo(filmes);
                    interromper = false;
                    break;
                case 2:
                    if (assistirFilme(filmes, teclado)) {
                        interromper = true;
                    }else {
                        interromper = false;
                    }
                    interromper = true;
                    break;
                case 3:
                    System.out.println("Encerrando streaming");
                    interromper = true;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    interromper = false;
                    break;
            }

        }while (interromper);
        }

    private static boolean assistirFilme(Filme[] filmes, Scanner teclado) {
        int codigo;
        System.out.println("Informe o codigo do filem: ");
        codigo = teclado.nextInt();
        int codigoInformado = teclado.nextInt();
        for (Filme meuFilme : filmes){
            if (meuFilme.codigo == codigoInformado){
                //O FILME EXISTE
                if (meuFilme.classificacao == 0){
                    //PODE ASSISTIR
                    System.out.println("Iniciando " + meuFilme.nomeFilme);
                    return true;
                }else{
                    System.out.println("Informe a sua idade: ");
                    int idadeInformada = teclado.nextInt();
                    int (idadeInformada >= meuFilme.classificacao){
                        //PODE ASISTIR
                        System.out.println("Iniciando " + meuFilme.nomeFilme);
                        return true;
                    }else{
                        //NAO POSSO ASSISTIR
                        System.out.println("Sua idade não e suficiente para assistir o filme");
                        return true;
                    }
                }
            }
        }
    }

    private static void exibirCatalogo(Filme[] filmes) {
        for (int i = 0; i < filmes.length; i++){
            System.out.println(filmes[i].exibirInformacoesFilme());
        }
        for (Filme filmeAtual : filmes){// for-each

        }
    }
}


    private static void cadastrarFilme(Filme[] filmes){
        Filme meuFilme = new Filme();
        meuFilme.nomeFilme = "Toy Story";
        meuFilme.classificacao = 0;
        meuFilme.codigo =1;
        meuFilme.genero = "Infantil";
        meuFilme.duracaoMinutos = 90;

        Filme filme2 = new Filme();
        filme2.nomeFilme = "Matrix";
        filme2.classificacao = 18;
        filme2.codigo =2;
        filme2.genero = "Sci-fi";
        filme2.duracaoMinutos = 120;

        Filme filme3 = new Filme();
        filme3.nomeFilme = "Velozer e Furiosos Desafio em Tokyo";
        filme3.classificacao = 18;
        filme3.codigo = 3;
        filme3.genero = "Corrido";
        filme3.duracaoMinutos = 120;

        filmes[0] = meuFilme;
        filmes[1] = filme2;
        filmes[2] = filme3;

    }
