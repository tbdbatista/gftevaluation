package modelo;

public class Modelo {

    private String nome;
    private int altura;
    private int peso;
    private int idade;
    private String trabalho;

    public String getTrabalho() {
        return trabalho;
    }

    protected void setTrabalho() {
        this.trabalho = "Malhação";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarDados(){
        System.out.println(Modelo);
    }
}


//      Crie a classe Modelo (atributos nome, altura, peso e idade) e a classe Ator
//      (atributo nivelAtor), herança de Modelo. Tanto o Ator como Modelo podem
//        participar de alguns trabalhos. Porem, Ator só grava Novelas e Modelo só grava
//        Malhação. Implemente um método mostrarDados que exibe nome e o trabalho
//        de todos.