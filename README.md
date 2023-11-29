# rpg-equipe-32
public class PersonagemCarlos {
    String classe;
    int level;
    String habilidadePrincipal;


    public void mostrarStatusCarlos() {
        System.out.format("Classe: %s\nLevel: %d\nHabilidade Principal: %s\n", classe, level, habilidadePrincipal);
    }

    public void buffAprendiz(String aliadoCarlos) {
        System.out.println("Gera um impulso de inspiração no aliado, aumentando a inteligência em 10% por dois turnos!");


    }

    void ataqueAprendiz(String Imitação) {
        System.out.println("Carlos copia a última habilidade utilizada por um aliado ou inimigo, dobrando o dano e o custo de mana!");
    }

    public void buffDruida(String aliadoCarol) {
        System.out.println("Recebe 20% de regeneração de vida de Carol!");
    }

}