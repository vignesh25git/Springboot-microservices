package com.vicky.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.entity.Person;

@Repository
public interface PersonRepos extends JpaRepository<Person, Integer>{

}
