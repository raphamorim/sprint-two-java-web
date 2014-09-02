package modelo;

import java.util.Date;
import java.io.Serializable;

import javax.inject.Named;
import javax.validation.constraints.Size;

import modelo.Usuario;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import org.hibernate.validator.constraints.Email;

@Getter
@Setter
@Named
public class Pessoa implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NonNull
	@Size(min=3, max=50, message = "{nome.tamanho.minimo}")
	private String nome;
	
	@NonNull
	@Email
	private String email;
	
	private Date dataNascimento;

	private Usuario usuario = new Usuario();
	
	public String toString(){
		return nome+" "+email;
	}

}
