public class Inimigo {
    //Atributos
    String nome;
    int hp;
    int poder;
    //Métodos
    void atacar(){
        hp -= poder/2;
    }
}
