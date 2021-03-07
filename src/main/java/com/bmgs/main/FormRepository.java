package com.bmgs.main;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "forms", path = "forms")
public interface FormRepository extends PagingAndSortingRepository<Form, Long> {
    Object findById(@Param("id") long id);
    //Object findByName(@Param("id") String name);
}
