package transdutor;

public class Analisador {
	
	String buffer = "";
	
	public void tudo(){
		String entrada = "";
		
		for(int i = 0; i < entrada.length();i++){
			if(Character.isLetter(entrada.charAt(i))==true){
				this.q0(entrada.charAt(i));
			}else if(Character.isDigit(entrada.charAt(i))==true){
				this.q1(entrada.charAt(i));
			}else if(entrada.charAt(i) == ' '){
				this.validar();
			}else{
				
			}
		}
	}
	
	public void q0(char entrada){
		//validar palavra
		this.buffer += entrada; 
	}
	
	public void q1(char entrada){
		//validar numero
		this.buffer += entrada;
	}
	
	public void q2(){
		
	}
	
	public void validar(){
		
	}
}

