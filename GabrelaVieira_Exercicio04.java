/*Uma classe chamada "Vovoh" que tenha um metódo construtor
Autora: Gabriela
Data: 07/06/2023
*/

public class GabrielaVieira_Exercicio04 {
    public static void main (String [] args) {
       
    }

   class Vovoh {
       String nom;
       int ida;

        // Usando o método construtor
        Vovoh(String nom, int ida) {
            this.nom = nom;
            this.ida = ida;
        }

        // Getters e Setters
        String getNom() {
            return nom;
        }

        void setNome(String nom) {
            this.nom = nom;
        }

        int getIda() {
            return ida;
        }

        void setIda(int ida) {
            this.ida = ida;
        }
       
    }
}
