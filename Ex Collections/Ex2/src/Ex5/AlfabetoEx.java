package Ex5;

public class AlfabetoEx {

	private String letra;
	private int numero;

	public AlfabetoEx(String letra, int numero) {
		this.letra = letra;
		this.numero = numero;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((letra == null) ? 0 : letra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AlfabetoEx))
			return false;
		AlfabetoEx other = (AlfabetoEx) obj;
		if (letra == null) {
			if (other.letra != null)
				return false;
		} else if (!letra.equals(other.letra))
			return false;
		return true;
	}

}
