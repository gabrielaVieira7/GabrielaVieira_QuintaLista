/*Uma classe chamada "Alimento" e atribuindo 10 atributos a ela
Autora: Gabriela
Data: 07/06/2023

*/
/*Uma classe chamada "Alimento" e atribuindo 10 atributos a ela
Autora: Gabriela
Data: 07/06/2023

*/
public class GabrielaVieira_Exercicio01 {
    public static void main (String [] args) {
    }

    class Alimento {
       String nome, textura, gosto, validade, forma;
       String[] cheiro;
       double preco;
       int quantidade;
       boolean vegano, lactose;        
    
        // Método Construtor
        public Alimento(String nome, String textura, String forma, double preco, int quantidade, boolean vegano,
                       boolean lactose, String validade, String gosto,
                        String[] cheiro) {
            this.nome = nome;
            this.textura = textura;
            this.forma = forma;
            this.preco = preco;
            this.quantidade = quantidade;
            this.vegano = vegano;
            this.lactose = lactose;
            this.validade = validade;
            this.gosto = gosto;
            this.cheiro = cheiro;
        }
    }
}
