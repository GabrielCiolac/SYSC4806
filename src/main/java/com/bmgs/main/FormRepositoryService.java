package com.bmgs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FormRepositoryService implements FormRepository{
    @Qualifier("formRepository")
    @Autowired
    private FormRepository repo;

    @Override
    public Object findById(long id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<Form> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Form> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Form> S save(S s) {
        return repo.save(s);
    }

    @Override
    public <S extends Form> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Form> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Form> findAll() {
        return null;
    }

    @Override
    public Iterable<Form> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Form form) {

    }

    @Override
    public void deleteAll(Iterable<? extends Form> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
