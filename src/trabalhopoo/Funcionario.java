package trabalhopoo;
public class Funcionario extends Pessoa
{
        private String pis;
        private double totalEmVendas;
        
        public void setPis(String p)
        {
            this.pis = p;
        }
        
        public void setTotalEmVendas(double x)
        {
            this.totalEmVendas = x;
        }
        
        public String getPis()
        {
            return this.pis;
        }
        
        public double getTotalEmVendas()
        {
            return this.totalEmVendas;
        }
        
        public void venda(Compra c)
        {
            c.valorDaCompra();
            this.totalEmVendas = c.valorDaCompra();
            System.out.println("Foi adcionado as vendas desse funcionário + R$" + this.totalEmVendas);
        }
        
        public String toString()
        {
            return "" + super.toString() + this.pis + this.totalEmVendas;
        }
}
