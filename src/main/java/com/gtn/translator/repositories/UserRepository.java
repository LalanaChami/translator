package com.gtn.translator.repositories;

import com.gtn.translator.models.Users;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<Users, ObjectId> {
}
