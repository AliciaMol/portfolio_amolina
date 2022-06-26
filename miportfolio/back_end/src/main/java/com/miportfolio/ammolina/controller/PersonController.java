/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolio.ammolina.controller;

import com.miportfolio.ammolina.model.Person;
import com.miportfolio.ammolina.service.IPersonService;
// import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sisita
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    /*mediante una inyeccion de dependencia, conectamos nuestra
    controladora a nuestro servicio, el cual se conecta al 
    repositorio, el cual ,a su vez, se conecta a la base de datos
    De esta manera mantenemos la app separada en multicapas y
    evitamos crear objetos, sino q las relacionamos mediante la 
    inyeccion de dependencias. Asi, la app se vuelve mantenible
    y escalable*/
    @Autowired
    private IPersonService ipersonService; //Es una interface

//    List<Persona> listaPersonas = new ArrayList();
    //A continuacion vamos generando todos los endpoints.
    @PostMapping("/person/new")
    public String addPerson(@RequestBody Person person) {
//        listaPersonas.add(p);
        ipersonService.savePerson(person);
        return "La persona se cargó correctamente.";
    }

    @GetMapping("/person/getall")
    @ResponseBody
    public List<Person> getAllPerson() {
//        return listaPersonas;
        return ipersonService.getAllPerson();
    }

    @DeleteMapping("/person/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
//        listaPersonas.remove(id);
        ipersonService.deletePerson(id);
        return "La persona se eliminó correctamente.";
    }

    @PutMapping("/person/edit/{id}")
    public Person editPerson(@PathVariable Long id,
            @RequestParam("name") String newName,
            @RequestParam("lastname") String newLastName,
            @RequestParam("email") String email,
            @RequestParam("ocupation") String newOcupation,
            @RequestParam("aboutMeDescription") String newAboutMeDesc,
            @RequestParam("imageURL") String newImg){
        Person person = ipersonService.searchPerson(id);
        person.setName(newName);
        person.setLastname(newLastName);
        person.setEmail(email);
        person.setOcupation(newOcupation);
        person.setAboutMeDescription(newAboutMeDesc);
        person.setImageURL(newImg);
        ipersonService.savePerson(person);
        return person;
    }

    @GetMapping("/person/getone")  //@GetMapping("/person/getone/{id}")
    public Person searchPerson() { //searchPerson(@PathVariable Long id) {
        return ipersonService.searchPerson((long)1);
    }
    /* Si quiero buscar por id, agregar lo que difiere de lo comentado,
    ** logre hacerlo funcionar*/
}
