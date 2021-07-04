package Jogo;

public class Jogo {

    public static void main(String[] args) {
        Duelo batalha1 = new Duelo();
        Player Levi = new Player("Levi");
        Player comp = new Player("COMPUTADOR");
        
        batalha1.duelo(Levi, comp);
                
    }
}
