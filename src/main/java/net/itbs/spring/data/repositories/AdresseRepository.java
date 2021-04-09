package net.itbs.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.itbs.spring.data.entites.Adresse;

@RepositoryRestResource
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {

}
