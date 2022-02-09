package myg.ellacom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import myg.ellacom.models.Elogios;

public interface elogiosRepository extends JpaRepository<Elogios, Long> {
	public List<Elogios> findAllByPalavraContainingIgnoreCase(String palavra);
}
