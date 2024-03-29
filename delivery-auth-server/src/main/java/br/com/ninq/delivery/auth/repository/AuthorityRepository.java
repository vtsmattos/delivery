package br.com.ninq.delivery.auth.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ninq.delivery.auth.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}