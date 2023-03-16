package com.generation.blogpessoal.repository;




import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.generation.blogpessoal.model.Postagem;



@SuppressWarnings("unused")
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>
{
	
	public List<Postagem> findAllbyTituloContainingIgnoreCase(@Param("titulo") String titulo);

}
