package br.com.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "nome")
	@Size(min = 5, max = 35, message = "O nome deve conter no minimo 5 caracteres")
	@NotBlank(message = "O nome não pode ser vazio.")
	private String nome;

	@Column(name = "curso")
	@Enumerated(EnumType.STRING)
	@NotNull(message = "O Campo Curso deve ser selecionado.")
	private Curso curso;

	@Column(name = "matricula")
	@NotNull(message = "Utilize o botão 'Gerar' para gerar a matricula.")
	@Size(min = 3, message = "Clique no botão Gerar Matricula!")
	private String matricula;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	@NotNull(message = "O Campo Status não pode estar vazio")
	private Status status;

	@Column(name = "turno")
	@NotBlank(message = "O turno não pode ser vazio.")
	@Size(min = 4, message = "No minimo 4 caracteres.")
	private String turno;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
