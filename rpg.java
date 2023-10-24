import java.util.Scanner;

public class rpg {
    static void escolha(){
            Scanner teclado = new Scanner(System.in);
            System.out.print(": ");
            int escolha = teclado.nextInt();
            teclado.close();
        }
    public static void main(String[] args){
        


        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Monte seu campeão!");
        System.out.print("Nome: ");
        String nome1 = teclado.nextLine();
        System.out.print("Vida: ");
        int hp1 = teclado.nextInt();
        System.out.print("Poder de habilidade: ");
        int poder1 = teclado.nextInt();
        Jogador p1 = new Jogador();
        p1.nome = nome1;
        p1.hp = hp1;
        p1.poder = poder1;

        

        System.out.println("Seu nome é: "+ p1.nome + " Você tem: " + p1.hp+ " De vida"+ " Seu poder é de: "+ p1.poder);

        System.out.println("Deseja inciar o jogo(1 Jogar/0 Sair)?");
        int escolha = teclado.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Seja bem vindo a esse incrivel mundo de aventuras senhor: "+ p1.nome);
                System.out.println("Você acaba de cair em um mundo desconhecido agora você está em um cruzamento e vê as seguintes placas indicando um caminho escolha com sabedoria");
                System.out.println("(1) Bosque sombrio");
                System.out.println("(2) Masmorra");
                System.out.println("(3) Floresta");
                escolha();
                
                switch (escolha) {
                    case 1:
                        System.out.println("Você está caminhando até o bosque e se depara com um monstro que pula da arvore é um lobo!!");
                        System.out.println("(1) Atacar");
                        System.out.println("(2) Correr");
                        System.out.println("(3) Ficar parado");
                        escolha();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você atacou o lobo e causou: "+p1.atacar());
                                break;
                        
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        teclado.close();
    }
}
