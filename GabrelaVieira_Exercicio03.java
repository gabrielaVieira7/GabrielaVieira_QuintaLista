/*Uma classe chamada "Casa" e atrribuindo 10 atributos e 6 metódos.
Autora: Gabriela
Data: 07/06/2023
*/

public class GabrelaVieira_Exercicio03 {
    public static void main (String [] args) {
        public class Casa {
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int quartos;
    private int banheiros;
    private boolean possuiGaragem;
    private boolean possuiJardim;
    private boolean possuiPiscina;

    // Métodos da classe
    public void abrirPorta() {
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        System.out.println("Porta fechada.");
    }

    public void ligarLuzes() {
        System.out.println("Luzes ligadas.");
    }

    public void desligarLuzes() {
        System.out.println("Luzes desligadas.");
    }

    public void ligarArCondicionado() {
        System.out.println("Ar condicionado ligado.");
    }

    public void desligarArCondicionado() {
        System.out.println("Ar condicionado desligado.");
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }

    public void setPossuiGaragem(boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }

    public boolean isPossuiJardim() {
        return possuiJardim;
    }

    public void setPossuiJardim(boolean possuiJardim) {
        this.possuiJardim = possuiJardim;
    }

    public boolean isPossuiPiscina() {
        return possuiPiscina;
    }

    public void setPossuiPiscina(boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }
}

    }
    
}
