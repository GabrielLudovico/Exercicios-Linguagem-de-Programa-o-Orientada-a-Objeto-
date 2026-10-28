import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continua;
        ArrayList<OrdemServico> listaOS = new ArrayList();
        do{
            System.out.println("Menu:\n1-Registrar OS\n2-Alterar Status\n3-Registrar Orçamento\n4-Pesquisar OS\n5-Exibir todas as OS\n6-Encerrar");
            int menu = teclado.nextInt();
            teclado.nextLine();
            switch (menu){
                case 1:
                    //DONE - REGISTRAR OS
                    System.out.println("Informe o nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Informe o equipamento: ");
                    String equipamento = teclado.nextLine();
                    System.out.println("Descrição do problema: ");
                    String descricao = teclado.nextLine();
                    int id = listaOS.size() + 1;
                    OrdemServico os = new OrdemServico(id, equipamento, descricao, nome);
                    listaOS.add(os);
                    System.out.println("Ordem de serviço registrada com sucesso!");
                    continua = true;
                    break;
                case 2:
                    //DONE - ALTERAR STATUS DA OS
                    System.out.println("Informe o ID da OS: ");
                    int idOS = teclado.nextInt();
                    teclado.nextLine(); //TODA VEZ QUE EU FOR LER UMA STRING DEPOIS DE UM NUMERO, PRECISO DE UM NEXTLINE
                    OrdemServico osASerAlterada = pesquisarOS(idOS, listaOS);
                    if(osASerAlterada == null){
                        System.out.println("Ordem de serviço não encontrada!");
                    }else{
                        System.out.println("Informe o novo status: ");
                        String novoStatus = teclado.nextLine();
                        alterarStatus(novoStatus, osASerAlterada);
                        System.out.println("Status alterado com sucesso!");
                    }
                    continua = true;
                    break;
                case 3:
                    //TODO REGISTRAR ORÇAMENTO DA OS
                    continua = true;
                    break;
                case 4:
                    //TODO PESQUISAR OS PELO ID
                    continua = true;
                    break;
                case 5:
                    //TODO EXIBIR TODAS AS OS
                    continua = true;
                    break;
                case 6:
                    System.out.println("Encerrando");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continua = true;
                    break;
            }
        }while (continua);
    }
    public static OrdemServico pesquisarOS(int id, ArrayList<OrdemServico> listaOS){
//        for(int i = 0; i < listaOS.size(); i++){ //FOR CLÁSSICO
//
//        }
        for(OrdemServico ordemServicoAtual : listaOS){ //FOR-EACH
            if(ordemServicoAtual.getId() == id){
                return ordemServicoAtual;
            }
        }
        return null;
    }
    public static void alterarStatus(String status, OrdemServico os){
        os.setStatus(status);
    }

}