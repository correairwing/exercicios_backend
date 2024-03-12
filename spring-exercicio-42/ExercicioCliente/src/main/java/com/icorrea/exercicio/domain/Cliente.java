/**
 * 
 */
package com.icorrea.exercicio.domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author irwing.correa
 *
 */
@Document(collection = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name="Cliente", description="Cliente") 
public class Cliente {
	
	@Id
	@Schema(description="Identificador único") 
	private String id;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Nome", minLength = 1, maxLength=50, nullable = false) 
	private String nome;
	
	@NotNull
	@Indexed(unique = true, background = true)
	@Schema(description="CPF (Somente números)", nullable = false) 
	@Pattern(regexp = "^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$")
    private String cpf;
    
	@NotNull
	@Schema(description="DDD + telefone", nullable = false) 
	@Pattern(regexp = "^\\+?[0-9]*$|^\\([1-9][0-9]\\)\\s*9?[0-9]{4}-?[0-9]{4}$")
    private String telefone;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Indexed(unique = true, background = true)
	@Schema(description="Email", minLength = 1, maxLength=50, nullable = false)
	@Pattern(regexp = ".+@.+\\..+", message = "Email inválido")
	private String email;
    
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Endereço", minLength = 4, maxLength=50, nullable = false)
    private String end;
    
	@NotNull
	@Schema(description="Numero residencial", nullable = false) 
    private Integer numero;
    
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Cidade", minLength = 1, maxLength=50, nullable = false)
    private String cidade;
    
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="UF", minLength = 2, maxLength=2, nullable = false)
    private String estado;
    

}
