package produto;

import produto.excecoes.CodigoDeBarrasInvalido;

/**
 * Um c�digo de barras possui um n�mero
 * de acordo com a codifica��o EAN-13. 
 * Formato: CCCPPPPPPPPPV, em que CCC � o
 * c�digo do pa�s, � o c�digo do fabricante combinado 
 * com o produto e V � o d�gito verificador.
 */
public interface CodigoDeBarras 
{
	/**
	 * Altera o n�mero do c�digo de barras.
	 * @param numero novo n�mero do c�digo de barras
	 * @throws CodigoDeBarrasInvalido se o c�digo n�o estiver
	 * no padr�o de valida��o EAN-13 
	 * (ver http://pt.wikipedia.org/wiki/EAN-13)
	 */
	public void setNumero(long numero) throws CodigoDeBarrasInvalido;
	
	public long getNumero();
	
	/**
	 * Retorna o c�digo do pa�s do produto
	 * @return c�digo do pa�s
	 */
	public int getPais();
	
	/**
	 * Retorna o d�gito verificador do c�digo do produto
	 * @return d�gito verificador
	 */
	public int getVerificador();

}
