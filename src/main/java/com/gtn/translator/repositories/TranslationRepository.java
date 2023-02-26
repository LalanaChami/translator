package com.gtn.translator.repositories;

import com.gtn.translator.models.Translations;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TranslationRepository extends PagingAndSortingRepository<Translations,ObjectId> {
}
