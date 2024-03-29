package br.senai.sc.m3s04.repository;

import br.senai.sc.m3s04.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, String> {

    Optional<Person> findByGuid(String guid);

    Optional<Person> findByEmail(String email);
}