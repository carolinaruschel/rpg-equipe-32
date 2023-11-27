
public class Main {
    public static void main(String[] args) {


        PersonagemLuis luis = new PersonagemLuis();
        luis.classe = "Mago";
        luis.level = 70;
        luis.habilidadePrincipal = "Devastação Arcana";

        System.out.println("----Primeiro turno----\n");
        System.out.println("Status:");
        luis.mostrarStatusLuis();

        System.out.println("\nAção:");
        luis.buffMagoF("Felipe");
        luis.ataqueMago("Mago");


        System.out.println("\n----Segundo turno----\n");
        PersonagemAugusto augusto = new PersonagemAugusto();
        augusto.classe = "Berserker";
        augusto.level = 55;
        augusto.habilidadePrincipal = "Ira Demoníaca";

        System.out.println("Status:");
        augusto.mostrarStatusAugusto();

        System.out.println("\nAção:");
        augusto.buffArqueiroElfico("Pedro");
        augusto.ataqueBerserker("Guerreiro");

        System.out.println("\n----Terceiro turno----\n");
        PersonagemCarol carol = new PersonagemCarol();
        carol.classe = "Druida";
        carol.level = 50;
        carol.habilidadePrincipal = "Magia  de Invocação";

        System.out.println("Status:");
        carol.mostrarStatusCarol();

        System.out.println("\nAção:");
        carol.buffMago("Mago");
        carol.ataqueDruida("Invocação Baiacu");

        System.out.println("\n----Quarto turno----\n");
        PersonagemCarlos carlos = new PersonagemCarlos();
        carlos.classe = "Aprendiz";
        carlos.level = 1;
        carlos.habilidadePrincipal = "Aprendizado rápido";

        System.out.println("Status:");
        carlos.mostrarStatusCarlos();

        System.out.println("\nAção:");
        carlos.buffDruida("Druida");
        carlos.ataqueAprendiz("Imitação");
        System.out.println("Carlos invoca um deus baiacu celestial!");
        System.out.println("A mana do Carlos zerou e ele não atacará por três turnos!");

        System.out.println("\n----Quinto turno----\n");

        PersonagemFelipe felipe = new PersonagemFelipe();
        felipe.classe = "Mago";
        felipe.level = 36;
        felipe.habilidadePrincipal = "Bola de Fogo";

        System.out.println("Status:");
        felipe.mostrarStatusFelipe();

        System.out.println("\nAção:");
        felipe.buffAprendiz("Aumento de Inteligência");
        felipe.ataqueMagof("Familiar Flamejante");

        System.out.println("\n----Sexto turno----\n");

        PersonagemPedro pedro = new PersonagemPedro();
        pedro.classe = "Arqueiro Élfico";
        pedro.level = 25;
        pedro.habilidadePrincipal = "Chuva de Flechas";

        System.out.println("Status:");
        pedro.mostrarStatusPedro();

        System.out.println("\nAção:");
        pedro.buffBerserker("Berserker");
        pedro.ataqueArqueiroElfico("Flecha de Trilha Celestial");


    }
}