package com.pocketpersonaltrainer.API.repository;


import org.springframework.data.repository.CrudRepository;

import com.pocketpersonaltrainer.API.model.PersonalTrainer;

public interface PersonalTrainerRepository extends CrudRepository<PersonalTrainer, Long> {
	
	PersonalTrainer findById(long id);

}
