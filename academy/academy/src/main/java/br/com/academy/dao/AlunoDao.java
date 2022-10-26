package br.com.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {
	
	@Query("select j from Aluno j where j.status = 'ATIVO' ")
	public List<Aluno> findByStatusAtivos();
	
	@Query("select a from Aluno a where a.status = 'INATIVO' ")
	public List<Aluno> findByStatusInativo();
	
	@Query("select c from Aluno c where c.status = 'CANCELADO' ")
	public List<Aluno> findByStatusCancelado();
	
	@Query("select t from Aluno t where t.status = 'TRANCADO' ")
	public List<Aluno> findByStatusTrancado();
	
	public List<Aluno> findByNomeContainingIgnoreCase(String nome);

}
