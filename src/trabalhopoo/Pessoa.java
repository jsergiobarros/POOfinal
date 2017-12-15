package trabalhopoo;
public class Pessoa 
{
    /*
    Cada cliente terá um nome, CPF, endereço ( Logradouro, número, bairro, cidade, estado) e telefone.
    */
    protected String nome;
    protected String cpf;
    protected String logradouro;
    protected int numero;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String telefone;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString()
    {
        return "" + this.nome + this.cpf + this.telefone + this.logradouro + this.bairro + this.cidade + this.estado;
    }
    
}
