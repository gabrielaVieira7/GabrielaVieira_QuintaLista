/*Uma classe chamada "Vovoh" que tenha um metódo construtor
Autora: Gabriela
Data: 07/06/2023
*/

public class GabrelaVieira_Exercicio04 {
    public static void main (String [] args) {
        public class Vovoh {
    private String nome;
    private int idade;

    // Método construtor
    public Vovoh(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Outros métodos da classe
    public void saudacao() {
        System.out.println("Olá, sou a vovó " + nome + " e tenho " + idade + " anos.");
    }
}

    }
}
