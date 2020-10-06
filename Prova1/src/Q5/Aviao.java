package Q5;

import lombok.Data;

@Data 
public class Aviao {
	
	private String matricula;
	public Aviao proximo;
	
	public Aviao(String matricula) {
		this.matricula = matricula;
	}
}
