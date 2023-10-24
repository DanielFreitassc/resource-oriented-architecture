public class AndarDeCarro {
    public static void main(String[] args){
        Carro bmw = new Carro();

        bmw.nome = "Bmw c4";
        bmw.marca = "Bmw";
        bmw.ano = 2023;
        bmw.velocidade = 300;

        bmw.acelerar(10);

        System.out.println(bmw.velocidade);
    }    
}
