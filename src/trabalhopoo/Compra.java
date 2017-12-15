package trabalhopoo;

import java.util.Scanner;
import java.util.ArrayList;

public class Compra 
{    
    private double valorAPagar;
    private double valorPago;
    private ArrayList<Produto> produtosDaCompra;
    
    public Compra ()
    {
        this.produtosDaCompra = new ArrayList<Produto>();
    }
    
    public double getValorAPagar()
    {
        Produto p1 = new Produto();
        return this.valorAPagar = p1.getPrecoDeVenda();
    }
    
    public double getValorPago()
    {
        return this.valorPago;
    }
    
    public void adicionarProduto(Produto p)
    {
        this.produtosDaCompra.add(p);
    }
    
    public void removerProduto(Produto p)
    {
        this.produtosDaCompra.remove(p);   
    }
    
    public void valorproduto(Produto prod)
    {
        Produto p;
        p = (Produto) this.produtosDaCompra.get(this.produtosDaCompra.indexOf(prod));
    }
    
    public double valorDaCompra()
    {
        Produto p;
        for(int i = 0; i < this.produtosDaCompra.size();i++)
        {
            p=(Produto) this.produtosDaCompra.get(i);
            this.valorAPagar = p.getPrecoDeVenda() + this.valorAPagar;                                   
        }
        System.out.println(this.valorAPagar);
        return this.valorAPagar;
    }       
      
    public void Pagamento (int operacao)
    {
        int especie= 1,cartaoc = 2, cartaod = 3;
        Scanner entrada = new Scanner(System.in);
        Compra c = new Compra();
        switch( operacao )
        {
            case 1:
                double troco;
                double cash;
                cash = entrada.nextDouble();
                troco = cash - this.valorAPagar;
                System.out.println("Compra realizada com sucesso! Volte sempre!");
                System.out.println("Seu troco é R$ " + troco);
                break;        
            case 2:
                System.out.println("Compra realizada com sucesso! Volte sempre!");                
                break;   
            case 3:
                System.out.println("Compra realizada com sucesso! Volte sempre!");                
                break;                   
            default:
                System.out.printf("Você digitou uma operação inválida.");        
        }
    }
    
    public String toString()
    {
        return "" + this.produtosDaCompra + this.valorAPagar + this.valorPago;
    }
}