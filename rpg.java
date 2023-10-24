import java.util.Scanner;

public class rpg {
   
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

         // Contruindo inimigos
            Inimigo in1 = new Inimigo();
            in1.nome = "Lobo selvagem";
            in1.poder = 25;
            in1.hp = 40;


        System.out.println("Seu nome é: "+ p1.nome + " Você tem: " + p1.hp+ " De vida"+ " Seu poder é de: "+ p1.poder);

        System.out.println("Deseja inciar o jogo(1 Jogar/0 Sair)?");
        int escolha = teclado.nextInt();
        
        switch (escolha) {   
            case 1:
                Scanner tecladoCase = new Scanner(System.in);
                System.out.println("Seja bem vindo a esse incrivel mundo de aventuras senhor: "+ p1.nome);
                System.out.println("Você acaba de cair em um mundo desconhecido agora você está em um cruzamento e vê as seguintes placas indicando um caminho escolha com sabedoria");
                System.out.println("(1) Bosque sombrio");
                System.out.println("(2) Masmorra");
                System.out.println("(3) Floresta");
                int escolha1 = tecladoCase.nextInt();
                boolean repete = false;
                do{
                switch (escolha1) {
                    case 1:
                        System.out.println("Você está caminhando até o bosque e se depara com um monstro que pula da arvore é um lobo!!");
                        System.out.println("(1) Atacar");
                        System.out.println("(2) Correr");
                        System.out.println("(3) Ficar parado");
                        int escolhaUM = tecladoCase.nextInt();
                        switch (escolhaUM) {
                            case 1:
                                
                                System.out.println("Você atacou o lobo e matou ele");
                                System.out.println("Você chegou em um casa no pantano!!");
                                System.out.println("(1)Entrar na casa");
                                System.out.println("Procurar outro lugar");
                                int escolhaPantano = tecladoCase.nextInt();
                                if (escolhaPantano == 1) {
                                    System.out.println("Blaaaanww porta abrindo..");
                                }else if(escolhaPantano == 2){
                                    System.out.println("Outro lugar..");

                                }else{
                                    System.out.println("Escolha invalida");
                                }

                                break;
                            case 2:
                                System.out.println("Correndo");
                                break;
                            case 3:
                                System.out.println("Parado");
                                break;
                            default:
                                System.out.println("Escolha invalida");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Você está caminhando até a masmorra e se depara com um troll que vive lá!!");
                        System.out.println("(1) Atacar");
                        System.out.println("(2) Correr");
                        System.out.println("(3) Ficar parado");
                        int escolhaDois = tecladoCase.nextInt();
                        switch (escolhaDois) {
                            case 1:
                            System.out.println("Você matou precione 1 para prosseguir");
                            int Ataque = tecladoCase.nextInt();
                            if(Ataque == 1)
                                System.out.println("andando");
                                break;
                            case 2:
                            System.out.println("Correndo");
                                break;
                            case 3:
                            System.out.println("Parado");
                                break;
                            default:
                                System.out.println("Escolha invalida");
                                break;
                            }
                            break;
                    case 3:
                        System.out.println("Você está caminhando até a masmorra e se depara com um troll que vive lá!!");
                        System.out.println("(1) Atacar");
                        System.out.println("(2) Correr");
                        System.out.println("(3) Ficar parado");
                        int escolhaTres = tecladoCase.nextInt();
                        switch (escolhaTres) {
                            case 1:
                            System.out.println("n pode");
                                break;
                            case 2:
                            System.out.println("n pode");
                                break;
                            case 3:
                            System.out.println("Parado");
                                break;
                            default:
                                System.out.println("Escolha invalida");
                                break;
                            }
                            break;        
                        
                    default:
                        repete  = false;
                        
                }
                }while (!repete);
                
                
                break;
            default:
                System.out.println("Saindo!!");
                break;
        }
        teclado.close();
    }
}
