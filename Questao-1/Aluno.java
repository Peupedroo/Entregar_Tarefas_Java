public class Aluno {
    private double nota1, nota2, nota3, media;
    String nome;



    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    public void setMedia (double media){
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcMedia(){
        media = (nota1+nota2+nota3)/ 3;
        return media;
    }

    public void verificarAprovacao(){
        if (media >= 7){
            System.out.println("vc ta aprovado");
        } else if (media>= 5) {
            System.out.println("ta de rec");

        }else{
            System.out.println("reprovado");
        }


    }
    public void detalhes (){
        System.out.println(nome);
        System.out.println(media);
        verificarAprovacao();
    }



}
