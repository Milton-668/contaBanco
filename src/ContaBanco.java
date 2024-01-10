import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o Usuário:");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        conta = entrada.nextInt();

        System.out.println("Por favor digite o número da Agência:");
        agencia = entrada.next();
        System.out.println();

        System.out.println("Por favor, digite o que deseja ter de saldo:");
        saldo = entrada.nextDouble();

        System.out.println("Olá ".concat(nomeCliente)
                .concat(" obrigado por criar um conta em nosso banco,")
                .concat("sua agência é ".concat(agencia)
                        .concat(", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!")));

    }
}
