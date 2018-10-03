package com.beuno.inhealthwealth.expenditure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenditureRepository extends MongoRepository<Expenditure, String> {
	
	
}
