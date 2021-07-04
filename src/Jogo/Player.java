package Jogo;
public class Player {
    private String nome;
    protected int vitorias;
    private int multiplicador;
    CardPersonagem[] monte = new CardPersonagem[20];
    
    Player(String nome){
        this.nome=nome;
        this.vitorias = 0;
        this.multiplicador = 0;
        for (int cont = 0; cont <=19; cont++){
         CardPersonagem  card = new CardPersonagem(); 
                   this.monte[cont] = card;
        }
    }

        void exibirMonte(){
            for (int cont = 0; cont <=19; cont++){
                this.monte[cont].exibirCard();
            }
                
    }

    void exibirCard(int posicao) {
        this.monte[posicao].exibirCard();
    }
    
    public int getMultiplicador(){
        return multiplicador;
    }
    
    public void setMultiplicador(int multiplicador){
        this.multiplicador=multiplicador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CardPersonagem[] getMonte() {
        return monte;
    }

    public void setMonte(CardPersonagem[] monte) {
        this.monte = monte;
    }
}

  