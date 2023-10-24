public class Carro{
    // Atributos
    String nome; 
    String marca;
    int ano;
    int velocidade;
    
    //Método 
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }
    
    void freiar(int reduzir){
        velocidade-= reduzir;
    }
    void buzinar(){
        System.out.println("Bi bi bi!!!");
    }
}