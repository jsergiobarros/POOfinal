package trabalhopoo;
import java.util.ArrayList;
public class Cliente extends Pessoa
{
    private ArrayList<Cliente> novoCliente;
    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Nome: " + this.nome + "| CPF: " + this.cpf);
    }
    
    public Cliente()
    {
        this.novoCliente = new ArrayList<Cliente>();
    }
    
    public void cadastrar(Cliente c)
    {
        this.novoCliente.add(c);
    }
    
    public String toString()
    {
        return "" + super.toString() + this.novoCliente;
    }
    
}
