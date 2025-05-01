package entities;

public class Banco {

	private String nome;
	private String conta;
	private String agencia;
	private Double saldo;
	private String cpf;
	private String senha;
	
	public Banco(){
	}
	
	public Banco(String cpf) {
		this.cpf = cpf;
	}
	
	public Banco(String cpf, String nome, String conta, String agencia, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.agencia = agencia;
		this.senha = senha;
	}
	
	public Banco(String nome, String conta, String agencia, Double saldo, String cpf, String senha) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "\nSeus Dados Pessoais:\nNOME: " + nome + "\nCPF: "+ cpf +"\nCONTA: " + conta +"\nAGÊNCIA: "+ agencia + "\nSENHA: " + senha;
	}  
	
	
	
	
}
