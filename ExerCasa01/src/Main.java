import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomePessoa = teclado.nextLine();

        System.out.println("Informe o seu endereço: ");
        String endereco = teclado.nextLine();

        System.out.println("Informe o seu telefone celular (somente os numeros): ");
        String telefoneCelular = teclado.nextLine();

        System.out.println("Informe o seu telefone fixo (somente os numeros): ");
        String telefoneFixo = teclado.nextLine();
        if (telefoneFixo.contains(telefoneCelular)){
            System.out.println("O telefone Fixo não pode ser o mesmo do telefone Celular");
        };

        System.out.println("Informe o seu e-mail: ");
        String email = teclado.nextLine();
        if (email.contains("@")){
            System.out.println("E-mail incorreto");
        } else if (nomePessoa.isBlank() || endereco.isBlank() || telefoneFixo.isBlank() || telefoneCelular.isBlank() || email.isBlank()){
            System.out.println("Cadastro inclopeto, preencha novamente.");
        };

        System.out.println("O seu nome é: " +nomePessoa);
        System.out.println("Seu endereço é: " +endereco);
        System.out.println("Seu telefone fixo é: " +telefoneFixo);
        System.out.println("Seu telefone celular é: " +telefoneCelular);
        System.out.println("Seu e-mail é: " +email);

    }
}