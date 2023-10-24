import java.util.Scanner;

public class metodos{
    
    //Pegando Input do usuario e formatando.
      static void nome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Senha: ");
        String senha = input.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Senha: " + senha);
        input.close();
    }
    
    static void senha(){
        
    }

    public static void main(String[] args){
    nome();
    
  
  
 
 

   
    }
 
}