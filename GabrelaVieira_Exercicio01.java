/*Uma classe chamada "Alimento" e atribuindo 10 atributos a ela
Autora: Gabriela
Data: 07/06/2023

*/
public class GabrelaVieira_Exercicio01 {
    public static void main (String [] args) {

    /*CRIA UMA INSTÂNCIA DA CLASSE ALIMENTO */
    Alimento comida = new Alimento(null, null, 0, 0, false, false, false, null, null, null);

    
    public class Alimento {
       String nome, tipo, fabricante, Validade;
       String[] ingredientes;
       double preco;
       int quantidade;
       boolean vegano, semGluten, lactose;
        
        
    
        // Construtor
        public Alimento(String nome, String tipo, double preco, int quantidade, boolean vegano,
                        boolean semGluten, boolean lactose, String dataValidade, String fabricante,
                        String[] ingredientes) {
            this.nome = nome;
            this.tipo = tipo;
            this.preco = preco;
            this.quantidade = quantidade;
            this.vegano = vegano;
            this.semGluten = semGluten;
            this.lactose = lactose;
            this.Validade = dataValidade;
            this.fabricante = fabricante;
            this.ingredientes = ingredientes;
        }
    
        // Getters e Setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
    
        public int getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    
        public boolean isVegano() {
            return vegano;
        }
    
        public void setVegano(boolean vegano) {
            this.vegano = vegano;
        }
    
        public boolean isSemGluten() {
            return semGluten;
        }
    
        public void setSemGluten(boolean semGluten) {
            this.semGluten = semGluten;
        }
    
        public boolean isLactose() {
            return lactose;
        }
    
        public void setLactose(boolean lactose) {
            this.lactose = lactose;
        }
    
        public String getDataValidade() {
            return Validade;
        }
    
        public void setDataValidade(String dataValidade) {
            this.Validade = dataValidade;
        }
    
        public String getFabricante() {
            return fabricante;
        }
    
        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }
    
        public String[] getIngredientes() {
            return ingredientes;
        }
    
        public void setIngredientes(String[] ingredientes) {
            this.ingredientes = ingredientes;
        }
    
    }
}
