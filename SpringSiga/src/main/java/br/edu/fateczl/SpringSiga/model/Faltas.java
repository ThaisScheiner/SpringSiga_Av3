package br.edu.fateczl.SpringSiga.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Faltas 
{
	private String ra;
	private String falta;
	private String dt;
	private String materia;
}
