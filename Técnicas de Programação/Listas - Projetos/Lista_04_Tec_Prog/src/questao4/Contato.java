package questao4;

public class Contato implements Cloneable {
	int codigo;
	String nome;
	String endere�o;
	String email;
	String telefone;
	String observacao;

	public Contato(int codigo) {
		if (codigo < 9999 && codigo > 1000) {
			this.codigo = codigo;
		} else {
			System.out.println("Codigo invalido");
		}
	}

	public Contato(int codigo, String nome) {
		if (codigo < 9999 && codigo > 1000) {
			this.codigo = codigo;
		} else {
			System.out.println("Codigo invalido");
		}
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		if (codigo < 9999 && codigo > 1000) {
			this.codigo = codigo;
		} else {
			System.out.println("Codigo invalido");
		}
		this.nome = nome;
		this.email = email;
	}

	public Contato(String telefone) {
		if (contarLetras(telefone) == 8) {
			this.telefone = telefone;
		} else {
			this.telefone = null;
		}
	}

	public int contarLetras(String telefone) {
		return telefone.length();
	}

	public void mostrarContato() {
		System.out.println("Codigo: " + getCodigo());
		if (nome != null && nome != "") {
			System.out.println("Nome: " + getNome());
		}
		if (endere�o != null && nome != "") {
			System.out.println("Endere�o: " + getEndere�o());
		}
		if (email != null && nome != "") {
			System.out.println("Email: " + getEmail());
		}
		if (telefone != null && nome != "") {
			System.out.println("Telefone: " + getTelefone());
		}
		if (observacao != null && nome != "") {
			System.out.println("Observa��o: " + getObservacao());
		}
	}

	public void verificarContato() {
		if (nome == null && nome != "") {
			System.out.println("Nao ha nome cadastrado para este contato");
		}
		if (endere�o == null && nome != "") {
			System.out.println("Nao ha endere�o cadastrado para este contato");
		}
		if (email == null && nome != "") {
			System.out.println("Nao ha email cadastrado para este contato");
		}
		if (telefone == null && nome != "") {
			System.out.println("Nao ha telefone cadastrado para este contato");
		}
		if (observacao == null && nome != "") {
			System.out.println("Nao ha observacoes cadastradas para este contato");
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo < 9999 && codigo > 1000) {
			this.codigo = codigo;
		} else {
			System.out.println("Codigo invalido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
