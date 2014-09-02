package controle;

import i18n.MessageBundleImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;
import modelo.Pessoa;

@SuppressWarnings("unused")
@ManagedBean
@Getter
@Setter
@Named
@RequestScoped
public class ControleUsuario implements Serializable  {	

	private static final long serialVersionUID = 1L;
	
	private Pessoa pessoa = new Pessoa();
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void salvar(){	
		
		pessoas.add(this.pessoa);
		System.out.println("Adicionado com Sucesso!!");
		
		for(Pessoa u : pessoas){
			System.out.println(u);
		}
		
		/*for(Pessoa u : pessoas){
			if(u.getEmail().equals(u.getEmail())){
				System.out.println("Usuario ja cadastrado");
			}else{
				pessoas.add(this.pessoa);
				System.out.println("Adicionado com Sucesso!!");
				System.out.println(u);
			}			
		}*/
	}
}
