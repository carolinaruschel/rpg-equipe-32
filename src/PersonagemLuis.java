public class PersonagemLuis {
    String classe;
    int level;
    String habilidadePrincipal;

    public void mostrarStatusLuis() {
        System.out.format("Classe: %s\nLevel: %d\nHabilidade Principal: %s\n", classe, level, habilidadePrincipal);
    }

    public void buffMago(String aliadoLuis) {
        System.out.println("Concede 10% de regeneração de mana!");
    }

    void ataqueMago(String aliadoLuis) {
        System.out.println("Luis usa sua habilidade principal, conjurando uma chuva de meteoros gigantes!");
    }

    public void buffMagoF(String aliadoFelipe) {
        System.out.println("Recebe 15% de aumento de poder de habilidade de Felipe!");
    }


}
