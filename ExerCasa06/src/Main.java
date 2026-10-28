import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[10];
        String[] cpfs = new String[10];
        int[] noites = new int[10];

        System.out.println("=== Cadastro das Reservas ===");
         for (int i = 0; i < 10; i++) {
             System.out.println("\nQuarto " + (i + 1) + ":");
                System.out.print("Nome do hóspede: ");
                nomes[i] = teclado.nextLine();
                System.out.print("CPF do hóspede: ");
                cpfs[i] = teclado.nextLine();
                System.out.print("Quantidade de noites: ");
                noites[i] = teclado.nextInt();
                teclado.nextLine();
             }

                int totalNoites = 0;
                int maiorNoites = 0;
                String hospedeMaisNoites = "";
                System.out.println("\\n=== Relatório de Reservas ===");
                    for (int i = 0; i < 10; i++) {
                System.out.println("Quarto " + (i + 1) + "\nHóspede: " + nomes[i] + "\nCPF: " + cpfs[i] +"\nNoites: " + noites[i]);
                totalNoites += noites[i];
                    if (noites[i] > maiorNoites) {
                        maiorNoites = noites[i];
                        hospedeMaisNoites = nomes[i];
                }
                    }

                System.out.println("Total de noites reservadas no hotel: " + totalNoites);
                System.out.println("Hóspede que ficará mais tempo: " + hospedeMaisNoites);
                System.out.println("Quantidade de noites da maior hospedagem: " + maiorNoites + " noite(s)"); teclado.close();
    }
}