public class Jogador {
    //Atributos do jogador.
    String nome;
    int hp;
    int poder;
    //Métodos 
    void atacar(String inimigo){
        System.out.printf("Você atacou e causou %"+ poder/2 + "de dano no %s",inimigo);
    }
    void curar(int cura){
        hp += 10;
    }
    void levarDano(int receberDano){
        
    }
}
