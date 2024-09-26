import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);
        String continuar;

        System.out.println("vc precisa calcular sua media ? S/N ");
        String pergunta = sc.nextLine();

        if (pergunta.equalsIgnoreCase("S")){
            do {
                System.out.println("informe seu nome");
                a.setNome(sc.nextLine());

                System.out.println("informe sua primeira nota " + a.getNome());
                a.setNota1(sc.nextDouble());

                System.out.println("informe sua segunda nota " + a.getNome());
                a.setNota2(sc.nextDouble());

                System.out.println("infome sua terceira nota " + a.getNome());
                a.setNota3(sc.nextDouble());

                sc.nextLine();

                double media = a.calcMedia();

                System.out.println("vc foi " +a.getNome());
                a.verificarAprovacao();

                System.out.println(media);

                a.detalhes();

                System.out.println("se quiser continuar aperte C");
                continuar  = sc.nextLine();
            } while(continuar.equalsIgnoreCase("C"));
            System.out.println("vc saiu");
        }
        else{
            System.out.println("vc escolheu nao0 a");

        }




            }
}