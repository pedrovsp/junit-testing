package classes.ads;

public class Paciente {
	private String nome;
	private RiscoEnum risco;
	private long idade;
	
	public Paciente(String nome, RiscoEnum risco, long idade) {
		this.nome = nome;
		this.risco = risco;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public RiscoEnum getRisco() {
		return risco;
	}
	public void setRisco(RiscoEnum risco) {
		this.risco = risco;
	}
	public long getIdade() {
		return idade;
	}
	public void setIdade(long idade) {
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idade ^ (idade >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((risco == null) ? 0 : risco.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (risco != other.risco)
			return false;
		return true;
	}
	
	
}
