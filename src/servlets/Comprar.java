package servlets;


public class Comprar {
int idade;
String name;
int assento;
boolean estudante;
int idosos;
int id;
String senha;
String endereco;
String cidade;
public int codigo=7426000,antCodigo;
 
public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isEstudante() {
	return estudante;
}

public void setEstudante(boolean estudante) {
	this.estudante = estudante;
}

public int getIdosos() {
	return idosos;
}

public void setIdosos(int idosos) {
	this.idosos = idosos;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public int getAntCodigo() {
	return antCodigo;
}

public void setAntCodigo(int antCodigo) {
	this.antCodigo = antCodigo;
}

public int compararIdade(){
	 int preco=25;
	 if(idade >= 65 && idosos <2){
	  preco = 0; 
	 }
		
	if((idade >= 65 && idosos >2) || estudante == true){
		preco = preco/2;
	}
	return preco;
}
	
 public int getAssento() {
	return assento;
}

public void setAssento(int assento) {
	this.assento = assento;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public void Codigo(){
	 assento+=assento;
	 antCodigo = codigo;
	 codigo = 7426000 + assento;
 }
 
}
