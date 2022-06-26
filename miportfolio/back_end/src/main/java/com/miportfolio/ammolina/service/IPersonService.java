/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolio.ammolina.service;

import com.miportfolio.ammolina.model.Person;
import java.util.List;

/**
 *
 * @author Sisita
 */
public interface IPersonService {
    
    public List<Person>getAllPerson();
    public void savePerson(Person person);
    public void deletePerson(Long id);
    public Person searchPerson(Long id);
//    public Person editPerson(Person person);
}
