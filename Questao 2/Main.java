//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Produtos p = new Produtos();

        int entrar = scanner.nextInt();
        scanner.nextLine();
        if (entrar == 1) {
            do {
                System.out.printf("vc quer comprar feijao %n digite seu nome : ");
                p.setNome(scanner.nextLine());

                System.out.println("digite sua idade ");
                p.setIdade(scanner.nextInt());
                scanner.nextLine();

                System.out.println("digite seu cpf");
                p.setCpf(scanner.nextLine());

                System.out.println("quantos feijoes vc quer comprar");
                p.setQuantidade(scanner.nextInt());

                System.out.println("quanto dinheiro vc tem");
                p.setDinheiro(scanner.nextDouble());
                scanner.nextLine();

                System.out.println("Qual o método de pagamento? (Pix, Espécie, Transferência, Débito ou Crédito)");
                String metodoPagamento = scanner.nextLine();

                p.Compra();
                p.Venda(metodoPagamento);

                System.out.println("Digite 1 para continuar comprando ou 0 para sair:");
                entrar = scanner.nextInt();
                scanner.nextLine();



            }while (entrar != 0);

            scanner.close();
        }
    }
}