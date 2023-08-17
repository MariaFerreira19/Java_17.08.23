import java.util.Scanner;
import java.lang.Math;
public class 
{
    public static void main(String[] args){
    double valor_compra, valor_venda, lucro;
    Scanner ent = new Scanner(System.in);
    System.out.println("Valor de compra e venda de um produto:");
    System.out.println("Digite o valor de compra em R$:");
    valor_compra =  ent.nextDouble();
    if(valor_compra < 10) { lucro = 0.70 * valor_compra; }
    else if(valor_compra < 30) { lucro = 0.50 * valor_compra; }
    else if(valor_compra < 50) { lucro = 0.40 * valor_compra; }
    else { lucro = 0.30 * valor_compra; }
    valor_venda = valor_compra + lucro;
    System.out.printf("Valor de compra: %2.f", valor_compra);
    System.out.printf("Lucro: 2.f", lucro);
    System.out.printf("Valor de Venda:% .f", valor_venda);
}
}
