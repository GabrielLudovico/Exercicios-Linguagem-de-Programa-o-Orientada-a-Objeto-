import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Reserva> reservas = new ArrayList<>();
        boolean rodando = true;
        int idReserva = 1;

        do {
            System.out.println("\n===== SISTEMA DE RESERVAS =====");
            System.out.println("1 - Cadastrar reserva");
            System.out.println("2 - Informar sala, data e horario");
            System.out.println("3 - Alterar status");
            System.out.println("4 - Consultar reserva");
            System.out.println("5 - Mostrar todas as reservas");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do responsavel: ");
                    String nome = teclado.nextLine();

                    if (nome.isBlank()) {
                        System.out.println("Digite um nome valido!");
                    } else {
                        Reserva reserva = new Reserva(idReserva, nome);
                        reservas.add(reserva);
                        System.out.println("Reserva cadastrada com sucesso!");
                        System.out.println("Numero da reserva: " + idReserva);
                        idReserva++;
                    }
                    break;

                case 2:
                    System.out.print("Numero da reserva: ");
                    int numero = teclado.nextInt();
                    teclado.nextLine();
                    Reserva reserva = buscarReserva(reservas, numero);

                    if (reserva != null) {
                        System.out.print("Sala: ");
                        reserva.setSala(teclado.nextLine());
                        System.out.print("Data: ");
                        reserva.setData(teclado.nextLine());
                        System.out.print("Horario: ");
                        reserva.setHorario(teclado.nextLine());
                        System.out.println("Dados salvos com sucesso!");
                    } else {
                        System.out.println("Reserva nao encontrada!");
                    }
                    break;

                case 3:
                    System.out.print("Numero da reserva: ");
                    numero = teclado.nextInt();
                    teclado.nextLine();
                    reserva = buscarReserva(reservas, numero);

                    if (reserva != null) {
                        System.out.println("\n1 - Agendada");
                        System.out.println("2 - Confirmada");
                        System.out.println("3 - Cancelada");
                        System.out.print("Novo status: ");
                        int status = teclado.nextInt();
                        teclado.nextLine();

                        switch (status) {
                            case 1:
                                reserva.setStatus("Agendada");
                                System.out.println("Status atualizado!");
                                break;

                            case 2:
                                reserva.setStatus("Confirmada");
                                System.out.println("Status atualizado!");
                                break;

                            case 3:
                                reserva.setStatus("Cancelada");
                                System.out.println("Status atualizado!");
                                break;

                            default:
                                System.out.println("Status invalido!");
                        }

                    } else {
                        System.out.println("Reserva nao encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("Numero da reserva: ");
                    numero = teclado.nextInt();
                    teclado.nextLine();
                    reserva = buscarReserva(reservas, numero);

                    if (reserva != null) {
                        System.out.println("\nDADOS DA RESERVA");
                        System.out.println("Numero: " + reserva.getNumero());
                        System.out.println("Responsavel: " + reserva.getNomeResponsavel());
                        System.out.println("Sala: " + reserva.getSala());
                        System.out.println("Data: " + reserva.getData());
                        System.out.println("Horario: " + reserva.getHorario());
                        System.out.println("Status: " + reserva.getStatus());
                    } else {
                        System.out.println("Reserva nao encontrada!");
                    }
                    break;

                case 5:
                    if (reservas.isEmpty()) {
                        System.out.println("Nenhuma reserva cadastrada!");
                    } else {
                        System.out.println("\nLISTA DE RESERVAS");
                        for (Reserva r : reservas) {

                            System.out.println("-------------------------");
                            System.out.println("Numero: " + r.getNumero());
                            System.out.println("Responsavel: " + r.getNomeResponsavel());
                            System.out.println("Sala: " + r.getSala());
                            System.out.println("Data: " + r.getData());
                            System.out.println("Horario: " + r.getHorario());
                            System.out.println("Status: " + r.getStatus());
                        }
                    }
                    break;

                case 6:
                    rodando = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (rodando);
        teclado.close();
    }

    public static Reserva buscarReserva(ArrayList<Reserva> reservas, int numero) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getNumero() == numero) {
                return reservas.get(i);
            }
        }
        return null;
    }
}