import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        double media;
        String nome;
        Scanner ent = new Scanner(System.in);
        System.out.println("Recomendação bolsa de estudos");
        System.out.println("Digite o nome do aluno(a):");
        nome = ent.next();
        System.out.println("Digite a média do aluno(a)" + nome + ":");
        media = ent.nextDouble();
        if(media>=9){
                System.out.println(nome + " - Altamente recomendado");
            }
        else
        if(media>=8){
                System.out.println(nome + " - Fortemente recomendado");
            }
        else
        if(media>=7){
               System.out.println(nome + " -  Recomendado"); 
            }
        else{
                System.out.println(nome + " - Não recomendado"); }
        }
}