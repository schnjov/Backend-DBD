package usach.DBD.grupo15.proyecto.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.Rol;
import usach.DBD.grupo15.proyecto.Repository.RolRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class RolService implements RolRepository {

    @Autowired
    private RolRepository rolRepository;


    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public List<Rol> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Rol> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Rol> findAllById(Iterable<Long> longs) {
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
    public void delete(Rol entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Rol> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Rol> S save(S entity) {
        return rolRepository.save(entity);
    }

    @Override
    public <S extends Rol> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return rolRepository.findById(id);
    }


    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Rol> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Rol> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Rol> entities) {

    }

    @Override
    public void deleteAllInBatch(Iterable<Rol> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Rol getOne(Long aLong) {
        return null;
    }

    @Override
    public Rol getById(Long aLong) {
        return null;
    }

    @Override
    public Rol getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Rol> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Rol> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Rol> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Rol> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Rol> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Rol> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Rol, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Rol findByUser_Email(String email) {
        return rolRepository.findByUser_Email(email);
    }
}
