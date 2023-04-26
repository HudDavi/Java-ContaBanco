import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        int Numero;
        String Agencia;
        String NomeCliente;
        float Saldo;
        try (Scanner Valor = new Scanner(System.in, "UTF-8")) {
            System.out.println("Por favor, digite o Número da Conta e tecle ENTER!");
            Numero = Valor.nextInt();

            System.out.println("Por favor, digite o Número da Agência e tecle ENTER!");
            Agencia = Valor.next();

            System.out.println("Por favor, digite o Nome do Cliente e tecle ENTER!");
            Valor.nextLine();
            NomeCliente = Valor.nextLine();

            System.out.println("Por favor, digite o Saldo da Conta e tecle ENTER!");
            Saldo = Valor.nextFloat();

            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + Agencia + ", Conta " + Numero + " e seu Saldo " + Saldo + " já está disponível para saque!");
        }
    }
}
