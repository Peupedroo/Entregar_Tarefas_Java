public class Produtos extends Cadastro {
    private String codigo = "900921";
    private String nome = "feijao ";
    private int estoque = 10;
    private int peso = 1;
    private double valorkg = 6.5;
    private double valorTotal =  valorkg * peso;
    private int quantidade ;
    private double dinheiro;

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setDinheiro (double dinheiro){
        this.dinheiro = dinheiro;
    }
    public void setValortotal(double valortotal){
        this.valorTotal = valortotal;
    }
    public void Venda(String metodoPagamento) {
        double valorFinal = valorTotal * quantidade;


        if (metodoPagamento.equals("Pix") || metodoPagamento.equals("Especie") ||
                metodoPagamento.equals("Transferência") || metodoPagamento.equals("Debito")) {
            valorFinal = valorFinal * 0.95;
        }


        if (metodoPagamento.equals("Credito")) {
            System.out.printf("O valor pode ser parcelado em 3x de R$ %.2f sem juros%n", valorFinal / 3);
        }

        if (dinheiro == valorFinal) {
            System.out.println("Pagamento realizado com sucesso. O valor total foi: R$ " + valorFinal);
        } else if (dinheiro > valorFinal) {
            double troco = dinheiro - valorFinal;
            System.out.printf("Pagamento realizado com sucesso. O valor total foi: R$ %.2f%n", valorFinal);
            System.out.printf("Seu troco é: R$ %.2f%n", troco);
        } else {
            System.out.println("Dinheiro insuficiente para completar a compra.");
        }
    }



    public void Compra (){
        if (quantidade >= estoque) {
            System.out.printf("o estoque tem %d entao so podemos vender isso", estoque);
            estoque = 0;
            System.out.println(estoque);


        }else if (quantidade < estoque){
           estoque -= quantidade;

        }
    }





}

