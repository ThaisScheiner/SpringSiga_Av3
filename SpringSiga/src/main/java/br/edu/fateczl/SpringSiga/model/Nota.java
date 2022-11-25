package br.edu.fateczl.SpringSiga.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Nota 
{
	 private String ra;
	 private String codigo_avaliacao;
	 private String nota;
}
