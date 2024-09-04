package Modificadores;

   class Animal {

	private String nome;
	private  String tamanho;
	private  String cor;
	private  String peso;
	private  String raca;
	
	protected String getNome() {
		return nome;
	}
	protected void setNome (String nome) { 
		this.nome = nome;
	}
	protected String getTamanho() {
		return tamanho;
	}
	protected void setTamanho(String tamanho) { 
		this.tamanho = tamanho;
	}
	protected String getCor() {
		return cor;
	}
   protected void setCor(String cor) { 
		this.cor = cor;
	}
   protected String getPeso() {
		return peso;
	}
   protected void setPeso (String peso) { 
		this.peso = peso;
	}
   protected String getraca() {
		return raca;
	}
   protected void setRaca(String raca) { 
		this.raca = raca;
}
   }
