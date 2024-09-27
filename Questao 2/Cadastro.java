public class Cadastro {
    protected String nome, cpf;
    protected int idade;

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCpf () {
        return cpf;
    }
}
