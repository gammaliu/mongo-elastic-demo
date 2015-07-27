package io.github.gammaliu.demo.dao;


import org.hibernate.criterion.Criterion;

import io.github.gammaliu.demo.domain.Person;

import java.util.Collection;

/**
 * Search for Person DAO interface.
 */
public interface SearchDao {

    /**
     * Find person using criteria
     */
    public Collection<Person> findWithCriterias(Collection<Criterion> criterions, Integer from, Integer size);

    /**
     * Count persons using criteria
     */
    public long countWithCriterias(Collection<Criterion> criterions);

    /**
     * Find persons with a google like search.
     */
    public Collection<Person> findLikeGoogle(String query, Integer from, Integer size);

    /**
     * Count persons with a google like search.
     */
    public long countLikeGoogle(String query);
}
