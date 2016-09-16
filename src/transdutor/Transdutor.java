package transdutor;

public class Transdutor {

	/*transdutor
	 * Recebe a linha da linguagem
	 * EX: LET A:=10 : PRINT A:B:=B+A:END
	 * Após analise léxia produzirá:
	 * P(4)V(0):=10:P(5)V(0):V(1):=V(1)=V(0):P(8) 
	 * palavras reservadas: IF, THEN, ELSE, GOTO, LET, PRINT, READ, OF, END
	 * .indexof .substring charAt character.isletter isdigit
	 */

	public String linhaEntrada = null
			, linhaSaida = null
			, constante = null
			, variavel = null;

	public void e0(String entrada){
		for(int i=0; i < entrada.length(); i++){
			if(Character.isLetter(entrada.charAt(i))==true){				
				variavel = variavel+entrada.charAt(i);
				System.out.println(variavel);		
				
			}else if(Character.isDigit(entrada.charAt(i))==true){
				
			}
		}
	}
	
	public static void main(String [] args){
		Transdutor t = new Transdutor();
		t.e0("S");
	}

}


