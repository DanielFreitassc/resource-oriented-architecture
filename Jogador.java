public class Jogador {
    //Atributos do jogador.
    String nome;
    int hp;
    int poder;
    //Métodos 
    void atacar(int dano){
        hp -= poder/2;
    }
    void curar(int cura){
        hp += 10;
    }
}
