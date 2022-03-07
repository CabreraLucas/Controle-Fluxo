import java.util.Scanner;
public class While{
    public static void main(String[]args){
        int x;

        Scanner leitura=new Scanner(System.in);

        System.out.println("Digite um número");
        x=leitura.nextInt();

        while (x < 18){
            System.out.println("Você não tem permissão para entrar");
            x++;
        }
    }
}