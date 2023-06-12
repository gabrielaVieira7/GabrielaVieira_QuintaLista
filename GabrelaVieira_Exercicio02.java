/*Uma classe chamada "Cinto" que tenha 5 metódos
Autora: Gabriela
Data: 07/06/2023
*/

public class GabrelaVieira_Exercicio02 {
    public static void main (String [] args) {
        
           public class Cinto {
    private String material;
    private String cor;
    private int tamanho;
    private boolean fivela;

    // Métodos da classe
    public void apertarCinto() {
        System.out.println("Cinto apertado.");
    }

    public void soltarCinto() {
        System.out.println("Cinto solto.");
    }

    public void ajustarTamanho(int novoTamanho) {
        this.tamanho = novoTamanho;
        System.out.println("Tamanho do cinto ajustado para: " + tamanho);
    }

    public void trocarFivela(String novaFivela) {
        this.fivela = true;
        System.out.println("Fivela do cinto trocada para: " + novaFivela);
    }

    public void exibirDetalhes() {
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Possui fivela: " + (fivela ? "Sim" : "Não"));
    }

    // Getters e Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean hasFivela() {
        return fivela;
    }

    public void setFivela(boolean fivela) {
        this.fivela = fivela;
    }
}
}


        
    }
    
}
