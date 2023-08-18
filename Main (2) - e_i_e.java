import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args){
    int A, B, C;
    Scanner ent = new Scanner(System.in);
        System.out.println("Existência de triângulos");
        System.out.println("Digite o valor do primeiro lado:");
        A = ent.nextInt();
        System.out.println("Digite o valor do segundo lado:");
        B = ent.nextInt();
        System.out.println("Digite o valor do terceiro lado:");
        C = ent.nextInt();
        if (A< (B+C) && B <(A+C) && C <(A+B))
        {
            System.out.println("Estes valores formam triângulos");
            if(A==B & B==C)
            {System.out.println("Triângulo equilátero");}
        else  if(A==B || B==C || A==C)
        {System.out.println("Triângulo isósceles");} 
        else
        {System.out.println("Triângulo escaleno");}
        }
          else
        {System.out.println("Estes valores não formam triângulos");}
    }
}