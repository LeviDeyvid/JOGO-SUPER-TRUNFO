package Jogo;

import java.util.Random;
        
public class CardPersonagem extends Card {
    int forca;
    int inteligencia;
    int resistencia;
    int fadiga;
    
    CardPersonagem(){
        Random gerador = new Random();
        this.multiplicador = gerador.nextInt(6);
        this.forca = gerador.nextInt(101);
        this.inteligencia = gerador.nextInt(101);
        this.resistencia = gerador.nextInt(101);
        this.fadiga = gerador.nextInt(101);
        this.pontuacao=(this.forca + this.inteligencia + this.resistencia)-this.fadiga;
    }

    void exibirCard() {
       System.out.println("Multiplicador: "+this.multiplicador);
       System.out.println("Pontuação..."+this.pontuacao);
       System.out.println("Forca..."+this.forca);
       System.out.println("Inteligencia..."+this.inteligencia);
       System.out.println("Resistencia..."+this.resistencia);
       System.out.println("Fadiga...."+this.fadiga);
       System.out.println("=-=-==-=---==-=-==");
        
    }  
}
