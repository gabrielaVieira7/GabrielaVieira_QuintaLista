/*Uma classe chamada "Casa" e atrribuindo 10 atributos e 6 métodos.
Autora: Gabriela
Data: 12/06/2023
*/

public class GabrielaVieira_Exercicio03 {
    public static void main (String [] args) {
    }
}
        
   //Atribuindo 10 atributos da classe Casa     
        class Casa {
            String endereco;
            int numero;
            String bairro;
            String cidade;
            String estado;
            int quartos;
            int banheiros;
            boolean sotao;
            boolean possuiSala;
            boolean possuiSaladeEstar;
        
 // Métodos da classe Casa
void abrirPorta() {
    System.out.println("Porta aberta.");
}

void fecharPorta() {
    System.out.println("Porta fechada.");
}

void ligarLuzes() {
    System.out.println("Luzes ligadas.");
}

void desligarLuzes() {
    System.out.println("Luzes desligadas.");
}

void ligarArCondicionado() {
    System.out.println("Ar condicionado ligado.");
}

void desligarArCondicionado() {
    System.out.println("Ar condicionado desligado.");
}

// Usando o métodos Getters e Setters
String getEndereco() {
    return endereco;
}

void setEndereco(String endereco) {
    this.endereco = endereco;
}

int getNumero() {
    return numero;
}

void setNumero(int numero) {
    this.numero = numero;
}

String getBairro() {
    return bairro;
}
void setBairro(String bairro) {
    this.bairro = bairro;
}

String getCidade() {
    return cidade;
}

void setCidade(String cidade) {
    this.cidade = cidade;
}

String getEstado() {
    return estado;
}

void setEstado(String estado) {
    this.estado = estado;
}

int getQuartos() {
    return quartos;
}

void setQuartos(int quartos) {
    this.quartos = quartos;
}

int getBanheiros() {
    return banheiros;
}

void setBanheiros(int banheiros) {
    this.banheiros = banheiros;
}

boolean issotao() {
    return sotao;
}

void setsotao(boolean sotao) {
    this.sotao = sotao;
}

boolean ispossuiSaladeEstar() {
    return possuiSaladeEstar;
}

void setpossuiSaladeEstar(boolean possuiSaladepossuiSaladeEstar) {
    this.possuiSaladeEstar = possuiSaladepossuiSaladeEstar;
}

boolean ispossuiSala() {
    return possuiSala;
}
void setpossiuSala(boolean possuiSala) {
    this.possuiSala = possuiSala;
}
}
