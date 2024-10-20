package br.com.ebac.animal_service.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ebac.animal_service.entidades.Animal;

/**
 * @author fsdney
 */

public interface AnimalRepository extends JpaRepository<Animal, Integer>{

@Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
List<Animal> findNotAdopted();

@Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL")
List<Animal> findAdopted();
}
