import java.util.Scanner;
public class DoWhile{
    public static void main(String[]args){
        int x;

        Scanner leitura=new Scanner(System.in);

        System.out.println("Digite um número");
        x=leitura.nextInt();
        
        do {

            System.out.println("Você não tem permissão para entrar");
            x++;
        } while (x < 18);
    }
}