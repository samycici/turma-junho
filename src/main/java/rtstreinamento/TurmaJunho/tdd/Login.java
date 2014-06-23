package rtstreinamento.TurmaJunho.tdd;

public class Login {

	public boolean autenticar(String usuario, String senha) {
        boolean retorno = false;
        if (senha.equals("12345678")) {
        	retorno = true;
        }       
      
        
        if (usuario == null){
        	return false;
        }
		return usuario.equals("joao@gmail.com") && retorno;
	}

}
