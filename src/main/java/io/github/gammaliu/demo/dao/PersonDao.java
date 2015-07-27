package io.github.gammaliu.demo.dao;


import java.util.Collection;

import io.github.gammaliu.demo.domain.Person;


/**
 * Person DAO interface for CRUD methods.
 */
public interface PersonDao {
    /**
     * Get person.
     */
    public Person get(Integer id);

    /**
     * Get person by reference
     */
    public Person getByReference(String reference);

    /**
     * Saves person.
     */
    public Person save(Person person);

    /**
     * Delete person.
     */
    public void delete(Person person);

    /**
     * Delete persons.
     */
    public void deleteAll(Collection<Person> persons);


}
