package modelo;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Named
@SessionScoped
public class Usuario implements Serializable {
	
	/**
	 * UID de serializacao estatica.
	 */
	private static final long serialVersionUID = 6185173587860633317L;

	@NonNull
	@Size(max = 10, message = "{login.tamanho.maximo}")
	private String login;
	
	@Size(max = 20, message = "{senha.tamanho.maximo}")
	@NonNull
	private String senha;
	
	@NonNull
	private String papel;	
}